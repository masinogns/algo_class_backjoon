package 기초알고리즘.그래프;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 11..
 *
 * 경우의 수 2개
 * 1, 혼자일 때는 i == A[i]
 * 2, P1-> P2, P2 -> P3 ....PK -> P1 -- K명
 *
 참조 URL http://www.sbeenlife.com/18

 *
 * visited[next] = false & finished[next] = false == 아직 방문하지 않은 정점
 * visited[next] = true & finished[next] = flase == 현재 정점과 next가 하나의 사이클에 속한다
 * visited[next] = true & finished[next] = true == 이미 모든 탐색이 끝난 정점, 사이클 절대 있을 수 없음
 */
public class TermProject {
    ArrayList<Integer>[] a;
    boolean[] check;
    boolean[] finished;
    int cnt;

    public int solution(int number, ArrayList<Integer> array) {

        a = new ArrayList[number+1];                        // 인접리스트 생성
        for (int i = 1; i <= number; i++)
            a[i] = new ArrayList<>();

        for (int i = 1; i <= number; i++){                  // 인접리스트에 값 넣기
            a[i].add(array.get(i-1));                       // 배열을 그래프 형태로 변환
        }


        check = new boolean[number + 1];
        finished = new boolean[number + 1];
        cnt = 0;

        for (int i = 1; i <= number; i++){
            if (check[i] == false)      // 아직 방문하지 않은 정점
                dfs(i);
        }
        return number - cnt;
    }

    private void dfs(int current) {
        check[current] = true;          // 방문하지 않았을 때 방문했다고 체크해준다
        int next = a[current].get(0);   // 방문하지 했을 때 다음 노드를 방문하기 위한 준비

        if (check[next]){               // 다음 노드를 체크했을 때 방문했다고 되있으면
                                        // 이제 혼자인지 팀인지를 판단해야할 때다
            if (!finished[next]){       // 현재 정점과 next 정점이 하나의 사이클에 속한다
                for (int temp = next; temp != current; temp = a[temp].get(0))
                    cnt++;
                cnt++;          // 자기 자신을 뜻한다
            }                           // else는 이미 모든 탐색이 끝난 정점으로 사이클이 절대 있을 수 없다
        }else dfs(next);                // 다음 노드 체크했을 때 방문했다고 안되어있으면 해당 노드 dfs 돌린다
        finished[current] = true;
    }


    public static void main(String[] args) {
        TermProject application = new TermProject();

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();

        int number = scanner.nextInt();
        for (int i = 0; i < number; i++){
            array.add(scanner.nextInt());
        }

        int ret = application.solution(number, array);

        System.out.println(ret);
    }
}
