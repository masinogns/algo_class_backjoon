package 중급알고리즘1.완전탐색1;

import org.junit.Test;
import 중급알고리즘1.완전탐색1.EMS;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 3..
 */
public class EMSTest {

    EMS application = new EMS();

    @Test
    public void name() throws Exception {
        int[] EMS = new int[]{1, 16, 16};

        int ret = application.solution(EMS);

        assertEquals(16, ret);
    }

    @Test
    public void name2() throws Exception {
        assertEquals(1, application.solution(new int[]{1,1,1}));
    }

    @Test
    public void name3() throws Exception {
        assertEquals(5266, application.solution(new int[]{1,2,3}));
    }

    @Test
    public void name4() throws Exception {
        assertEquals(7980, application.solution(new int[]{15, 28, 19}));
    }
}