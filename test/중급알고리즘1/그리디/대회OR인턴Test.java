package 중급알고리즘1.그리디;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 14..
 *

 */
public class 대회OR인턴Test {

    대회OR인턴 application = new 대회OR인턴();

    @Test
    public void test1() throws Exception {
        int Girls = 6;
        int Guys = 4;
        int K = 2;

        assertEquals(2, application.solution(Girls, Guys, K));

    }
}