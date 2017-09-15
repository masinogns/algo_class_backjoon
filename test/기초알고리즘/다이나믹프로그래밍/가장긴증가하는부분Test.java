package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 14..
 */
public class 가장긴증가하는부분Test {
    가장긴증가하는부분 application = new 가장긴증가하는부분();

    @Test
    public void name() throws Exception {
        assertEquals(4, application.solution(6, new int[]{
                10,20,10,30,20,50
        }));
    }

    @Test
    public void nameB() throws Exception {
        assertEquals(4, application.solution2(6, new int[]{
                10,20,10,30,20,50
        }));
    }
    @Test
    public void name2B() throws Exception {
        assertEquals(4, application.solution2(7, new int[]{
                30,10,16,40,15,20,30
        }));
    }
    @Test
    public void name2() throws Exception {
        assertEquals(4, application.solution(7, new int[]{
                30,10,16,40,15,20,30
        }));
    }
}