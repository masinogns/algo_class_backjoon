package 중급알고리즘1.그리디;

import java.util.Stack;

/**
 * Created by masinogns on 2017. 9. 14..
 *
 * 수식은 +와 -로만 이루어져있다. == +스택과 -스택으로 나눈다
 * -가 한 번 나오면 그 뒤로는 모두 - 스택에 넣는다
 * -가 나오면 뒤에 연속으로 나오는 +들을 괄호친다 == -스택에 넣는다
 *
 * + 연산자를 만나면
 *  결과를 더해준다
 * - 연산자를 만나면
 *  연산자(-, +)를 만날 때 마다 빼준다
 * 숫자라면 length 길이를 크게한다
 */
public class 잃어버린괄호 {
    public int solution(String N) {


        Stack<Integer> stackPlus = new Stack<>();
        Stack<Integer> stackMinus = new Stack<>();

        for (int i = 0; i < N.length(); i++){
            int length = 0;

            if (N.charAt(i) == '+'){
            }else if (N.charAt(i) == '-'){
            }

            length++;
        }
        return 0;
    }
}
