package 기초알고리즘.그래프_다시_풀기;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 9..
 */
public class 미로탐색Test {

    미로탐색 application = new 미로탐색();

    @Test
    public void name() throws Exception {
        int N = 4; int M = 6;

        String[] map = new String[]{
                "101111",
                "101010",
                "101011",
                "111011"
        };
        int[][] makeMap = application.makeMap(N,M,map);

        assertEquals(15, application.solution(N, M, makeMap));

    }
}