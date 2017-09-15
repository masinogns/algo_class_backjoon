package 중급알고리즘1.그리디;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 14..
 */
public class 배수30Test {

    배수30 application = new 배수30();

    @Test
    public void test1() throws Exception {
        assertEquals(30, application.solution(String.valueOf(30)));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(210, application.solution(String.valueOf(102)));
    }

    @Test
    public void test3() throws Exception {
        assertEquals(-1, application.solution(String.valueOf(2931)));
    }
}