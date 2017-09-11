package 기초알고리즘.수학1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 10..
 */
public class _GoldbachConjectureTest {
    _GoldbachConjecture application = new _GoldbachConjecture();

    @Test
    public void test1() throws Exception {
        assertEquals(true, application.goldbach(134));
    }
}