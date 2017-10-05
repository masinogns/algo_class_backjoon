package 중급알고리즘1.완전탐색1;

import java.util.ArrayList;

/**
 * Created by masinogns on 2017. 10. 3..
 */
public class 리모컨 {
    public int solution(String channelString, int brokenNumber, int[] brokenButtons) {

        int defaultChannel = 100;
        int channel = Integer.parseInt(channelString);

        ArrayList<Integer> buttons = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            buttons.add(i);
        }

        // 0~9까지의 정상적인 버튼 중에서 고장난 버튼들을 빼낸다
        // 그 결과는 고장난 버튼을 뺀 나머지 버튼들이다
        for (int i = brokenNumber-1; i>=0; i--){
            if (buttons.contains(brokenButtons[i])){
                buttons.remove(brokenButtons[i]);
            }
        }

        for (int i : buttons)
            System.out.print(i+" ");

        StringBuilder sb = new StringBuilder();

        int count = channelString.length();
        int ret = 0;
        for (int i = 0; i < channelString.length(); i++){
            int now = Integer.parseInt(String.valueOf(channelString.charAt(i)));
                                // 버튼 중에 채널에 해당하는 버튼이 있다면 OK
            if (buttons.contains(now)){
                sb.append(now);
                count--;
                ret++;
            }else {             // 버튼 중에 채널에 해당하는 버튼이 없다.

                for (int find = now-1; find >= 0; find--){
                    if (buttons.contains(find)){
                        sb.append(find);
                        count--;
                        ret++;
                        break;
                    }
                }
            }
        }

        for (int i = count-1; i >= 0; i--){
            sb.append("0");
        }

        return channel-Integer.parseInt(sb.toString())+ret;
    }
}
