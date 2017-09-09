package 기초알고리즘.자료구조1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 8..
 *
 * 
 */
public class 쇠막대기Test {
    쇠막대기 controller = new 쇠막대기();

    @Test
    public void test1() throws Exception {
        assertEquals(17,controller.solution(new String("()(((()())(())()))(())")));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(24, controller.solution(new String("(((()(()()))(())()))(()())")));

    }

    @Test
    public void test3() throws Exception {
        assertEquals(2, controller.solution(new String("(())")));

    }

    @Test
    public void test4() throws Exception {
        assertEquals(3, controller.solution("(()())"));

    }
}