package 기초알고리즘.수학1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 10..
 */
public class GCD합Test {
    GCD합 application = new GCD합();

    @Test
    public void test1() throws Exception {
        assertEquals(70, application.solution(new int[]{10, 20, 30, 40}));

    }

    @Test
    public void test2() throws Exception {
        assertEquals(3, application.solution(new int[] {7, 5, 12}));

    }
}