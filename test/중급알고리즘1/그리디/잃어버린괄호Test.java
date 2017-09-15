package 중급알고리즘1.그리디;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 14..
 */
public class 잃어버린괄호Test {

    잃어버린괄호 application = new 잃어버린괄호();

    @Test
    public void test1() throws Exception {
        assertEquals(-35, application.solution(new String("55-50+40")));

    }
}