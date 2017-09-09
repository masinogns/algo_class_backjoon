package 중급알고리즘1.그리디;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 9..
 */
public class _예제_1Test {

    _예제_1 controller = new _예제_1();

    @Test
    public void test1() throws Exception {
        assertEquals(5, controller.solution(760));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(5, controller.solution2(760));
    }
}