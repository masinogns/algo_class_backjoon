package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 9..
 */
public class 타일링2n2Test {

    타일링2n2 controller = new 타일링2n2();

    @Test
    public void test1() throws Exception {
        assertEquals(3, controller.solution(2));
    }
}