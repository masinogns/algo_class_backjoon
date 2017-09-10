package 기초알고리즘.다이나믹프로그래밍;

/**
 * Created by masinogns on 2017. 9. 9..
 */
public class 더하기123 {
    public int solution(int N) {

        int[] D = new int[N+1];

        D[1] = 1;
        D[2] = 2;
        D[3] = 4;

        for (int i = 4; i <= N; i++){
            D[i] = D[i-1] + D[i-2] + D[i-3];
        }

        return D[N];
    }
}
