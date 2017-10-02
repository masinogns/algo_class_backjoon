package 중급알고리즘1.이분탐색;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 2..
 *
 * X로 자르면 N개 이상이 나오나?
 * Yes ==> x 증가
 * No --> x 갑소
 *
 * 1부터 가장 길이가 긴 랜선에서
 */
public class 랜선Test {
    랜선 application = new 랜선();

    @Test
    public void name() throws Exception {
        int K = 4;
        int Max = 11;

        int[] A = new int[]{
                802,743,457,539
        };

        application.setK(K);
        application.setMax(Max);
        application.setArray(A);
        application.findMaxNumberLanLine(
                application.getMax(), application.getArray(),
                application.finsMaxValueInArray(application.getArray()));

        assertEquals(200, application.getRet(), 0);
    }
}