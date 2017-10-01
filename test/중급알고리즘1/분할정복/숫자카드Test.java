package 중급알고리즘1.분할정복;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class 숫자카드Test {

    숫자카드 application = new 숫자카드();

    /**
     * N은 상근이가 가지고 있는 숫자 카드의 갯수
     * ArrayN은 숫자 카드에 적혀있는 숫자
     * M은 숫자 M으로 비교할 숫자 카드의 갯수
     * ArrayM은 이 숫자 카드를 상근이가 가지고 있는지를 찾는거다
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {

        int N = 5;
        int[] ArrayN = new int[]{6,3,2,10,-10};
        int M = 8;
        int[] ArrayM = new int[]{10,9,-5,2,3,4,5,-10};

        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(1,0,0,1,1,0,0,1));
        assertEquals(result, application.solution(N, ArrayN, M, ArrayM));
    }
}