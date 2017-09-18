package 중급알고리즘1.분할정복;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class 숫자카드2Test {

    숫자카드2 application = new 숫자카드2();

    @Test
    public void test1() throws Exception {

        int N = 10;
        int[] ArrayN = new int[]{6, 3, 2, 10, 10, 10, -10, -10, 7, 3};

        int M = 8;
        int[] ArrayM = new int[]{10, 9, -5, 2, 3, 4, 5, -10};

        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(3, 0, 0, 1, 2, 0, 0, 2));
        assertEquals(result, application.solution(N, ArrayN, M, ArrayM));

    }
}