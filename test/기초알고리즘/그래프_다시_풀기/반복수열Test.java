package 기초알고리즘.그래프_다시_풀기;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 7..
 */
public class 반복수열Test {

    반복수열 application = new 반복수열();

    @Test
    public void test(){
        assertEquals(74, application.newNumber(57, 2));
    }
    @Test
    public void name() throws Exception {
        int A = 57;
        int P = 2;

        assertEquals(4, application.solution(A, P));
    }
}