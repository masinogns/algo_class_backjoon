package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 9..
 */
public class 만들기1Test {
    만들기1 application = new 만들기1();

    @Test
    public void test1() throws Exception {
        assertEquals(1, application.solution(2));
        assertEquals(3, application.solution(10));
    }
}