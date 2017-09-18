package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class 가장큰증가하는부분Test {

    @Test
    public void name() throws Exception {
        가장큰증가하는부분 application = new 가장큰증가하는부분();

        int N = 10;
        int[] A = new int[]{
                1, 100, 2, 50, 60, 3, 5, 6, 7, 8
        };
        assertEquals(113, application.solution(N, A));

    }
}