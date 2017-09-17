package kakao;

import java.util.ArrayList;

/**
 * Created by masinogns on 2017. 9. 16..
 */
public class problem1 {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] map = new String[n];
        String[] answer = new String[n];

        for (int i = 0; i < n; i++){
            map[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++){
            if (map[i].length() != n)
                map[i] = "0" + map[i];
        }

        for (int i = 0; i < n; i++){
            answer[i] = map[i].replaceAll("0", " ");
            answer[i] = answer[i].replaceAll("1", "#");
        }

        return answer;
    }


}
