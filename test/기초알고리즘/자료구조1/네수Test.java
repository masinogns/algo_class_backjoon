package 기초알고리즘.자료구조1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 9..
 */
public class 네수Test {

    네수 controller = new 네수();

    @Test
    public void test1() throws Exception {
        assertEquals(4060, controller.solution("10","20","30","40"));

    }
}