package 기초알고리즘.그래프;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by masinogns on 2017. 9. 10..
 *
 * 사이클이 없으면 이분 그래프
 * 사이클이 있어 처음 출발점으로 다시 돌아온다면 이분 그래프가 아님
 */
public class 이분그래프 {
    public boolean solution(int vertex, int edge, ArrayList<Integer>[] a) {

        boolean[] check = new boolean[vertex+1];

        boolean ret = bfs(1, a, check);
        return ret;
    }

    private static boolean bfs(int start, ArrayList<Integer>[] a, boolean[] check) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        check[start] = true;

        while (!queue.isEmpty()){
            int x = queue.remove();

            for (int y : a[x]){
                if (check[y] == false){
                    check[y] = true;
                    queue.add(y);
                }else
                    if (y == start)
                        return false;
            }
        }
        return true;
    }
}
