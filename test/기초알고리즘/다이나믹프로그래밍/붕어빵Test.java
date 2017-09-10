package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 9..
 */
public class 붕어빵Test {
    붕어빵 controller = new 붕어빵();

    @Test
    public void test1() throws Exception {
        assertEquals(10, controller.solution(4, new int[]{1,5,6,7}));

    }
}