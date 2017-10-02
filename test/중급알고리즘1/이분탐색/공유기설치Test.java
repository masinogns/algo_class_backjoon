package 중급알고리즘1.이분탐색;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 2..
 */
public class 공유기설치Test {

    공유기설치 application = new 공유기설치();

    @Test
    public void name() throws Exception {
        int numberOfHouse = 5;
        int numberOfWifi = 3;
        int[] housePosition = new int[]{
                1,2,8,4,9
        };


        application.setNumberOfHouse(numberOfHouse);
        application.setNumberOfWifi(numberOfWifi);
        application.setHousePosition(housePosition);
        application.setMaxBetweenDistinct(application.getHousePosition());

        int maxBetweenDist = application.getMaxBetweenDistinct();

        application.solution(0, maxBetweenDist,
                application.getHousePosition(),
                application.getNumberOfHouse(),
                application.getNumberOfWifi()
        );

        assertEquals(3, application.getRet());


    }
}