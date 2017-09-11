package 기초알고리즘.그래프;

import java.util.ArrayList;

/**
 * Created by masinogns on 2017. 9. 10..
 *
 * 사이클이 없으면 이분 그래프
 * 사이클이 있어 처음 출발점으로 다시 돌아온다면 이분 그래프가 아님
 */
public class 이분그래프 {
    public boolean solution(int vertex, int edge, ArrayList<Integer>[] a) {

        int[] check = new int[vertex+1];
                                            // DFS 안에서 돌리게 되면 비 효율적인가보다 .. 토론이 필요
        for (int i = 1; i <= vertex; i++){
            if (check[i]==0)                // 아직 방문을 하지 않았으면 DFS를 시작한다.
                                            // 첫번째 DFS가 끝나면 for문을 진행한다
                dfs(i, check, a, 1);
        }


                                            // A집합과 B집합이 각각 인접한게 있는지 비교하는 로직
        for (int i = 1; i <= vertex; i++){
            for (int j : a[i]){             // 정점 i에 연결된 간선들을 탐색한다,
                                            // 이분 그래프가 되려면 간선이 같은 집합에 속하면 안된다
                if (check[i] == check[j])   // 정점 i에 연결된 간선들이 같은 집합에 속할 경우
                    return false;           // 이것은 인접해있다는 의미이므로  false를 return한다
            }
        }

        return true;
    }

    private void dfs(int start, int[] check, ArrayList<Integer>[] a, int i) {
        // if ( check[start] == 0 ) return이 있었는데 없는 이유
        // check[start] == 0의 처리를 solution에서 해주고 있다
        check[start] = i;

        for (int nextNode : a[start]){
            if (check[nextNode] == 0){
                dfs(nextNode, check, a, 3-i);
            }
        }

    }
}
