package CodingTest.kakao;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 16..
 */
public class problem3Test {

    problem3 application = new problem3();

    @Test
    public void test1() throws Exception {
        int cacheSize = 3;
        String[] cities = new String[]{
                "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"
        };
        assertEquals(50, application.solution(cacheSize, cities));
    }

    @Test
    public void test2() throws Exception {
        int cacheSize = 3;
        String[] cities = new String[]{
                "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"
        };
        assertEquals(21, application.solution(cacheSize, cities));
    }

    @Test
    public void test3() throws Exception {
        int cacheSize = 2;
        String[] cities = new String[]{
                "Jeju", "Pangyo", "Seoul", "NewYork", "LA",
                "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"
        };
        assertEquals(60, application.solution(cacheSize, cities));
    }

    @Test
    public void test4() throws Exception {
        int cacheSize = 5;
        String[] cities = new String[]{
                "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco",
                "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"
        };
        assertEquals(52, application.solution(cacheSize, cities));
    }

    @Test
    public void test5() throws Exception {
        int cacheSize = 2;
        String[] cities = new String[]{
                "Jeju", "Pangyo", "NewYork", "newyork"
        };
        assertEquals(16, application.solution(cacheSize, cities));
    }

    @Test
    public void test6() throws Exception {
        int cacheSize = 0;
        String[] cities = new String[]{
                "Jeju", "Pangyo", "Seoul", "NewYork", "LA"
        };
        assertEquals(25, application.solution(cacheSize, cities));
    }


}