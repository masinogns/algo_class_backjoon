package 기초알고리즘.다이나믹프로그래밍;

/**
 * Created by masinogns on 2017. 9. 13..
 *
 * D[N][L] = 마지막 수가 L일 때 N자리 이친수의 개수
 * L 의 조건들
 *
 *
 */
public class 이친수 {
    public int solution(int N) {

        int[][] D = new int[N+1][2];

        D[1][0] = 0;        // 0으로 시작할 수 없음
        D[1][1] = 1;        // 1로는 시작할 수 있음

        // 이제 1이 2번만 나오지않는 경우의 수만 구하면 된다
        for (int n = 2; n <= N; n++){
            D[n][0] = D[n-1][0]+D[n-1][1];
            D[n][1] = D[n-1][0];
        }

        int ret = 0;
        ret = D[N][0]+D[N][1];

        return ret;
    }
}
