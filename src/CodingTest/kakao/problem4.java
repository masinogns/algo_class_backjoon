package CodingTest.kakao;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by masinogns on 2017. 9. 16..
 */
public class problem4 {
    /**
     *
     * @param n 셔틀 운행 횟수 n회
     * @param t 셔틀 운행 간격 t분 간격으로 도착한다
     * @param m 셔틀에 최대 m명의 승객이 탈 수 있다
     * @param timetable 대기열에 서는 시간
     * @return 콘이 셔틀을 타고 사무실로 갈 수 있는 도착 시간 중 제일 늦은 시간
     */
    public String solution(int n, int t, int m, String[] timetable) {

        String answer = "";
        String startTime = "09:00";

        Queue<String>[] queue = new Queue[n];
        for (int i = 0; i < m; i++){
            queue[i] = new LinkedList<>();
        }

        Arrays.sort(queue);

        for (String s : queue[0])
            System.out.print(s+" ");

        return null;
    }
}
