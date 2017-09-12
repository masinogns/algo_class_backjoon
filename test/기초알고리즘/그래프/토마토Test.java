package 기초알고리즘.그래프;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 12..
 */
public class 토마토Test {
    토마토 application = new 토마토();

    @Test
    public void name() throws Exception {

        //상자의 크기를 나타내는 두 정수
        int N = 4;  // 행
        int M = 6;  // 열

        int[][] tomato = new int[][]{
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,1}
        };

        application.setTomato(tomato);
        assertEquals(8, application.solution(N, M, application.getTomato()));

    }
}