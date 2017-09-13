package 기초알고리즘.다이나믹프로그래밍;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 13..
 */
public class 이친수Test {

    이친수 application = new 이친수();

    @Test
    public void name() throws Exception {
        assertEquals(2, application.solution(3));
    }
}