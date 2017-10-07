package 기초알고리즘.그래프_다시_풀기;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 7..
 *
 * int numberOfStudents = 학생 수
 * int wantYou = 원하는, 선택된 학생 수
 */
public class 텀프로젝트Test {

    텀프로젝트 application = new 텀프로젝트();

    @Test
    public void name() throws Exception {
        int numberOfStudents = 7;
        int[] wantYou = new int[]{
                3,1,3,7,3,4,6
        };

        int[][] graph = application.makeGraph(numberOfStudents, wantYou);

        application.solution(numberOfStudents, graph);
        assertEquals(3, numberOfStudents - application.getCount());

    }

    @Test
    public void name1() throws Exception {
        int numberOfStudents =8;
        int[] wantYou = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8
        };

        int[][] graph = application.makeGraph(numberOfStudents, wantYou);

        application.solution(numberOfStudents, graph);
        assertEquals(0, numberOfStudents - application.getCount());

    }
}