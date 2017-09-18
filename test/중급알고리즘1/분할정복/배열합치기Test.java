package 중급알고리즘1.분할정복;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class 배열합치기Test {

    배열합치기 application = new 배열합치기();

    @Test
    public void name() throws Exception {
        int N = 2, M = 2;
        int[] a = new int[]{3,5};
        int[] b = new int[]{2,9};

        int[] result = new int[]{2, 3, 5, 9};
        assertArrayEquals(result, application.solution(N, M, a, b));
    }

    @Test
    public void name2() throws Exception {
        int N = 2, M = 1;
        int[] a = new int[]{4,7};
        int[] b = new int[]{1};

        int[] result = new int[]{1,4,7};
        assertArrayEquals(result, application.solution(N, M, a, b));
    }

    @Test
    public void name3() throws Exception {
        int N = 4, M = 3;
        int[] a = new int[]{2,3,5,9};
        int[] b = new int[]{1,4,7};

        int[] result = new int[]{1,2,3,4,5,7,9};
        assertArrayEquals(result, application.solution(N, M, a, b));
    }
}