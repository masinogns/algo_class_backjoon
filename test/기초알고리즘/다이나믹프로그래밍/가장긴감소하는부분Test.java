package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;
import 기초알고리즘.다이나믹프로그래밍.가장긴감소하는부분;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class 가장긴감소하는부분Test {
    @Test
    public void name() throws Exception {
        가장긴감소하는부분 application = new 가장긴감소하는부분();

        int N = 6;
        int[] A = new int[]{10, 30, 10, 20, 20, 10};

        assertEquals(3, application.solution(N, A));

    }
}