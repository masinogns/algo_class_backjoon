package 기초알고리즘.수학1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 10..
 */
public class _PrimeNumbeTest {
    _PrimeNumbe application = new _PrimeNumbe();

    @Test
    public void test1() throws Exception {
        assertEquals(true, application.prime(11));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(false, application.prime(4));
    }

    @Test
    public void fasterTest1() throws Exception {
        assertEquals(true, application.fasterPrime(11));
    }

    @Test
    public void fastestTest1() throws Exception {
        assertEquals(true, application.fastestPrime(11));
    }

    @Test
    public void eratoshenesTest() throws Exception {
        assertEquals(true, application.eratoshenes(11));

    }

}