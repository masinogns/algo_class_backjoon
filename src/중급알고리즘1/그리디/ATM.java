package 중급알고리즘1.그리디;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by masinogns on 2017. 9. 12..
 *
 * i는 1부터 N까지이다
 * time[people] i 번째 사람이 돈을 인출하는데 걸리는 시간은 time[i]이다
 * 앞사람 기다리고 그다음 사람이 뽑을 수 있고 그 다다음사람은 앞사람과 그 다음사람이 뽑는걸 기다리고 뽑아야한다
 *
 *
 * 시간이 가장 적게걸리는 사람부터 돈을 뽑게하면 된다
 * 즉 time의 값을 정렬한 다음
 * ArrayList.add(time[i])를 해준다
 *
 * sum += time[index] 는 현재 가지고 있느 값이 되고
 * total += sum 은 한 사람이 기다리는 시간이 된다
 *
 * 그리드 알고리즘은 증명을 해야한다
 */

public class ATM {
    public int solution(int people, int[] time) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        Arrays.sort(time);

        int sum = 0, total = 0;

        for (int k = 0; k < people ; k++){
            sum += time[k];
            total += sum;
        }

        return total;
    }
}
