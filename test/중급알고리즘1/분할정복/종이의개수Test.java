package 중급알고리즘1.분할정복;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class 종이의개수Test {
    종이의개수 application = new 종이의개수();

    @Test
    public void test12() throws Exception {
        int size = 9;

        int[] cnt = new  int[3];

        int[][] papers = new int[size][size];

        papers = new int[][]{
                {0, 0, 0, 1, 1, 1, -1, -1, -1},
                {0, 0, 0, 1, 1, 1, -1, -1, -1},
                {0, 0, 0, 1, 1, 1, -1, -1, -1},
                {1, 1, 1, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 1, -1, 0, 1, -1, 0, 1, -1},
                {0, -1, 1, 0, 1, -1, 0, 1, -1},
                {0, 1, -1, 0, 1, -1, 0, 1, -1},

        };

        application.solution(papers,0, 0, size);
//        for (Integer i: application.getCnt())
//            System.out.println(i);
        assertArrayEquals(new int[]{10,12,11}, application.getCnt());
    }
}