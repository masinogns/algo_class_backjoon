package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 14..
 */
public class 계단오르기Test {
    계단오르기 application = new 계단오르기();

    @Test
    public void name() throws Exception {
        assertEquals(75, application.solution(6, new int[]{10,20,15,25,10,20}));
    }

    @Test
    public void name2() throws Exception {
        assertEquals(75, application.solution2(6, new int[]{10,20,15,25,10,20}));
    }
}