package 기초알고리즘.그래프;

import java.util.*;

/**
 * Created by masinogns on 2017. 9. 10..
 *
 * 그래프 탐색의 목적: 모든 노드를 한 번씩 방문하는 것
 * * BFS
 * 목적 : 최대한 넓게 가는 거 , 큐를 사용한다
 *
 * 모든 가중치가 1일 때 최단 거리를 찾을 때 사용한다
 *
 * * DFS
 * 그래프 탐색의 목적: 모든 노드를 한 번씩 방문하는 것
 * 목적 : 최대한 깊숙히 많이, 스택을 사용한다
 *
 *
 6 8 1
 1 2
 1 5
 2 3
 2 4
 2 5
 5 4
 4 3
 4 6
 *
 * */
public class _graphSearching {
    private static ArrayList<Integer>[] a;
    private static boolean[] c;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int start = scanner.nextInt();

         a = new ArrayList[n+1];

        for (int i = 1; i <= n; i++){
            a[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++){
            int u = scanner.nextInt();      //  정점 1
            int v = scanner.nextInt();      //  정점 2

            // 정점 1과 정점 2가 연결된 간선이 있다는 것을 말한ㄴ다
            //
            a[u].add(v);
            a[v].add(u);
        }

        for (int i = 1; i <= n; i++){
            Collections.sort(a[i]);
        }

        c = new boolean[n+1];
        dfs(start);
        System.out.println();

        c = new boolean[n+1];
        bfs(start);
        System.out.println();
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        c[start] = true;

        while (!queue.isEmpty()){
            int x = queue.remove();
            System.out.println(x+" ");

            for (int y : a[x]){
                if (c[y] == false){
                    c[y] = true;
                    queue.add(y);
                }
            }
        }
    }

    private static void dfs(int x) {
        if (c[x])
            return;

        c[x] = true;
        System.out.println(x+" ");

        // 다음 정점을 찾는 과정
        for (int y : a[x]){
            if (c[y] == false)
                dfs(y);
        }
    }
}
