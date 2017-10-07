package 기초알고리즘.그래프_다시_풀기;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 7..
 */
public class 순열사이클Test {
    순열사이클 application = new 순열사이클();

    @Test
    public void name() throws Exception {
        int numberOfPermutation = 8;
        int numberOfNode = numberOfPermutation;
        int[] permutations = new int[]{
                3,2,7,8,1,4,5,6
        };

        int[] graph = application.makeGraph(numberOfPermutation, permutations);

        assertEquals(3, application.solution(numberOfNode, graph));
    }

    @Test
    public void name1() throws Exception {
        int numberOfPermutation = 10;
        int numberOfNode = numberOfPermutation;
        int[] permutations = new int[]{
                2,1,3,4,5,6,7,9,10,8
        };

        int[] graph = application.makeGraph(numberOfPermutation, permutations);

        assertEquals(7, application.solution(numberOfNode, graph));
    }
}