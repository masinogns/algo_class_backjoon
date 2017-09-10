package 기초알고리즘.다이나믹프로그래밍;

/**
 * Created by masinogns on 2017. 9. 9..
 *
 * 붕어빵 i개를 팔아서 얻을 수 있는 수익이 A[i]일 때
 * D[N] = n개를 모두 판매해서 얻을 수 있는 최대 수익
 */
public class 붕어빵 {
    public int solution(int N, int[] A) {

        int[] D = new int[N+1];

        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= i; j++){
                D[i] = Math.max(D[i-j]+A[j-1], D[i]);
            }
        }

        return D[N];
    }
}
