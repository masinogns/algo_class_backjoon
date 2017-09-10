package 기초알고리즘.다이나믹프로그래밍;

/**
 * Created by masinogns on 2017. 9. 9..
 *
 * DP[N] = N을 1로 만드는데 필요한 연산의 최소 값
 *
 * */
public class 만들기1 {
    public int solution(int N) {
        int[] D = new int[N+1];

        D[1] = 0;

        for (int i = 2; i <= N; i++){

            D[i] = D[i-1] + 1;

            if (i % 2 == 0)
                D[i] = Math.min(D[i], D[i/2]+1);

            if (i % 3 == 0)
                D[i] = Math.min(D[i], D[i/3]+1);
        }

        return D[N];
    }
}
