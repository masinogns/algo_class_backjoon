package NHN;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 18..
 */
public class problem4Test {

    problem4 application = new problem4();

    @Test
    public void tes1() throws Exception {
        int N = 3;
        int[] A = new int[]{1,2,3};
        int result = 444;

        assertEquals(result, application.solution(N, A));

    }

    @Test
    public void tes2() throws Exception {
        int N = 5;
        int[] A = new int[]{2,9,24,10,21};
        int result = 102634359;

        assertEquals(result, application.solution(N, A));

    }
}