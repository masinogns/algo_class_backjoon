package NHN;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 18..
 */
public class problem2Test {
    problem2 application = new problem2();

    @Test
    public void test1() throws Exception {
        int N = 57;

        assertEquals(363, application.solution(N));
    }

    @Test
    public void test12() throws Exception {
        int N = 78;

        assertEquals(-1, application.solution(N));
    }

    @Test
    public void test2() throws Exception {
        int N = 85;

        assertEquals(484, application.solution(N));
    }
}