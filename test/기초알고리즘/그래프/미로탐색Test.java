package 기초알고리즘.그래프;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 11..
 */
public class 미로탐색Test {

    @Test
    public void name() throws Exception {
        미로탐색 application = new 미로탐색();

        int N = 4;
        int M = 6;

        int[][] map = new int[N][M];

        map = new int[][]{
                {1,0,1,1,1,1},
                {1,0,1,0,1,0},
                {1,0,1,0,1,1},
                {1,1,1,0,1,1}
        };
        assertEquals(15, application.solution(N,M, map));

    }

}