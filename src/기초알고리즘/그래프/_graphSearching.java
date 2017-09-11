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

 list[u] v = 정점 u에 연결된 정점 v, 즉 간선 역인 list[v] u 또한 있다
 list[1] 2, 5
 list[2] 1, 3, 5
 list[3] 2, 4
 list[4] 3, 5
 list[5] 1, 2, 4
 list[6] 4

 * */

/**
 * 다른 테스트 케이스
 4 5 1
 1 2
 1 3
 1 4
 2 4
 3 4
 */
public class _graphSearching {
    private static ArrayList<Integer>[] a;

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

        System.out.println("Before");
        for (int i = 1; i <= n; i++){
            System.out.print("정점이 "+i+"일 때 ");
            for (Integer integer : a[i]){
                System.out.print(integer + " ");
            }
            System.out.println();
        }

        // java sorting arraylist
        for (int i = 1; i <= n; i++){
            Collections.sort(a[i]);
        }

        System.out.println("After");
        for (int i = 1; i <= n; i++){
            System.out.print("정점이 "+i+"일 때 ");
            for (Integer integer : a[i]){
                System.out.print(integer + " ");
            }
            System.out.println();
        }


        boolean[] check1 = new boolean[n+1];
        System.out.print("DFS ");
        dfs(start, check1);
        System.out.println();

        boolean[] check2 = new boolean[n+1];
        System.out.print("BFS ");
        bfs(start, check2);
        System.out.println();
    }

    private static void bfs(int start, boolean[] check) {       // 큐를 이용해서 지금 위치에서 갈 수 있는 것을 모두 큐에 넣는 방식
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);                   // start 맨 처음 시작하는 노드를 큐에 넣고
        check[start] = true;                // check[node]에 start 노드를 방문했다고 체크해준다

        while (!queue.isEmpty()){           // 큐가 빌때까지 반복한다
            int i = queue.remove();         // 큐에 있는 정점 i를 제거하면서 정점 i와 연결된 간선들을 탐색한다
            System.out.print(i+" ");

                                            // 다음 정점을 찾아가는 과정
            for (int next : a[i]){          // 정점 i와 연결된 간선들을 탐색한다
                if (check[next] == false){  // 다음 노드가 방문되지 않은 거라면
                    check[next] = true;     // 방문했다고 표시하고
                    queue.add(next);        // 큐에 다음 정점을 추가한다.
                }
            }
        }
    }

    private static void dfs(int i, boolean[] check) {   // boolean[] check는 아직 방문하지 못했으면 0, 방문했으면 1을 넣는다
        if (check[i])                   // 이전에 방문했던 노드이므로 끝내고 전에 노드로 돌아간다
            return;

        check[i] = true;                // 방문하지 못했던 노드이므로 방문했다는 표시를 해준다 true
        System.out.print(i+" ");

                                        // 다음 정점을 찾는 과정
        for (int next : a[i]){             // list[i]는 정점 i와 연결된 정점들이 저장되어 있다
                                        // y에 정점 i와 연결된 정점 하나를 꺼내고 방문했는지 안했느지 검사한다
            if (check[next] == false)      // 방문을 하지 안했으면 next Node를 탐색한다
                dfs(next, check);          // == 간선이 있고 방문을 하지 않았으면 탐색 !!
        }
    }
}
