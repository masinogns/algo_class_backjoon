package 기초알고리즘.다이나믹프로그래밍;

/**
 * Created by masinogns on 2017. 9. 14..
 *
 * D[N] = N일 때 가장 긴 증가하는 부분 수열의 길이
 *
 * D[i] = .... A[j], A[i]
 * D[j] = .... A[j] ; A[j]를 마지막으로 하는 수열의 가장 큰 값 + 1
 *
 * D[i] = max(D[j]) + 1; j < i; A[j] < A[i]
 *
 *
 */
public class 가장긴증가하는부분 {

    public int solution2(int N, int[] A) {

        int[] D = new int[N];

        for (int i = 0; i < N; i++){
            D[i] = 1;       // 이 부분에서 저장을 해줘서 밑에 if문에서 D[i] < D[k] +1부분이 가능하다
            for (int k = 0; k < i; k++){
                // D[i] < D[k] + 1은 D[i]값이 비교하는 값보다 작을때만 값을 증가시키겠다는 의미 ,
                // 크면 굳이 바꾸면 안되니까 넣어준 조건.
                if (A[k] < A[i] && D[i] < D[k] + 1)
                    D[i] = D[k]+1;
            }
        }

        int ret = 0;
        for (Integer integer:D)
            ret = Math.max(integer, ret);

        return ret;
    }
}
