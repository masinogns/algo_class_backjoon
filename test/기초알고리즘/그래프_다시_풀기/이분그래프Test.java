package 기초알고리즘.그래프_다시_풀기;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 7..
 *
 * 문제 이해
 * 그래프가 주어지면 이분 그래프인지 아닌지 판별하는 문제
 *
 * 입력 방식
 *
 * TestCase
 * 노드의 갯수 N과 간선의 갯수 E
 * 간선의 갯수만큼 노드와 노드를 입력받는다
 *
 */
public class 이분그래프Test {

    이분그래프 application = new 이분그래프();

    @Test
    public void name() throws Exception {
        int numberOfNode = 3, numberOfEdge = 2;
        int[][] edges = new int[][]{
                {1,3},{2,3}
        };

        int startNode = edges[0][0];
        ArrayList<Integer>[] graph = application.makeGraph(edges, numberOfNode, numberOfEdge);
        application.solution(numberOfNode, startNode, graph);
        assertEquals(true, application.getIsbinaryGraph());
    }

    @Test
    public void name1() throws Exception {
        int numberOfNode = 4, numberOfEdge = 4;
        int[][] edges = new int[][]{
                {1,2},
                {2,3},
                {3,4},
                {4,2}
        };
        int startNode = edges[0][0];

        ArrayList<Integer>[] graph = application.makeGraph(edges, numberOfNode, numberOfEdge);
        application.solution(numberOfNode, startNode, graph);
        assertEquals(false, application.getIsbinaryGraph());
    }

    @Test
    public void name2() throws Exception {
        int numberOfNode = 7, numberOfEdge = 6;
        int[][] edges = new int[][]{
                {1,4},
                {1,6},
                {2,4},
                {2,3},
                {5,6},
                {3,5}
        };
        int startNode = edges[0][0];

        ArrayList<Integer>[] graph = application.makeGraph(edges, numberOfNode, numberOfEdge);
        application.solution(numberOfNode, startNode, graph);
        assertEquals(true, application.getIsbinaryGraph());
    }
}