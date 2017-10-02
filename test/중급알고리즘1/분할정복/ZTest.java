package 중급알고리즘1.분할정복;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 2..
 */
public class ZTest {

    Z application = new Z();

    @Test
    public void name() throws Exception {
        int N = 2;
        int X = 3, Y = 1;

        findZPosition(N);
        int[][] map = application.getMap();
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[0].length; j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        assertEquals(11, application.getPosition(X,Y));
    }

    @Test
    public void name2() throws Exception {
        int N = 3;
        int X = 7, Y = 7;

        findZPosition(N);

        int[][] map = application.getMap();
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[0].length; j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        assertEquals(63, application.getPosition(X, Y));
    }

    private void findZPosition(int n) {
        application.setN(n);
        application.setMap(n);

        application.solution(0, 0, (int) Math.pow(2, n), 0);
    }
}