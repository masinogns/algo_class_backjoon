package 중급알고리즘1.완전탐색1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 4..
 */
public class 소수경로백준 {
    public static final int MAX = 10000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] prime = new boolean[MAX+1];

        for (int i = 2; i <= MAX; i++){
            if (prime[i] = false){
                for (int j = i*i; j <= MAX; j+=i){
                    prime[j] = true;
                }
            }
        }

        for (int i = 0; i <= MAX; i++){
            prime[i] = !prime[i];
        }

        int testcase = scanner.nextInt();

        while (testcase-- > 0){
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            // 수를 방문했는지를 체크하는 check
            // 해당 소수까지 몇번의 변화가 있는지 저장하는 answer
            boolean[] check = new boolean[MAX+1];
            int[] answer = new int[MAX+1];

            answer[N] = 0;
            check[N] = true;

            Queue<Integer> queue = new LinkedList<>();
            queue.add(N);

            while (!queue.isEmpty()){
                int now = queue.remove();

                for (int i = 0; i < 4; i++){
                    for (int j = 0; j < 10; j++){
                        int next = change(now, i, j);

                        if (next != -1){
                            if (prime[next]&&check[next] == false){
                                queue.add(next);
                                answer[next] = answer[now]+1;
                                check[next] = true;
                            }
                        }
                    }
                }
            }
            System.out.println(answer[M]);
        }
    }

    private static int change(int num, int index, int digit) {
        if (index == 0 && digit == 0) return -1;

        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(index, (char)(digit+'0'));

        return Integer.parseInt(sb.toString());
    }
}
