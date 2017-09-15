package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 14..
 */
public class 스티커Test {

    스티커 application = new 스티커();

    @Test
    public void name() throws Exception {
        assertEquals(260, application.solution(5, new int[][]{
                {50,10,100,20,40},
                {30,50,70,10,60}
        }));
    }

    @Test
    public void name2() throws Exception {
        assertEquals(290, application.solution(7, new int[][]{
            {10, 20, 10, 50, 100, 20, 40},
            {20, 40, 30, 50, 60, 20, 80}
        }));
    }


}