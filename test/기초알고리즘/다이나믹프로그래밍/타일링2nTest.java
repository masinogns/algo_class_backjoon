package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 9..
 */
public class 타일링2nTest {
    타일링2n controller = new 타일링2n();

    @Test
    public void test1() throws Exception {
        assertEquals(2, controller.solution(2));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(55, controller.solution(9));

    }
}