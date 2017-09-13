package 중급알고리즘1.그리디;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 9..
 *
 * 입력
 첫째 줄에 회의의 수 n(1<=n<=100,000)이 주어진다.
 둘째 줄부터 n+1 줄까지 각 회의의 정보가 주어지는데 이것은 공백을 사이에 두고 회의의 시작시간과 끝나는 시간이 주어진다.
 시작 시간과 끝나는 시간은 2^31-1보다 작거나 같은 자연수 또는 0이다.

 출력
 첫째 줄에 최대 사용할 수 있는 회의 수를 출력하여라.
 */
public class 회의실배정Test {
    회의실배정 controller = new 회의실배정();

    @Test
    public void test1() throws Exception {
        int n = 11;
        int[][] numberMeetings = new int[11][2];
        numberMeetings = new int[][]{
                {1,4}, {3,5}, {0,6}, {5,7},{3,8},{5,9},{6,10},{8,11},{8,12},{2,13},{12,14}
        };
        assertEquals(4, controller.solution(n, numberMeetings));
    }
}
