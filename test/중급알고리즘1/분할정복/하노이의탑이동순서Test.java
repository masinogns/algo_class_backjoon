package 중급알고리즘1.분할정복;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 16..
 */
public class 하노이의탑이동순서Test {

    하노이의탑이동순서 application = new 하노이의탑이동순서();

    @Test
    public void name() throws Exception {
        assertEquals(7, application.solution(3));
    }
}