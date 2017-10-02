package 중급알고리즘1.이분탐색;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 2..
 */
public class 나무자르기Test {

    나무자르기 application = new 나무자르기();

    @Test
    public void name() throws Exception {
        int numberOfTree = 4;
        int M미터 = 7;

        int[] trees = new int[]{
                20,15,10,17
        };

        application.setNumberOfTree(numberOfTree);
        application.setM(M미터);
        application.setTrees(trees);

        int maxLenght = application.findMaxLength(application.getTrees());

        application.solution(0, maxLenght, application.getM(), application.getTrees());

        assertEquals(15, application.getRet());
    }
}