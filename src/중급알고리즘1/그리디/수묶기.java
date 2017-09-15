package 중급알고리즘1.그리디;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by masinogns on 2017. 9. 14..
 *
 * 양수는 큰수끼리 묶어서 곱하고
 * 음수는 작은수끼리 묶어서 곱한다
 *
 * 만약 음수가 하나남고 0이 있다면 0과 남은 음수 하나를 곱해서 없앤다
 */
public class 수묶기 {
    public int solution(int N, int[] numbers) {

        /**
         * 배열을 Sorting한 후에 Plus, Minus, Zero에 맞는 자료구조에 저장한다
         *
         * 이 때 자료구조는 큐와 스택을 이용한다
         * 음수를 곱할 때는 가장 작은 순으로 곱해가야하기 때문에 넣은 순서대로가 가장 작기 때문이다
         * 양수를 곱할 때는 가장 큰 순으로 곱해가야하기 때문에 가장 나중에 넣은게 가장 큰 수이기 때문이다
         * 영은 배열에 있는지 없는지만 검사할 것이기 때문에 isEmpty를 사용할 것이기 때문에 큐 스택 상관없다
         */
        Queue<Integer> MinusQueue = new LinkedList<>();
        Stack<Integer> PlusStack = new Stack<>();
        Stack<Integer> OneStack = new Stack<>();
        Stack<Integer> ZeroStack = new Stack<>();

        Arrays.sort(numbers);

        for (Integer integer : numbers){
            if (integer < 0)
                MinusQueue.offer(integer);
            else if (integer > 1)
                PlusStack.push(integer);
            else if (integer == 1)
                OneStack.push(integer);
            else
                ZeroStack.push(integer);
        }

        /**
         * 큐와 스택 모두 .size()함수가 있다
         * size()를 이용해서 자료구조의 크기를 확인한 다음
         * 2로 나눈 후에 나머지가 있다면 홀수이고 없다면 짝수인 것을 알 수 있다
         * 홀수이면 양수일 경우에는 가장 작은 수 하나나 음수일 경우에는 가장 큰 음수 하나가 남기 때문에
         * 서로 곱할 수 있는 부분이 없다.
         * 그래서 사이즈가 짝수일 때는 짝수인 만큼 곱해주고 홀수일 때는 하나를 남긴다
         *
         * 이 때 가장 작은 음수 하나가 남는다고 할 때
         * 0이 저장된 스택의 사이즈가 비어있지 않는다면 하나 남은 음수의 값을 0과 곱한다고 할 수 있으니
         * restMinus에 0을 넣어준다
         */
        int minusSum = 0, plusSum = 0;
        int restMinus = 0, restPlus = 0;

        if (MinusQueue.size()%2 == 0){
            for (int i = 0; i < MinusQueue.size(); i++)
                minusSum += MinusQueue.poll() * MinusQueue.poll();
        }else {
            for (int i = 0; i < MinusQueue.size()-1; i++)
                minusSum += MinusQueue.poll() * MinusQueue.poll();
            restMinus = MinusQueue.poll();
        }

        if (PlusStack.size()%2 == 0){
            for (int i = 0; i < PlusStack.size(); i++)
                plusSum += PlusStack.pop() * PlusStack.pop();
        }else {
            for (int i = 0; i < PlusStack.size() - 1; i++)
                plusSum += PlusStack.pop() * PlusStack.pop();
            restPlus = PlusStack.pop();
        }

        if (!ZeroStack.isEmpty())
            restMinus = 0;



        return minusSum+plusSum+restMinus+restPlus+OneStack.size();
    }
}
