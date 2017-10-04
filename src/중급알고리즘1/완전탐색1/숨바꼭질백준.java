package 중급알고리즘1.완전탐색1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 4..
 * 수빈이는 동생과 숨바꼭질을 하고 있다. 수빈이는 현재 점 N(0 ≤ N ≤ 100,000)에 있고,
 * 동생은 점 K(0 ≤ K ≤ 100,000)에 있다. 수빈이는 걷거나 순간이동을 할 수 있다.
 * 만약, 수빈이의 위치가 X일 때 걷는다면 1초 후에 X-1 또는 X+1로 이동하게 된다.
 * 순간이동을 하는 경우에는 1초 후에 2*X의 위치로 이동하게 된다.

 수빈이와 동생의 위치가 주어졌을 때,
 수빈이가 동생을 찾을 수 있는 가장 빠른 시간이 몇 초 후인지 구하는 프로그램을 작성하시오.
 */
public class 숨바꼭질백준 {

    public static final int MAX = 1000000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 수빈이가 있는 위치는 N
        // 동생이 있는 위치 K
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 노드가 만들어 졌는지 아닌지 체크하는 check
        // 노드의 거리가 들어있는 dist
        boolean[] check = new boolean[MAX];
        int[] dist = new int[MAX];

        // 수빈이의 노드와 거리
        check[N] = true;
        dist[N] = 0;

        // BFS를 위한 Queue
        Queue<Integer> queue = new LinkedList<>();
        // Queue에 수빈이 노드인 N을 넣는다
        queue.add(N);

        while (!queue.isEmpty()){                   // Queue가 비어있지 않다면
            int now = queue.remove();               // queue에 맨 앞에 있는 것을 now에 놓는다
            if (now - 1 >= 0){
                if (check[now-1] == false){         // 방문한 노드인지 체크하고 아니라면
                    queue.add(now-1);               // queue에 노드를 추가한다
                    check[now-1] = true;            // 추가한 노드를 방문했다고 체크하고
                    dist[now-1] = dist[now] + 1;    // dist[노드]에 몇번만에 왔는지를 기록한다
                }
            }

            if (now + 1 < MAX){
                if (check[now+1] == false){
                    queue.add(now+1);
                    check[now+1] = true;
                    dist[now+1] = dist[now] + 1;
                }
            }

            if (now*2 < MAX){
                if (check[now*2] == false){
                    queue.add(now*2);
                    check[now*2] = true;
                    dist[now*2] = dist[now] + 1;
                }
            }
        }

        System.out.println(dist[M]);
    }
}
