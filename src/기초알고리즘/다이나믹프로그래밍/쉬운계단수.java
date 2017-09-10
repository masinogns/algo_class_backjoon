package 기초알고리즘.다이나믹프로그래밍;

/**
 * Created by masinogns on 2017. 9. 9..
 *
 * 45656이란 수를 보자.
 이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.
 세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.
 N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)

 D[N] = 길이가 N인 총 계단 수
 D[N][L] = 마지막 수가  L인 수에서의 길이가 N인 총 계단의 수
 */

/**
 * Pseduo code
 *
 * D[N][L] = D[N-1][L-1] + D[N-1][L+1]
 */
public class 쉬운계단수 {
    public int solution(int N) {

        int[][] D = new int[N+1][10];

        for (int init = 1; init < 10; init++)
            D[1][init] = 1;


        for (int n = 2; n <= N; n++){
            for (int L = 0; L < 10; L++){
                if (L == 0){
                    D[n][L] = D[n-1][L+1];
                    continue;
                }
                if (L == 9){
                    D[n][L] = D[n-1][L-1];
                    continue;
                }

                D[n][L] = D[n-1][L-1] + D[n-1][L+1];
            }
        }


        int ret = 0;

        for (int i = 0; i < 10; i++){
            ret += D[N][i];
        }
        return ret;
    }
}
