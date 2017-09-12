package 기초알고리즘.그래프;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 11..
 *
 * http://mygumi.tistory.com/107
 */
public class TermProject2{

    static int[] graph;
    static int[] check;
    static int[] startVertex;

    static int dfs(int startPoint, int teamMemeberCount, int endPoint) {
        if (check[startPoint] != 0) {                   // 처음 학생에게 의사 물어봤고
            if (endPoint != startVertex[startPoint]) {  // 마지막 학생에게 물어본
                // 이미 방문했고, 정점 시작점이 다를 경우 사이클 x
                return 0;
            }

            return teamMemeberCount - check[startPoint];
         }

        check[startPoint] = teamMemeberCount;           // startPoint 학생일 때의 팀 멤버 수
        startVertex[startPoint] = endPoint;             // 너는 누구랑 하고 싶어?
                                                        // startPoint 학생에게 물어보기 -> endPoint 얘랑 팀하고 싶어요

        return dfs(graph[startPoint], teamMemeberCount + 1, endPoint);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while (testCase-- > 0) {
            int num = sc.nextInt();             // 학생의 수 num을 입력받는다
            graph = new int[num + 1];           // check, graph, startVertex를 학생수 +1로 범위를 지정한다
            check = new int[num + 1];
            startVertex = new int[num + 1];

            for (int i = 1; i <= num; i++) {    // 수를 입력받고 배열을 이용해 그래프를 구현한다
                graph[i] = sc.nextInt();
            }

            int ans = 0;                        // 팀인 사람 수를 저장한다
            for (int i = 1; i <= num; i++) {    // 팀인 사람 수를 찾는 로직이다
                if (check[i] == 0) {            // 만약 i번째 학생의 의사를 물어보지 않았다면 물어본다
                                                // check[] = 0 누구랑 팀할지 안물어봄, 1 물어봄 (다시물어볼 필요 없음)
                    ans += dfs(i, 1, i);    // start == end랑 같으면 사이클이 존재한다는 의미이다
                }
            }

            System.out.println(num - ans);
        }

    }

}