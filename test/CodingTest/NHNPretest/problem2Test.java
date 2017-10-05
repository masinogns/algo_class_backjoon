package CodingTest.NHNPretest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 23..
 */
public class problem2Test {
    
    problem2 application = new problem2();

    @Test
    public void test1() throws Exception {

        String ret = "cspkfcgzin";

        String check = "encrypt";
        String sectretKey = "secretword";
        int lotationNumber = 3;
        String message = "helloworld";
        assertEquals(ret, application.solution(check, sectretKey, lotationNumber, message));
    }

    @Test
    public void test2() throws Exception {

        String ret = "helloworld";


        String check = "decrypt";
        String sectretKey = "secretword";
        int lotationNumber = 3;
        String message = "cspkfcgzin";

        assertEquals(ret, application.solution(check, sectretKey, lotationNumber, message));
    }
}