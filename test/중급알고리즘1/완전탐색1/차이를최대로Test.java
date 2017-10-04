package 중급알고리즘1.완전탐색1;

import org.junit.Test;
import 중급알고리즘1.완전탐색1.차이를최대로;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 3..
 */
public class 차이를최대로Test {

    차이를최대로 application = new 차이를최대로();

    @Test
    public void name() throws Exception {
        int N = 6;
        int[] A = new int[]{20,1,15,8,4,10};
        assertEquals(62, application.solution(N, A));
    }
}