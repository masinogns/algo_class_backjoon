package NHN;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 21..
 */
public class problem2015_4Test {

    problem2015_4 application = new problem2015_4();

    @Test
    public void test1() throws Exception {
        String string = new String("ccc!bbb!aaa");
        String[] strings = new String[]{"aaa","bbb","ccc"};
        assertArrayEquals(strings, application.solution(string));
    }

    @Test
    public void test2() throws Exception {
        String string = new String("http://www.com/");
        String[] strings = new String[]{"com", "http", "www"};
        assertArrayEquals(strings, application.solution(string));
    }
}