package 중급알고리즘1.완전탐색0;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 3..
 */
public class 다음순열Test {

    다음순열 application = new 다음순열();

    @Test
    public void name() throws Exception {
        int numberOfPermutation = 4;
        int[] permutations = new int[]{
                1,2,3,4
        };

        int[] ret = application.solution(numberOfPermutation, permutations);

        assertArrayEquals(new int[]{1,2,4,3}, ret);
    }
    @Test
    public void name0() throws Exception {
        int numberOfPermutation = 7;
        int[] permutations = new int[]{
                7,2,3,6,5,4,1
        };

        int[] ret = application.solution(numberOfPermutation, permutations);

        assertArrayEquals(new int[]{7,2,4,1,3,5,6}, ret);
    }

    @Test
    public void name1() throws Exception {
        int numberOfPermutation = 5;
        int[] permutations = new int[]{
                5,4,3,2,1
        };

        int[] ret = application.solution(numberOfPermutation, permutations);

        assertArrayEquals(new int[]{-1}, ret);
    }
}