package CodingTest.NHNPretest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 23..
 */
public class problem1Test {

    problem1 application = new problem1();

    @Test
    public void test1() throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String string = br.readLine();

        String string1 = "1 2 3 4 5 6 4 5 3";
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,6));

        assertEquals(arrayList, application.solution(string1));

    }
}