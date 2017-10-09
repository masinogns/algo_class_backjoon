package 기초알고리즘.그래프_다시_풀기;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 9..
 */
public class 토마토Test {

    토마토 application = new 토마토();

    @Test
    public void name() throws Exception {
        // N은 세로 M은 가로 map[가로][세로]
        int N = 6, M = 4;
        int[][] boxes = new int[][]{
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,1}
        };

        assertEquals(8, application.solution(M, N, boxes));

    }

    @Test
    public void name1() throws Exception {
        // N은 세로 M은 가로 map[가로][세로]
        int N = 2, M = 2;
        int[][] boxes = new int[][]{
                {1,1},
                {1,1}
        };

        assertEquals(0, application.solution(M, N, boxes));

    }

    @Test
    public void name2() throws Exception {
        // N은 세로 M은 가로 map[가로][세로]
        int N = 2, M = 2;
        int[][] boxes = new int[][]{
                {0,0},
                {0,0}
        };

        assertEquals(-1, application.solution(M, N, boxes));

    }
}