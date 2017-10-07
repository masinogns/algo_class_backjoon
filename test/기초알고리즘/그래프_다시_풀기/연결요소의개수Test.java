package 기초알고리즘.그래프_다시_풀기;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 5..
 * 연결 그래프(Connected Graph) :
 * 정점의 모든 쌍이 경로를 가지는 무방향성 그래프
 *
 * 연결 요소(Connected Components) :
 * 무방향성 그래프에서 정점들이 최대한 연결되어 있는 하위 그래프. 모든게 연결됨
 출처: http://sanghaklee.tistory.com/22 [이상학의 개발블로그]

 *
 * 문제
 *
 * 방향없는 그래프가 주어진다
 * 노드의 갯수는 N
 * 간선의 갯수는 M
 * 그리고 M개의 G = (U,V) 간선의 양 끝 점을 입력받아 그래프를 완성시킨다
 *
 * 그 후 연결 요소의 갯수를 출력하라
 */
public class 연결요소의개수Test {


    연결요소의개수 application = new 연결요소의개수();

    @Test
    public void name() throws Exception {
        int numberOfNode = 6, numberOfEdge = 5;

        int[][] G = new int[][]{
                {1,2},
                {2,5},
                {5,1},
                {3,4},
                {4,6}
        };

        int[][] graph = application.makeGraph(numberOfNode, numberOfEdge, G);
        // 맨 처음에 입력받는 정점
        assertEquals(2, application.solution(numberOfNode, numberOfEdge, graph));
    }
}