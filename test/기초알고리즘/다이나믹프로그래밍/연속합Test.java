package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 14..
 */
public class 연속합Test {
    연속합 application = new 연속합();

    @Test
    public void name() throws Exception {

        int N = 10;
        int[] A = new int[]{10,-4,3,1,5,6,-35,12,21,-1};
        assertEquals(33, application.solution(N, A));

    }
}