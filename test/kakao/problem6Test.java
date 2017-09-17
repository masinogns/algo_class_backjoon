package kakao;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 16..
 */
public class problem6Test {
    problem6 application = new problem6();

    @Test
    public void test1() throws Exception {
        int M = 4;
        int N = 5;
        String[] board = new String[]{
                "CCBDE", "AAADE", "AAABF", "CCBBF"
        };
        assertEquals(14, application.solution(M, N, board));

    }
}