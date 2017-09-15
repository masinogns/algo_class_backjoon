package 중급알고리즘1.그리디;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 14..
 */
public class 병든나이트Test {

    병든나이트 application = new 병든나이트();

    @Test
    public void test1() throws Exception {
        int height = 100;
        int width = 50;
        assertEquals(48, application.solution(height, width));

    }
}