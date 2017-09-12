package 기초알고리즘.그래프;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by masinogns on 2017. 9. 11..
 */
public class 사이클찾기 {

    public int solution(int arraySize, ArrayList<Integer> array) {

        ArrayList<Integer>[] a = new ArrayList[arraySize+1];
        for (int i = 1; i <= arraySize; i++)
            a[i] = new ArrayList<>();

        // array 값을 ArrayList[]로 a[정점].add(간선)의 형태로 바꿈
        for (int i = 1; i <= arraySize; i++){
                a[i].add(array.get(i-1));
        }

        boolean[] check = new boolean[arraySize+1];
        int ret = 0;
        for (int i = 1; i <= arraySize; i++){
            if (check[i] == false){
                dfs(i, check, a);
                ret += 1;
            }
        }

        return ret;
    }

    private void dfs(int i, boolean[] check, ArrayList<Integer>[] a) {
        check[i] = true;

        if (check[a[i].get(0)] == false)        // 간선이 모두 한개씩 뿐이기 때문에 for문을 돌릴 필요가 없다
            dfs(a[i].get(0), check, a);

    }
}
