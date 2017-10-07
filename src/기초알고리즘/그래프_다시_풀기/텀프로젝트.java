package 기초알고리즘.그래프_다시_풀기;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 7..
 */
public class 텀프로젝트 {
    private int count;

    public int getCount() {
        return count;
    }

    public int[][] makeGraph(int numberOfStudents, int[] wantYou) {
        count = 0;

        int[][] graph = new int[numberOfStudents+1][numberOfStudents+1];
        for (int i = 1; i <= numberOfStudents; i++){
            int next = wantYou[i-1];
            graph[i][next] = graph[next][i] = 1;

            if (graph[i][i] == 1){
                graph[i][i] = 0;
                count++;
            }
        }

        return graph;
    }

    public void solution(int numberOfStudents, int[][] graph) {
        boolean[] check = new boolean[numberOfStudents+1];
        int[] value = new int[numberOfStudents+1];

        for (int current = 1; current <= numberOfStudents; current++){
            if (check[current] == false){
                DFS(current, check, graph, numberOfStudents, value[current]++);
            }
        }

    }

    private void DFS(int current, boolean[] check, int[][] graph, int numberOfNode, int value) {
        check[current] = true;

        for (int nextNode = 1; nextNode <= numberOfNode; nextNode++){
            if (graph[current][nextNode] == 1 && check[nextNode] == false){
                DFS(nextNode, check, graph, numberOfNode, value++);
            }else if (graph[current][nextNode] == 1 && check[nextNode] == true){
                this.count += value;
            }
        }
    }

    public static void main(String[] args) {
        텀프로젝트 application = new 텀프로젝트();

        Scanner scanner = new Scanner(System.in);

        int testcase = scanner.nextInt();
        while (testcase-- > 0){
            int numberOfStudents = scanner.nextInt();
            int[] wantYou = new int[numberOfStudents];
            for (int i = 0; i < numberOfStudents; i++)
                wantYou[i] = scanner.nextInt();

            int[][] graph = application.makeGraph(numberOfStudents, wantYou);
            application.solution(numberOfStudents, graph);

            int ret = numberOfStudents - application.getCount();

            System.out.println(ret);

        }
    }
}
