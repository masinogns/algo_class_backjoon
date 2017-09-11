package 기초알고리즘.수학1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 10..
 */

public class GCDTest {
    _GCD app = new _GCD();

    @Test
    public void test1() throws Exception {
        assertEquals(8, app.gcdUsingFor(24, 16));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(8, app.gcdUsingRecursion(24, 16));
    }
}