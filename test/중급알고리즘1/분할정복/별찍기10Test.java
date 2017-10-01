package 중급알고리즘1.분할정복;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 1..
 */
public class 별찍기10Test {

    @Test
    public void name() throws Exception {
        별찍기10 application = new 별찍기10();

        int N = 27;
        application.setSize(N);
        application.setMap(application.getSize());

        application.solution(0,0, N,1);

        char[][] ret = application.getMap();

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print(ret[i][j]);
            }
            System.out.println();
        }
    }
}