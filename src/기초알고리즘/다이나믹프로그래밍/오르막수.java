package 기초알고리즘.다이나믹프로그래밍;

/**
 * Created by masinogns on 2017. 9. 13..
 *
 * D[N][L] : 길이가 N이고 마지막 수가 L일 때의 오르막 수의 개수
 *
 * D[N][L] = sigma D[N-1][0~L]
 */
public class 오르막수 {
    public int solution(int N) {

        int[][] D = new int[N+1][10];

        // 초기화
        for (int i = 0; i < 10; i++){
            D[1][i] = 1;
        }

        for (int n = 2; n <= N; n++){
            for (int L = 0; L < 10; L++){
                for (int k = 0; k <= L; k++){
                    D[n][L] += D[n-1][k];
                }
            }
        }

        int ret = 0, mod = 10007;
        for (int i = 0; i < 10; i++){
            ret += D[N][i];
        }


        return ret%mod;
    }
}
