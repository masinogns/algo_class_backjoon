package 기초알고리즘.그래프_다시_풀기;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 7..
 *
 * 테스트 케이스는 통과했으나
 *
 * "런타임 에러 발생 !!!!"
 *
 * 인접 배열이 아닌 인접 리스트로 메모리 초과를 줄여보자!!
 * 인접 배열을 사용한 이유는 i == i 일 때의 count를 해주기 위해서였다
 * 인접 리스트에서는 어떻게 해결할지 생각해봐야 한다
 *
 */
public class 텀프로젝트 {
    private int count;

    public int getCount() {
        return count;
    }

    public 텀프로젝트() {
        this.count = 0;
    }

    public ArrayList<Integer>[] makeGraph(int numberOfStudents, int[] wantYou) {
        ArrayList<Integer>[] graph = new ArrayList[numberOfStudents+1];

        for (int i = 1; i <= numberOfStudents; i++)
            graph[i] = new ArrayList<>();

        for (int u = 1; u <= numberOfStudents; u++){
            int v = wantYou[u-1];

            graph[u].add(v);
            graph[v].add(u);

        }

        return graph;
    }

    public void solution(int numberOfStudents, ArrayList<Integer>[] graph) {
        boolean[] check = new boolean[numberOfStudents+1];
        int[] value = new int[numberOfStudents+1];

        for (int current = 1; current <= numberOfStudents; current++){
            if (check[current] == false){
                DFS(current, check, graph, numberOfStudents, 1);
            }
        }

    }

    private void DFS(int current, boolean[] check, ArrayList<Integer>[] graph, int numberOfNode, int value) {
        check[current] = true;

        for (int nextNode : graph[current]){
            if (check[nextNode] == false){
                DFS(nextNode, check, graph, numberOfNode, value++);
            }else if (check[nextNode] == true){
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

            ArrayList<Integer>[] graph = application.makeGraph(numberOfStudents, wantYou);
            application.solution(numberOfStudents, graph);

            int ret = numberOfStudents - application.getCount();

            System.out.println(ret);

        }
    }
}
