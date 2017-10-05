package CodingTest.NHN;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 18..
 */
public class problem1Test {

    problem1 application = new problem1();

    @Test
    public void test1() throws Exception {
        int N = 6;
        long[] A = new long[]{
                6, 20,34, 8, 38,40
        };

        long[] result = new long[]{
                6,8
        };

        assertArrayEquals(result, application.solution(N, A));
    }

    @Test
    public void test12() throws Exception {
        int N = 7;
        long[] A = new long[]{
                20,16,10,45,30,28,47
        };

        long[] result = new long[]{
                28,30
        };

        assertArrayEquals(result, application.solution(N, A));
    }
}