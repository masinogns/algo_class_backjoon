package 기초알고리즘.그래프_다시_풀기;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by masinogns on 2017. 10. 5..
 *
 * 문제 설명.
 *
 * 정점의 개수 N개와 간선의 개수 M개 그리고 탐색을 시작할 정점 V을 입력받는다
 * 간선의 갯수인 M개 만큼 간선을 입력받는다 단, 양방향이다
 *  M개의 줄 = G = (V, E)
 *
 * BFS의 결과와 DFS의 결과를 출력해라
 *
 * 소스코드가 너무나 더럽다.
 *
 */


public class DFS와BFS {

    int numberOfNode, numberOfEdge, startNode;
    private ArrayList<Integer> DFS;

    public DFS와BFS(int numberOfNode, int numberOfEdge, int startNode) {
        this.numberOfNode = numberOfNode;
        this.numberOfEdge = numberOfEdge;
        this.startNode = startNode;
        DFS = new ArrayList<>();
    }

    public ArrayList<Integer> bfsRunning(int[][] graph) {
        ArrayList<Integer> array = new ArrayList<>();

        boolean[] check = new boolean[numberOfNode+1];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        check[startNode] = true;

        while (!queue.isEmpty()){
            int current = queue.remove();
            array.add(current);

            for (int nextNode = 1; nextNode <= numberOfNode; nextNode++){
                if (graph[current][nextNode] == 1 && check[nextNode] == false){
                    queue.add(nextNode);
                    check[nextNode] = true;
                }
            }
        }
        return array;
    }

    public int[][] makingGraph(int[][] graph) {
        int[][] ret = new int[numberOfNode+1][numberOfNode+1];

        for (int i = 0; i < numberOfEdge; i++){
            ret[graph[i][0]][graph[i][1]] = ret[graph[i][1]][graph[i][0]] = 1;
        }

        return ret;
    }

    public void dfsRunning(int current, int[][] graph, boolean[] check) {
        if (check[current])
            return;

        check[current] = true;
        DFS.add(current);

        for (int nextNode = 1; nextNode <= numberOfNode; nextNode++){
            if (graph[current][nextNode] == 1 && check[nextNode]==false){
                dfsRunning(nextNode, graph, check);
            }
        }

    }


    public ArrayList<Integer> getDFS() {
        return DFS;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNode = scanner.nextInt();
        int numberOfEdge = scanner.nextInt();
        int startNode = scanner.nextInt();
        DFS와BFS application = new DFS와BFS(numberOfNode, numberOfEdge, startNode);

//        int[][] makedGraph = application.makingGraph(graph);
        int[][] makedGraph = application.inputGraph(numberOfNode, numberOfEdge, scanner);

        ArrayList<Integer> bfs = application.bfsRunning(makedGraph);
        for (int i : bfs) System.out.print(i+" ");
        System.out.println();
        boolean[] check = new boolean[numberOfNode+1];
        application.dfsRunning(startNode, makedGraph,check);
        ArrayList<Integer> dfs = application.getDFS();
        for (int i : dfs) System.out.print(i+" ");
    }

    private int[][] inputGraph(int numberOfNode, int numberOfEdge, Scanner scanner) {
        int[][] graph = new int[numberOfNode+1][numberOfNode+1];

        for(int i = 0; i < numberOfEdge; i++){
            int node = scanner.nextInt();
            int connect = scanner.nextInt();
            graph[node][connect] = graph[connect][node] = 1;
        }

        return graph;
    }
}