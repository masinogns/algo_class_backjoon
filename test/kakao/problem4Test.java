package kakao;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 16..
 */
public class problem4Test {
    problem4 application = new problem4();

    @Test
    public void test1() throws Exception {
        String[] timetable = new String[]{
                "08:00",
                "08:01",
                "08:02",
                "08:03"
        };

        int N = 1;
        int T = 1;
        int M = 5;

        assertEquals("09:00", application.solution(N, T, M, timetable));
    }
}