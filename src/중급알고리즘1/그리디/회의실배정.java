package 중급알고리즘1.그리디;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by masinogns on 2017. 9. 9..
 *
 * 아이디어 :
 * 일찍 끝나는 회의부터 배정하면 된다.
 * 일찍 끝나는 회의를 먼저 배정하면 회의를 더 많이 할 수 있을 것이다
 *
 * 까다로운 점 ; 회의의 시작 시간과 끝나는 시간이 같을 수도 있다
 *
 *
 * 회의들을 끝 시간을 기준으로 오름차순으로 정렬한 뒤 처음의 끝 시간을 max로 잡고 반복하면서
 * max값과 다른 회의의 시작 시간을 비교해줘서 max값 이상이면 다시 max를 회의의 끝시간으로 잡는다.
 *
 * http://cwondev.tistory.com/15
 * https://m.blog.naver.com/PostView.nhn?blogId=jongwon0320&logNo=100196176337&proxyReferer=https%3A%2F%2Fwww.google.co.kr%2F
 *
 */
public class 회의실배정 {

    public static final int START = 0;
    public static final int END = 1;

    public int solution(int n, int[][] numberMeetings) {

        int now = 0;
        int ans = 0;


        // 끝나는 시간을 기준으로 정렬
        Arrays.sort(numberMeetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int item1 = o1[END];
                int item2 = o2[END];

                return Integer.compare(item1, item2);
            }
        });

        // 끝나는 시간을 기준으로 정렬한 것 출력
        for (int i = 0; i < numberMeetings.length; i++){
            for (Integer integer : numberMeetings[i]){
                System.out.print(integer+" ");
            }
            System.out.println();
        }

        // 일찍 끝나는 회의를 먼저 배정하기
        for (int i = 0; i < numberMeetings.length; i++){
            if (now <= numberMeetings[i][START]){
                now = numberMeetings[i][END];
                ans += 1;
            }
        }

        return ans;
    }
}
