package 중급알고리즘1.완전탐색1;

import org.junit.Test;
import 중급알고리즘1.완전탐색1.외판원순회2;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 3..
 */
public class 외판원순회2Test {

    외판원순회2 application = new 외판원순회2();

    @Test
    public void name() throws Exception {
        int cites = 4;
        int[][] weight = new int[][]{
                {0,10,15,20},
                {5,0,9,10},
                {6,13,0,12},
                {8,8,9,0}
        };

        assertEquals(35, application.solution(cites, weight));

    }
}