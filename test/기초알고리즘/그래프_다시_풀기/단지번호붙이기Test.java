package 기초알고리즘.그래프_다시_풀기;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 9..
 */
public class 단지번호붙이기Test {

    단지번호붙이기 application = new 단지번호붙이기();

    @Test
    public void name() throws Exception {
        int mapSize = 7;
        int[][] map = new int[][]{
                {0,1,1,0,1,0,0},
                {0,1,1,0,1,0,1},
                {1,1,1,0,1,0,1},
                {0,0,0,0,1,1,1},
                {0,1,0,0,0,0,0},
                {0,1,1,1,1,1,0},
                {0,1,1,1,0,0,0}
        };

        application.solution(mapSize, map);
        assertEquals(3, application.getTotal());
    }
}