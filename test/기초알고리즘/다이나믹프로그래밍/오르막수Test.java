package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 13..
 */
public class 오르막수Test {
    오르막수 application = new 오르막수();

    @Test
    public void name() throws Exception {
        assertEquals(10, application.solution(1));
        assertEquals(220, application.solution(3));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(55, application.solution(2));
    }
}