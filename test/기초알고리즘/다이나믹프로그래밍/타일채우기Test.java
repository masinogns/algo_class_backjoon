package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class 타일채우기Test {
    타일채우기 application = new 타일채우기();

    @Test
    public void name() throws Exception {
        int N = 2;
        assertEquals(3, application.solution(2));

    }
}