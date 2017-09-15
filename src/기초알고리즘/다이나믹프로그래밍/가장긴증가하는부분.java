package 기초알고리즘.다이나믹프로그래밍;

/**
 * Created by masinogns on 2017. 9. 14..
 *
 * D[N] = N일 때 가장 긴 증가하는 부분 수열의 길이
 */
public class 가장긴증가하는부분 {
    public int solution(int N, int[] A) {

        // 이렇게 하면 안된다. 왜냐하면 테스트 케이스 2번이 예외임
        int[] D = new int[N+1];

        D[1] = 1;

        for (int n = 2; n <= N; n++){
            if (A[n-2] < A[n-1])
                D[n] = D[n-1] + 1;
            else
                D[n] = D[n-1];
        }
        return D[N];
    }


    public int solution2(int N, int[] A) {

        int[] D = new int[N];

        for (int i = 0; i < N; i++){
            D[i] = 1;
            for (int k = 0; k < i; k++){
                // D[i] < D[k] + 1은 D[i]값이 비교하는 값보다 작을때만 값을 증가시키겠다는 의미 ,
                // 크면 굳이 바꾸면 안되니까 넣어준 조건.
                if (A[k] < A[i] && D[i] < D[k] + 1)
                    D[i] = D[k ]+1;
            }

        }

        int ret = 0;
        for (Integer integer:D)
            ret = Math.max(integer, ret);

        return ret;
    }
}
