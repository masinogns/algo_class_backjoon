package 중급알고리즘1.완전탐색0;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 3..
 */
public class 순열의순서Test {

    순열의순서 application = new 순열의순서();


    @Test
    public void name() throws Exception {
        int N = 4;

        int Problem = 1;

        int[] whatPermutation = new int[]{3};

        ArrayList<Integer> ret = application.solution(N, Problem, whatPermutation);

        assertEquals(new int[]{1,3,2,4}, ret);
    }

    @Test
    public void name2() throws Exception {
        int N = 4;

        int Problem = 2;

        int[] whatPosition = new int[]{1,3,2,4};

        ArrayList<Integer> ret = application.solution(N, Problem, whatPosition);
    }
}