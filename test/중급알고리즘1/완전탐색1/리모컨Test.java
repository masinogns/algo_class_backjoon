package 중급알고리즘1.완전탐색1;

import org.junit.Test;
import 중급알고리즘1.완전탐색1.리모컨;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 3..
 */
public class 리모컨Test {

    리모컨 application = new 리모컨();

    @Test
    public void name() throws Exception {
        String channel = "5457";
        int brokenNumber = 3;
        int[] brokenButtons = new int[]{6,7,8};

        assertEquals(6, application.solution(channel, brokenNumber, brokenButtons));
    }

    @Test
    public void name2() throws Exception {
        String channel = "100";
        int brokenNumber = 5;
        int[] brokenButtons = new int[]{0,1,2,3,4};

        assertEquals(0, application.solution(channel, brokenNumber, brokenButtons));

    }

    @Test
    public void name3() throws Exception {
        String channel = "500000";
        int brokenNumber = 8;
        int[] brokenButtons = new int[]{0,2,3,4,6,7,8,9};

        assertEquals(0, application.solution(channel, brokenNumber, brokenButtons));

    }



}