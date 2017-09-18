package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class 가장긴바이토부분수열Test {

    @Test
    public void name() throws Exception {
        가장긴바이토부분수열 application = new 가장긴바이토부분수열();

        int N = 10;
        int[] A = new int[]{1, 5, 2, 1, 4, 3, 4, 5, 2, 1};

        assertEquals(7, application.solution(N, A));
    }
}