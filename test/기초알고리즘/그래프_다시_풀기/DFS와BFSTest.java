package 기초알고리즘.그래프_다시_풀기;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 5..
 */
public class DFS와BFSTest {

    DFS와BFS application;

    @Test
    public void name() throws Exception {
        int numberOfNode = 4;
        int numberOfEdge = 5;
        int startNode = 1;

        application = new DFS와BFS(numberOfNode, numberOfEdge, startNode);

        ArrayList<Integer> resultOfDFS = new ArrayList<>(Arrays.asList(1,2,4,3));
        ArrayList<Integer> resultOfBFS = new ArrayList<>(Arrays.asList(1,2,3,4));


        int[][] graph = new int[][]{
                {1,2},{1,3},{1,4},
                {2,4},
                {3,4}
        };

        int[][] makedGraph = application.makingGraph(graph);

        assertEquals(resultOfBFS, application.bfsRunning(makedGraph));

        boolean[] check = new boolean[numberOfNode+1];
        application.dfsRunning(startNode, makedGraph,check);
        assertEquals(resultOfDFS, application.getDFS());
    }
}