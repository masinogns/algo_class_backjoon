package 기초알고리즘.다이나믹프로그래밍;

/**
 * Created by masinogns on 2017. 9. 14..
 *
 * D[i][j] = i번째 계단에 올라갔을 때 최대 점수
 * i번재 계단은 j개 연속해서 올라 온 계단이다
 *
 * N번째 계단을 오를 때
 *  jump 1해서 n을 오른 계단일 때, N-1번째 계단은 jump 2해서 오른 계단이어야 한다
 *  jump 2해서 n을 오른 계단일 때, N-2번째 계단은 jump 1이거나 jump 2인 것 중 최대로 오른 계단이어야 한다
 *
 *
 *  1개 연속이라는 말은 2칸을 한 번에 올라왔다는 말이다. N[i-2]는 그전에 한개나 두개일수잇다
 *  2개 연속이라는 말은 1칸을 2 번 올라왔다는 말이다
 */
public class 계단오르기 {

    public static final int ONESTEP= 0;
    public static final int TWOSTEP = 1;

    public int solution(int N, int[] A) {
        int[][] D = new int[N+1][2];

        D[1][ONESTEP] = A[0];
        D[1][TWOSTEP] = 0;

        for (int n = 2; n <= N; n++){

            D[n][ONESTEP] = Math.max(D[n-2][ONESTEP], D[n-2][TWOSTEP]) + A[n-1];
            D[n][TWOSTEP] = D[n-1][ONESTEP] + A[n-1];

        }

        return Math.max(D[N][ONESTEP], D[N][TWOSTEP]);
    }

    /**
     * 이게 더 직관적이다
     */

    public int solution2(int N, int[] A){
        int[] D = new int[N+1];

        D[1] = A[0];
        D[2] = A[0]+A[1];

        for (int i = 3; i <= N; i++){
            D[i] = Math.max(D[i-2]+A[i-1], D[i-3]+A[i-1]+A[i-2]);
        }

        return D[N];
    }
}
