package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 9..
 */
public class 더하기123Test {
    더하기123 controller = new 더하기123();

    @Test
    public void test1() throws Exception {
        assertEquals(7, controller.solution(7));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(44, controller.solution(7));

    }
}