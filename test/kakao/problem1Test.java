package kakao;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 16..
 */
public class problem1Test {

    problem1 application = new problem1();

    @Test
    public void test1() throws Exception {
        int n = 5;
        int[] arr1 = new int[]{9, 20, 28, 18, 11};
        int[] arr2 = new int[]{30, 1, 21, 17, 28};

        String[] result = new String[]{
                "#####",
                "# # #",
                "### #",
                "#  ##",
                "#####"
        };

        assertArrayEquals(result, application.solution(n, arr1, arr2));
    }

    @Test
    public void test2() throws Exception {
        int n = 6;
        int[] arr1 = new int[]{46, 33, 33 ,22, 31, 50};
        int[] arr2 = new int[]{27 ,56, 19, 14, 14, 10};

        String[] result = new String[]{
                "######",
                "###  #",
                "##  ##",
                " #### ",
                " #####",
                "### # "
        };

        assertArrayEquals(result, application.solution(n, arr1, arr2));
    }
}