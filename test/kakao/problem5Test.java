package kakao;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 16..
 */
public class problem5Test {

    problem5 application = new problem5();


    @Test
    public void test1() throws Exception {
        String str1 = "FRANCE";
        String str2 = "french";

        assertEquals(16384, application.solution(str1, str2));
    }

    @Test
    public void test2() throws Exception {
        String str1 = "handshake";
        String str2 = "shake hands";

        assertEquals(65536, application.solution(str1, str2));
    }

    @Test
    public void test3() throws Exception {
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";

        assertEquals(43690, application.solution(str1, str2));
    }

    @Test
    public void test4() throws Exception {
        String str1 = "E=M*C^2";
        String str2 = "e=m*c^2";

        assertEquals(65536, application.solution(str1, str2));
    }

}