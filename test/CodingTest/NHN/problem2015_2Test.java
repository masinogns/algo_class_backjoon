package CodingTest.NHN;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 21..
 */
public class problem2015_2Test {

    @Test
    public void test1() throws Exception {

        problem2015_2 application = new problem2015_2();


        String s1 = "()";
        assertEquals(true, application.solution(s1));
        String s2 = "({[})";
        assertEquals(false, application.solution(s2));
        String s3 = "({)}";
        assertEquals(false, application.solution(s3));
        String s4 = "(a{b|}[...hello])";
        assertEquals(true, application.solution(s4));
        String s10 = "()";
        assertEquals(true, application.solution(s10));
        String s5 = "(())";
        assertEquals(true, application.solution(s5));
        String s6 = "({}[]([{}]))";
        assertEquals(true, application.solution(s6));
        String s7 = "(((";
        assertEquals(false, application.solution(s7));
    }
}