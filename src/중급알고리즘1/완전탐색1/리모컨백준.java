package 중급알고리즘1.완전탐색1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 3..
 */
public class 리모컨백준 {


    private boolean[] broken;

    public 리모컨백준() {
        // 버튼이 망가져있으면 true, 아니면 false
        broken = new boolean[10];
    }

    public int possible(int channel){
        if (channel == 0){
            if (broken[0])
                return 0;
            else
                return 1;
        }

        int len = 0;

        while (channel > 0){
            if (broken[channel%10]){
                return 0;
            }

            len+=1;
            channel /= 10;
        }

        return len;
    }

    public static void main(String[] args) {
        리모컨백준 application = new 리모컨백준();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        for (int i = 0; i < M; i++){
            int x = scanner.nextInt();
            application.broken[x] = true;
        }

        int answer = N - 100;       // N >= 100
        if (answer < 0){
            answer = -answer;       // N < 100
        }

        for (int i = 0; i <= 1000000; i++){
            int channel = i;
            int len = application.possible(channel - N);

            if (len > 0){
                int press = channel - N;
                if (press < 0){
                    press = -press;
                }

                if (answer > len + press){
                    answer = len + press;
                }
            }
        }

        System.out.println(answer);

    }
}
