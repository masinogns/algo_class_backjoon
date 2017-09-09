package 기초알고리즘.자료구조1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by masinogns on 2017. 9. 9..
 *
 * Queue 2개를 사용한다
 *
 */
public class 조세퍼스 {
    /**
     *
     * @param N N명의 사람
     * @param M 몇번째 사람을 제거할 것인지
     * @return 제거된 순서 배열 리턴
     */

    public int[] solution(int N, int M) {

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();

        for (int i = 1; i <= N; i++)
            queue.offer(i);

        while (!queue.isEmpty()){
            for (int i = 0; i < M; i++){
                if (i == M-1)
                    result.offer(queue.poll());
                else
                    queue.offer(queue.poll());
            }
        }


        int[] ret = new int[N];
        for (int i = 0; i < N; i++) {
            ret[i] = result.poll();
        }


        return ret;
    }
}
