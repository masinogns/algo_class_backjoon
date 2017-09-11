package 기초알고리즘.그래프;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 10..
 *
 * 테스트 입력
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
public class _Adjacency_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int V = scanner.nextInt();
        int E = scanner.nextInt();
        scanner.nextLine();

        // Matrix 크기가 V+1인 이유. Vertex 즉 정점드을 1부터 시작하기 위해서 그렇다
        // 그리고 정점과 정점을 연결할 때 최대 각 정점에 연결하는 방법이라 2번째 인자도 V+1이다
        int[][] Matrix = new int[V+1][V+1];

        // 인접행렬 input 받아들이는 부분
        for (int e = 0; e < E; e++){
            int u = 0, v = 0;

            u = scanner.nextInt();
            v = scanner.nextInt();

            Matrix[u][v] = Matrix[v][u] = 1; // 가중치가 1인 것을 뜻한다
        }

        // 인접행렬 출력하는 부분
        for (int i = 1; i <= V; i++){
            for (int j = 1; j < V; j++){
                System.out.print(Matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
