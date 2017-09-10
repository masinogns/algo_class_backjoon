package 기초알고리즘.다이나믹프로그래밍;

/**
 * Created by masinogns on 2017. 9. 9..
 *
 * D[N] = 2*N의 직사각형을 채우는 방법의 수
 */
public class 타일링2n {
    public int solution(int N) {

        int[] D = new int[N+1];

        D[1] = 1;
        D[2] = 2;

        for (int i = 3; i <= N; i++){
            D[i] = D[i-1] + D[i-2];
        }

        return D[N];
    }

}
