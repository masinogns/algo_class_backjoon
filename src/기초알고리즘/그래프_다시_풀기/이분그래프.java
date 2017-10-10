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
 *
 * !!!!!!!!ㅡ인접리스트로 하면 런타임 에러 해결함 !!!!!!!!
 */
public class 이분그래프 {
    boolean check = false;
    boolean isbinaryGraph = true;

    public void setIsbinaryGraph(boolean isbinaryGraph) {
        this.isbinaryGraph = isbinaryGraph;
    }

    public boolean getIsbinaryGraph() {
        return isbinaryGraph;
    }

    public void solution(int numberOfNode, int startNode, ArrayList<Integer>[] graph) {
        boolean[] nodeVisited = new boolean[numberOfNode+1];
        boolean[] groupChecker = new boolean[numberOfNode+1];

        Queue<Integer> queue = new LinkedList<>();
        nodeVisited[startNode] = true;
        groupChecker[startNode] = check;
        queue.add(startNode);

        while (!queue.isEmpty()){
            int current = queue.remove();

            for (int nextNode : graph[current]){
                if (nodeVisited[nextNode] == false){
                    queue.add(nextNode);
                    nodeVisited[nextNode] = true;
                    groupChecker[nextNode] = !groupChecker[current];

                }else if (nodeVisited[nextNode] == true){
                    if (groupChecker[current] == groupChecker[nextNode]){
                        isbinaryGraph = false;
                        return;
                    }
                }
            }
        }
    }

    public ArrayList<Integer>[] makeGraph(int[][] edges, int numberOfNode, int numberOfEdge) {
        ArrayList<Integer>[] graph = new ArrayList[numberOfNode+1];

        for (int i = 1; i <= numberOfNode; i++){
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < numberOfEdge; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            graph[u].add(v);
            graph[v].add(u);
        }

        return graph;
    }

    public static void main(String[] args) {
        이분그래프 application = new 이분그래프();

        Scanner scanner = new Scanner(System.in);

        int testcase = scanner.nextInt();

        while (testcase-- > 0) {
            application.setIsbinaryGraph(true);
            int numberOfNode = scanner.nextInt();
            int numberOfEdge = scanner.nextInt();
            int[][] edges = new int[numberOfEdge][2];
            for (int i = 0; i < numberOfEdge; i++) {
                edges[i][0] = scanner.nextInt();
                edges[i][1] = scanner.nextInt();
            }

            int startNode = edges[0][0];
            ArrayList<Integer>[] graph = application.makeGraph(edges, numberOfNode, numberOfEdge);
            application.solution(numberOfNode, startNode, graph);

            if (application.getIsbinaryGraph())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
