package 기초알고리즘.다이나믹프로그래밍;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class 가장큰증가하는부분 {
    public int solution(int n, int[] a) {
        int[] D = new int[n];

        for (int i = 0; i < n; i++){
            D[i] = a[i];
            for (int k = 0; k < i; k++){
                if (a[k] < a[i] && D[i] < D[k] + a[i]){
                    D[i] = D[k] + a[i];
                }
            }
        }

        int ret = 0;
        for (Integer integer : D)
            ret = Math.max(integer, ret);
        return ret;
    }
}
