package 중급알고리즘1.분할정복;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class _이분탐색Test {

    _이분탐색 application = new _이분탐색();

    @Test
    public void test1() throws Exception {
        assertEquals(3,application.search(new int[]{1,3,3,3,3}, 3));
    }
}