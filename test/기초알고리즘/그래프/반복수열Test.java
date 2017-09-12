package 기초알고리즘.그래프;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 11..
 */
public class 반복수열Test {
    @Test
    public void name() throws Exception {
        반복수열 application = new 반복수열();

        assertEquals(4, application.solution(57, 2));
    }
}