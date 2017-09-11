package 기초알고리즘.그래프;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 10..
 *
 *  * 테스트 입력
 6 8
 1 2
 1 5
 2 3
 2 4
 2 5
 5 4
 4 3
 4 6
 */
public class _Adjacency_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = scanner.nextInt();
        int E = scanner.nextInt();
        scanner.nextLine();

        //인접리스트는 ArrayList로 구현한다
        //V+1인 이유는 Vertex가 1부터 시작하기 위해서 그렇다
        ArrayList<Integer>[] List = new ArrayList[V+1];     // ArrayList V+1개 만들기
        for (int i = 0; i < V+1; i ++){
            List[i] = new ArrayList<>();                    // ArrayList[1], [2] ...[V] 만들기
                                                            // 이 때 i는 각 정점을 뜻하는 변수이다
        }

        // 인접리스트에 값을 받는 부분이다 받기 전에 초기화를 해줘야 한다
        for (int e = 0; e < E; e++){
            int u = 0, v = 0;

            u = scanner.nextInt();
            v = scanner.nextInt();

            // 정점 2개 u와 v가 있다
            // 양방향 그래프라서 u와 v에 서로 바꿔가며 값을 넣어준다
            // 정점 U는 정점 V와 연결된다 즉 List[U]만 보면 U 정점에 연결된 정점들을 볼 수 있다
            List[u].add(v);
            List[v].add(u);
        }


        // 인접리스트를 출력하는 부분이다
        for (int v = 1; v < V; v++){
            for (int e = 0; e < List[v].size(); e++){
                System.out.print(List[v].get(e)+" ");
            }
            System.out.println("");
        }
    }
}
