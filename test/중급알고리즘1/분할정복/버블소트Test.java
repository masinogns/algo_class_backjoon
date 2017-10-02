package 중급알고리즘1.분할정복;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 2..
 */
public class 버블소트Test {
    버블소트 application = new 버블소트();

    @Test
    public void name() throws Exception {
        int N = 3;
        int[] A = new int[]{3,2,1};

        assertEquals(3,getAnswer(N, A));
    }

    @Test
    public void name1() throws Exception {
        int N = 4;
        int[] A = new int[]{1,5,2,3};

        assertEquals(2,getAnswer(N, A));
    }

    @Test
    public void name2() throws Exception {
        int N = 7;
        int[] A = new int[]{5,3,2,9,7,4,1};

        assertEquals(13,getAnswer(N, A));
    }

    @Test
    public void name3() throws Exception {
        int N = 4;
        int[] A = new int[]{5,3,2,1};

        assertEquals(6,getAnswer(N, A));
    }


    private long getAnswer(int n, int[] a) {
        application.setA(a);
        application.solution(0, n -1);
        return application.getCount();
    }
}