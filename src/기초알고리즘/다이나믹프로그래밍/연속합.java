package 기초알고리즘.다이나믹프로그래밍;

/**
 * Created by masinogns on 2017. 9. 14..
 *
 * D[N] = N까지의 수열에서 연속된 합의 최대값
 *
 * D[i] = A[i]로 끝나는 최대 연속합
 *      1. A[i-1]로 끝나는 연속합에 포함 D[i-1]+A[i]
 *      2. 새로운 A[i]
 */
public class 연속합 {
    public int solution(int N, int[] A) {

        int[] D = new int[N+1];
        D[1] = A[0];

        for (int n = 2; n <= N; n++){
            D[n] = Math.max(D[n-1]+A[n-1] , A[n-1]);
        }

        int ret = 0;
        for (Integer integer : D)
            ret = Math.max(integer, ret);
        return ret;
    }
}
