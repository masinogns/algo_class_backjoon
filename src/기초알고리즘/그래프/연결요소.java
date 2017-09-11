package 기초알고리즘.그래프;


import java.util.*;

/**
 * Created by masinogns on 2017. 9. 10..
 */
public class 연결요소 {

    public int soution(int vertex, int edge, ArrayList<Integer>[] a) {
        for (int i = 1; i <= vertex; i++){
            Collections.sort(a[i]);
        }

        boolean[] c = new boolean[vertex+1];
        int ret = 0;

        for (int i = 1; i <= vertex; i++){
            if (c[i] == false){
                bfs(i, a, c);
                ret+=1;
            }
        }

        return ret;
    }


    private static void bfs(int start, ArrayList<Integer>[] a, boolean[] c) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        c[start] = true;

        while (!queue.isEmpty()){
            int x = queue.remove();

            for (int y : a[x]){
                if (c[y] == false){
                    c[y] = true;
                    queue.add(y);
                }
            }
        }
    }

}
