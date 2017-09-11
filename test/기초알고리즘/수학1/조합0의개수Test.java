package 기초알고리즘.수학1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 10..
 */
public class 조합0의개수Test {

    @Test
    public void test1() throws Exception {
        조합0의개수 application = new 조합0의개수();

        assertEquals(2, application.solution(25, 12));

    }
}