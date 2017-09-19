package NHN;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 18..
 */
public class problem3Test {

    problem3 application = new problem3();

    @Test
    public void te1() throws Exception {
        String s = "toast standard bank display book";
        int[] result = new int[]{2,1};

        assertArrayEquals(result, application.solution(s));

    }

    @Test
    public void te2() throws Exception {
        String s = "rookie image plastic mouse project feature apple";
        int[] result = new int[]{3,1};

        assertArrayEquals(result, application.solution(s));

    }

    @Test
    public void te3() throws Exception {
        String s = "fourier linearly wallet algorithm  outdoor";
        int[] result = new int[]{3,2};

        assertArrayEquals(result, application.solution(s));

    }
}