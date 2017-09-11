package 기초알고리즘.수학1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 10..
 */
public class GCDAndLCMTest {
    GCDAndLCM application = new GCDAndLCM();

    @Test
    public void test1() throws Exception {
        assertEquals(6, application.gcd(24, 18));
        assertEquals(72, application.lcm(24, 18));

    }
}