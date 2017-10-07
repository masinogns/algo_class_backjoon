package 기초알고리즘.그래프_다시_풀기;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 5..
 *
 * 연결 요소의 갯수는 DFS로 풀어라아아아
 */
public class 연결요소의개수 {


    private static final int U = 0;
    private static final int V = 1;
    private static final int CURRENTNODE = 0;
    private static final int NEXTNODE = 1;

    public int[][] makeGraph(int numberOfNode, int numberOfEdge, int[][] g) {

        int[][] graph = new int[numberOfNode+1][numberOfNode+1];

        for (int i = 0; i < numberOfEdge; i++){
            graph[g[i][U]][g[i][V]] = graph[g[i][V]][g[i][U]] = 1;
        }

        return graph;
    }


    public int solution(int numberOfNode, int numberOfEdge, int[][] graph) {

        boolean[] check = new boolean[numberOfNode+1];

        int count = 0;
        for (int current = 1; current <= numberOfNode; current++){
            if (check[current] == false){
                DFS(current, check, graph, numberOfNode);
                count+=1;
            }
        }

        return count;
    }

    private void DFS(int current, boolean[] check, int[][] graph, int numberOfNode) {
        check[current] = true;

        for (int nextNode = 1; nextNode <= numberOfNode; nextNode++){
            if (graph[current][nextNode] == 1 && check[nextNode] == false)
                DFS(nextNode, check, graph, numberOfNode);
        }
    }

    public static void main(String[] args) {
        연결요소의개수 application = new 연결요소의개수();

        Scanner scanner = new Scanner(System.in);

        int numberOfNode = scanner.nextInt(), numberOfEdge = scanner.nextInt();

        int[][] G = new int[numberOfEdge][2];
        for (int i = 0; i < numberOfEdge; i++){
            G[i][CURRENTNODE] = scanner.nextInt();
            G[i][NEXTNODE] = scanner.nextInt();
        }

        int[][] graph = application.makeGraph(numberOfNode, numberOfEdge, G);
        int count = application.solution(numberOfNode, numberOfEdge, graph);
        System.out.println(count);
    }
}
