package 기초알고리즘.그래프;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 10..
 */
public class 연결요소Test {
    @Test
    public void test1() throws Exception {

        연결요소 application = new 연결요소();

        int V = 6, E = 5;

        ArrayList<Integer>[] a = new ArrayList[V+1];
        for (int i = 1; i <= V; i++)
            a[i] = new ArrayList<>();

        e(a, 1, 2);
        e(a, 2, 5);
        e(a, 3, 4);
        e(a, 4, 6);
        e(a, 5, 1);

        assertEquals(2, application.soution(V, E, a));

    }

    private void e(ArrayList<Integer>[] a, int u, int v) {
        a[u].add(v);
        a[v].add(u);
    }
}