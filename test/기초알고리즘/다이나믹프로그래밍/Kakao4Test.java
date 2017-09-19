package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 16..
 */
public class Kakao4Test {

    Kakao4 application = new Kakao4();

    @Test
    public void name() throws Exception {
        int[][] array = new int[][]{
                {0,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {0,0,1,0}
        };

        assertEquals(9, application.solution(array));
    }
}