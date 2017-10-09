package 기초알고리즘.그래프_다시_풀기;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 9..
 */
public class 섬의개수Test {

    섬의개수 application = new 섬의개수();

    @Test
    public void name() throws Exception {
        int width = 2;
        int height = 2;

        int[][] map = new int[][]{
                {0,1},
                {1,0}
        };

        assertEquals(1, application.solution(width, height, map));
    }

    @Test
    public void name1() throws Exception {
        int width = 3;
        int height = 2;

        int[][] map = new int[][]{
                {1,1,1},
                {1,1,1}
        };

        assertEquals(1, application.solution(width, height, map));
    }

    @Test
    public void name2() throws Exception {
        int width = 5;
        int height = 4;

        int[][] map = new int[][]{
                {1,0,1,0,0},
                {1,0,0,0,0},
                {1,0,1,0,1},
                {1,0,0,1,0}
        };

        assertEquals(3, application.solution(width, height, map));
    }

}