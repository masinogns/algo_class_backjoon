package 중급알고리즘1.그리디;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 9..
 *
 *
 입력====
 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

 둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다.
 (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

 출력====
 첫째 줄에 K원을 만드는데 필요한 동전 개수의 최소값을 출력한다.

 */
public class 동전0Test {

    동전0 controller = new 동전0();

    @Test
    public void test1() throws Exception {
//        controller.setN(10);        // 동전의 가치를 배열 설정
        controller.setK(4200);      // 동전의 가치의 합을 K로 만들려고 한다

        int[] A = new int[]{1,5,10,50,100,500,1000,5000,10000,50000};

        assertEquals(6, controller.solution(controller.getK(), A));
    }

    @Test
    public void test2() throws Exception {
//        controller.setN(10);        // 동전의 가치를 배열 설정
        controller.setK(4790);      // 동전의 가치의 합을 K로 만들려고 한다

        int[] A = new int[]{1,5,10,50,100,500,1000,5000,10000,50000};

        assertEquals(12, controller.solution(controller.getK(), A));
    }
}