package 중급알고리즘1.그리디;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by masinogns on 2017. 9. 14..
 *
 * 양수 N이 있다
 * 양수 N에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다
 * 없다면 -1을 출력한다.
 *
 * 맨 마지막 자리가 0이면서 모든 자릿수들의 합이 3의 배수이면 30의 배수가 될 수 있다
 * 즉 0을 최소한 1개 포함하고 있으며 모든 자릿수의 합이 3의 배수이면 30의 배수가 될 수 있다
 */
public class 배수30 {
    public int solution(String N) {

        char[] chars = N.toCharArray();

        int[] sum = new int[chars.length];
        for (int i = 0; i < chars.length; i++){
            sum[i] = chars[i] - '0';
        }

        Arrays.sort(sum);


        int zeroIsExist = 0, ret = 0;
        for (Integer integer : sum){
            if (integer == 0)
                zeroIsExist++;

            ret += integer;
        }

        Stack<Integer> reverse = new Stack<>();
        String s= "";
        if (ret%3 == 0 && zeroIsExist > 0){
            for (Integer integer : sum)
                reverse.push(integer);

            for (int i = 0; i <= reverse.size(); i++)
                s += reverse.pop().toString();

        }else return -1;


        return Integer.parseInt(s);
    }
}
