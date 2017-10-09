package 기초알고리즘.정렬;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 9..
 */
public class 좌표정렬하기Test {

    좌표정렬하기 application = new 좌표정렬하기();

    @Test
    public void name() throws Exception {
        int numberOfPoint = 5;

        int[][] points = new int[][]{
                {3,4},
                {1,1},
                {1,-1},
                {2,2},
                {3,3}
        };

        Positions[] positions = application.makePositions(numberOfPoint, points);
        application.sort(positions);
    }
}