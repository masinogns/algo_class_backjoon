package 중급알고리즘1.그리디;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 12..
 */
public class ATMTest {
    @Test
    public void name() throws Exception {
        ATM application = new ATM();

        assertEquals(32, application.solution(5, new int[]{3,1,4,3,2}));

    }
}