package 기초알고리즘.그래프;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 11..
 */
public class TermProjectTest {

    @Test
    public void name() throws Exception {
        TermProject application = new TermProject();

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(3,1,3,7,3,4,6));

        assertEquals(3, application.solution(7, array));

    }


    @Test
    public void test() throws Exception {
        TermProject application = new TermProject();

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        assertEquals(0, application.solution(8, array));

    }

    @Test
    public void test2() throws Exception {
        TermProjectMine application = new TermProjectMine();

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        assertEquals(0, application.solution(8, array));

    }

    @Test
    public void name2() throws Exception {
        TermProjectMine application = new TermProjectMine();

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(3,1,3,7,3,4,6));

        assertEquals(3, application.solution(7, array));

    }
}