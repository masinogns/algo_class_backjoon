package 기초알고리즘.다이나믹프로그래밍;

/**
 * Created by masinogns on 2017. 9. 13..
 *
 *
 * 아이디어 :
 * D[N][0] nothing 아무것도 안뜯었을 때
 *      = max(nothing, upper, lower)
 * D[N][1] upper 위에거 뜯었을 때
 *      = max(nothing, lower) + A[N][1] upper
 * D[N][2] lower 밑에거 뜯었을 때
 *      = max(noting, upper) + A[N]0]
 *
 * D[N] : 길이가 N인 스티거의 최대 합
 *      = max(nothing, upper, lower)
 */

public class 스티커 {


    public static final int UPPER = 0;
    public static final int LOWER = 1;
    public static final int NOTHING = 2;

    public int solution(int N, int[][] A) {

        int[][] D = new int[N+1][3];

        D[1][NOTHING] = 0;
        D[1][UPPER] = A[UPPER][0];
        D[1][LOWER] = A[LOWER][0];

        for (int n = 2; n <= N; n++){
            D[n][NOTHING] = Math.max(Math.max(D[n-1][NOTHING], D[n-1][UPPER]), D[n-1][LOWER]);
            D[n][UPPER] = Math.max(D[n-1][NOTHING], D[n-1][LOWER]) + A[UPPER][n-1];
            D[n][LOWER] = Math.max(D[n-1][NOTHING], D[n-1][UPPER]) + A[LOWER][n-1];
        }

        int ret = Math.max(Math.max(D[N][NOTHING], D[N][UPPER]), D[N][LOWER]);

        return ret;
    }
}
