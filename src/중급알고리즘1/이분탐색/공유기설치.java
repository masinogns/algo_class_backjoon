package 중급알고리즘1.이분탐색;

import java.util.Arrays;

/**
 * Created by masinogns on 2017. 10. 2..
 *
 * 문제 너무 애매한거 아님
 */
public class 공유기설치 {
    private int numberOfHouse;
    private int numberOfWifi;
    private int[] housePosition;
    private int maxBetweenDistinct;
    private int ret;

    public int getRet() {
        return ret;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public void setNumberOfWifi(int numberOfWifi) {
        this.numberOfWifi = numberOfWifi;
    }

    public void setHousePosition(int[] housePosition) {
        this.housePosition = housePosition;
    }

    public int[] getHousePosition() {
        return housePosition;
    }

    public void setMaxBetweenDistinct(int[] housePosition) {
        Arrays.sort(housePosition);

        this.maxBetweenDistinct =
                housePosition[housePosition.length-1]-housePosition[0];
    }

    public int getMaxBetweenDistinct() {
        return maxBetweenDistinct;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public int getNumberOfWifi() {
        return numberOfWifi;
    }

    public void solution(int start, int end,
                         int[] housePosition, int numberOfHouse, int numberOfWifi){

        int left = start, right = end;
        int mid = 0;

        while (left <= right){
            mid = (left + right) / 2;

            if (isPossible(housePosition, numberOfWifi, mid)){
                ret = Math.max(ret, mid);
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
    }

    private boolean isPossible(int[] housePosition, int numberOfWifi, int mid) {
        int count = 1;
        Arrays.sort(housePosition);
        int last = housePosition[0];
        for (int house : housePosition){
            if (house - last >= mid){
                count += 1;
                last = house;
            }
        }

        if (numberOfWifi <= count)
            return true;
        
        return false;
    }
}
