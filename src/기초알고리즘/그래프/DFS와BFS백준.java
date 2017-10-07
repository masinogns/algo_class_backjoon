package 기초알고리즘.그래프;

import java.util.*;

/**
 * Created by masinogns on 2017. 10. 8..
 */
public class DFS와BFS백준 {
    static ArrayList<Integer>[] array;
    static boolean[] check;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNode = scanner.nextInt();
        int numberOfEdge = scanner.nextInt();
        int startNode = scanner.nextInt();

        array = (ArrayList<Integer>[]) new ArrayList[numberOfNode+1];
        for (int i = 1; i <= numberOfNode; i++)
            array[i] = new ArrayList<>();

        for (int i = 0; i < numberOfEdge; i++){
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            array[u].add(v);
            array[v].add(u);
        }

        for (int i = 1; i <= numberOfNode; i++){
            Collections.sort(array[i]);
        }

        check = new boolean[numberOfNode+1];
        dfs(startNode);
        System.out.println();
        check = new boolean[numberOfNode+1];
        bfs(startNode);
        System.out.println();
    }

    private static void bfs(int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        check[startNode] = true;

        while (!queue.isEmpty()){
            int current = queue.remove();
            System.out.print(current+" ");

            for (int nextNode : array[current]){
                if (check[nextNode] == false){
                    check[nextNode] = true;
                    queue.add(nextNode);
                }
            }
        }
    }

    private static void dfs(int current) {
        if (check[current])
            return;

        check[current] = true;
        System.out.println(current+" ");

        for (int nextNode : array[current]){
            if (check[nextNode] == false)
                dfs(nextNode);
        }

    }
}
