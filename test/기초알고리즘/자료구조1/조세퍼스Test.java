package 기초알고리즘.자료구조1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 9..
 */
public class 조세퍼스Test {
    조세퍼스 controller = new 조세퍼스();

    @Test
    public void test1() throws Exception {
        assertArrayEquals(new int[]{3, 6, 2, 7, 5, 1, 4} , controller.solution(7, 3));
    }
}