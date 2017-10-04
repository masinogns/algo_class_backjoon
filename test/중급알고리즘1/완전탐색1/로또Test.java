package 중급알고리즘1.완전탐색1;

import org.junit.Test;
import 중급알고리즘1.완전탐색1.로또;

/**
 * Created by masinogns on 2017. 10. 4..
 */
public class 로또Test {

    로또 application = new 로또();

    @Test
    public void name() throws Exception {

        int K = 7;
        int[] A = new int[]{
                1,2,3,4,5,6
        };
//        application.solution(K, A);
        application.run();
    }
}