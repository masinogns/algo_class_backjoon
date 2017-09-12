package 기초알고리즘.그래프;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 11..
 *
 * 1은 집이 있는 곳을 , 0은 집이 없는 곳을
 */
public class 단지번호붙이기Test {

    @Test
    public void name() throws Exception {
        단지번호붙이기 application = new 단지번호붙이기();

        int MapSize = 7;
        int[][] Map = new int[7+1][7+1];

        Map = new int[][]{
                {0,1,1,0,1,0,0},
                {0,1,1,0,1,0,1},
                {1,1,1,0,1,0,1},
                {0,0,0,0,1,1,1},
                {0,1,0,0,0,0,0},
                {0,1,1,1,1,1,0},
                {0,1,1,1,0,0,0}
        };

        assertEquals(3, application.solution(MapSize, Map));
    }
}