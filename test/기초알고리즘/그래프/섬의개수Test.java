package 기초알고리즘.그래프;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 11..
 */
public class 섬의개수Test {
    섬의개수 application = new 섬의개수();

    @Test
    public void name() throws Exception {
        int width = 1;
        int height = 1;

        int[][] map = new int[width][height];

        map = new int[][] {
                {0}
        };

        // 섬의 개수를 출력한다
        assertEquals(0, application.solution(width, height, map));
    }

    @Test
    public void name2() throws Exception {
        int width = 2;
        int height = 2;

        int[][] map = new int[width][height];

        map = new int[][] {
                {0,1},
                {1,0}
        };

        // 섬의 개수를 출력한다
        assertEquals(1, application.solution(width, height, map));
    }

    @Test
    public void name3() throws Exception {
        int width = 3;
        int height = 2;

        int[][] map = new int[width][height];

        map = new int[][] {
                {1,1,1},
                {1,1,1}
        };

        // 섬의 개수를 출력한다
        assertEquals(1, application.solution(width, height, map));
    }

    @Test
    public void name4() throws Exception {
        int width = 5;
        int height = 4;

        int[][] map = new int[width][height];

        map = new int[][] {
                {1,1,1,0,1},
                {1,0,1,0,1},
                {1,0,1,0,1},
                {1,0,0,1,0}
        };

        // 섬의 개수를 출력한다
        assertEquals(1, application.solution(width, height, map));
    }

    @Test
    public void name5() throws Exception {
        int width = 5;
        int height = 5;

        int[][] map = new int[width][height];

        map = new int[][] {
                {1,1,1,0,1},
                {1,0,1,0,1},
                {1,0,1,0,1},
                {1,0,1,0,1},
                {1,0,1,1,1}
        };

        // 섬의 개수를 출력한다
        assertEquals(1, application.solution(width, height, map));
    }
}