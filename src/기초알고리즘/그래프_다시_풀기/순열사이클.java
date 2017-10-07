package 기초알고리즘.그래프_다시_풀기;


import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 7..
 */
public class 순열사이클 {
    int count = 0;

    public int[] makeGraph(int numberOfPermutation, int[] permutations) {

        int[] graph = new int[numberOfPermutation+1];

        for (int i = 1; i <= numberOfPermutation; i++)
            graph[i] = permutations[i-1];

        return graph;
    }

    public int solution(int numberOfNode, int[] graph) {

        boolean[] check = new boolean[numberOfNode+1];

        for (int current = 1; current <= numberOfNode; current++){
            if (check[current] == false){
                DFS(current, numberOfNode, check, graph);
            }
        }
        return count;
    }

    private void DFS(int current, int numberOfNode, boolean[] check, int[] graph) {
        check[current] = true;

        int nextNode = graph[current];

        if (check[nextNode] == false){
            DFS(nextNode, numberOfNode, check, graph);
        }else count++;
    }

    public static void main(String[] args) {
        순열사이클 application = new 순열사이클();

        Scanner scanner = new Scanner(System.in);

        int testcase = scanner.nextInt();

        while (testcase-- > 0){
            application.count = 0;
            int numberOfPermutation = scanner.nextInt();
            int[] permutations = new int[numberOfPermutation+1];
            for (int i = 0; i < numberOfPermutation; i++){
                permutations[i] = scanner.nextInt();
            }

            int[] graph = application.makeGraph(numberOfPermutation, permutations);

            System.out.println(application.solution(numberOfPermutation, graph));
        }
    }
}
