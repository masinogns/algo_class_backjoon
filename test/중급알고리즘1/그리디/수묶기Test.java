package 중급알고리즘1.그리디;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 14..
 */
public class 수묶기Test {
    수묶기 application = new 수묶기();

    @Test
    public void test1() throws Exception {
        int N = 4;
        int[] numbers = new int[]{
                -1,2,1,3
        };
        assertEquals(6, application.solution(4, numbers));

    }
}