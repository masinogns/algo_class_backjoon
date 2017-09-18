package 기초알고리즘.다이나믹프로그래밍;

import java.util.Stack;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class 가장긴감소하는부분 {
    public int solution(int n, int[] a) {
        int[] D = new int[n];
        Stack<Integer> reverse = new Stack<>();

        for (Integer integer : a){
            reverse.push(integer);
        }

        for (int i = 0; i < n; i++){
            a[i] = reverse.pop();
        }

        for (int i = 0; i < n; i++){
            D[i] = 1;
            for (int j = 0; j < i; j++){
                if (a[j] < a[i] && D[i] < D[j] + 1){
                    D[i] = D[j] + 1;
                }
            }
        }

        int ret = 0;
        for (Integer integer : D)
            ret = Math.max(ret, integer);

        return ret;
    }
}
