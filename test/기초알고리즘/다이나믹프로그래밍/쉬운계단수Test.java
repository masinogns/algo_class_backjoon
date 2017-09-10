package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 9..
 */
public class 쉬운계단수Test {
    쉬운계단수 controller = new 쉬운계단수();

    @Test
    public void test1() throws Exception {
        assertEquals(9, controller.solution(1));
        assertEquals(17, controller.solution(2));

    }
}