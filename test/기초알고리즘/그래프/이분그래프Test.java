package 기초알고리즘.그래프;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 10..
 */
public class 이분그래프Test {
    @Test
    public void test1() throws Exception {
        이분그래프 application = new 이분그래프();

        int vertex = 3;
        int edge = 2;

        ArrayList<Integer>[] a = new ArrayList[vertex+1];
        for (int i = 1; i <= vertex; i++)
            a[i] = new ArrayList<>();

        InEdge(a, 1,3);
        InEdge(a, 2,3);

        assertEquals(true, application.solution(vertex, edge, a));

    }

    @Test
    public void test2() throws Exception {
        이분그래프 application = new 이분그래프();

        int vertex = 4;
        int edge = 4;

        ArrayList<Integer>[] a = new ArrayList[vertex+1];
        for (int i = 1; i <= vertex; i++)
            a[i] = new ArrayList<>();

        InEdge(a, 1,2);
        InEdge(a, 2,3);
        InEdge(a, 3,4);
        InEdge(a, 4,2);

        assertEquals(false, application.solution(vertex, edge, a));

    }

    private void InEdge(ArrayList<Integer>[] a, int u, int v) {
        a[u].add(v);
        a[v].add(u);
    }
}