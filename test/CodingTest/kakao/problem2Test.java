package CodingTest.kakao;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 16..
 */
public class problem2Test {

    problem2 application = new problem2();

    @Test
    public void test1() throws Exception {
        String dartResult = "1S2D*3T";

        assertEquals(37, application.solution(dartResult));
    }

    @Test
    public void test2() throws Exception {
        String dartResult = "1D2S#10S";

        assertEquals(9, application.solution(dartResult));
    }

    @Test
    public void test3() throws Exception {
        String dartResult = "1D2S0T";

        assertEquals(3, application.solution(dartResult));
    }

    @Test
    public void test4() throws Exception {
        String dartResult = "1S*2T*3S";

        assertEquals(23, application.solution(dartResult));
    }


    @Test
    public void test5() throws Exception {
        String dartResult = "1D#2S*3S";

        assertEquals(5, application.solution(dartResult));
    }



}