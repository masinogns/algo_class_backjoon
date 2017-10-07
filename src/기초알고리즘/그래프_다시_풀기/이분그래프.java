package 기초알고리즘.그래프_다시_풀기;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 7..
 *
 * 런타임 에러가 남.
 * 이유는 메모리 초과를 생각해볼 수 있다
 *
 * 노드의 갯수가 최대 20,000개 까지라서
 * 20,000 * 20,000을 하면 메모리가 빠이 될 듯..
 */
public class 이분그래프 {
    boolean check = false;
    boolean isbinaryGraph = true;

    public boolean getIsIsbinaryGraph() {
        return isbinaryGraph;
    }

    public void solution(int numberOfNode, int startNode, int[][] graph) {
        boolean[] nodeVisited = new boolean[numberOfNode+1];
        boolean[] groupChecker = new boolean[numberOfNode+1];


        Queue<Integer> queue = new LinkedList<>();
        nodeVisited[startNode] = true;
        groupChecker[startNode] = check;
        queue.add(startNode);

        while (!queue.isEmpty()){
            int current = queue.remove();

            for (int nextNode = 0; nextNode <= numberOfNode; nextNode++){
                if (graph[current][nextNode] == 1 && nodeVisited[nextNode] == false){
                    queue.add(nextNode);
                    nodeVisited[nextNode] = true;
                    groupChecker[nextNode] = !groupChecker[current];
                }else if (graph[current][nextNode] == 1 && nodeVisited[nextNode] == true){
                    if (current!=nextNode && groupChecker[current] == groupChecker[nextNode]){
                        isbinaryGraph = false;
                        return;
                    }
                }
            }
        }
    }

    public int[][] makeGraph(int[][] edges, int numberOfNode, int numberOfEdge) {
        int[][] graph = new int[numberOfNode+1][numberOfNode+1];

        for (int i = 0; i < numberOfEdge; i++){
            graph[edges[i][0]][edges[i][1]] = graph[edges[i][1]][edges[i][0]] = 1;
        }

        return graph;
    }

    public static void main(String[] args) {
        이분그래프 application = new 이분그래프();

        Scanner scanner = new Scanner(System.in);

        int testcase = scanner.nextInt();

        while (testcase-- > 0) {

            int numberOfNode = scanner.nextInt();
            int numberOfEdge = scanner.nextInt();
            int[][] edges = new int[numberOfEdge][2];
            for (int i = 0; i < numberOfEdge; i++) {
                edges[i][0] = scanner.nextInt();
                edges[i][1] = scanner.nextInt();
            }

            int startNode = edges[0][0];

            int[][] graph = application.makeGraph(edges, numberOfNode, numberOfEdge);
            application.solution(numberOfNode, startNode, graph);

            if (application.getIsIsbinaryGraph())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
