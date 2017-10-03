package 중급알고리즘1.완전탐색0;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 3..
 */
public class 집합Test {

    집합 application = new 집합();

    @Test
    public void name() throws Exception {
        int total = 0;

        total = total | (1 << 1);
        total = total | (1 << 3);

        System.out.println(total & (1 << 1));
        System.out.println(total & (1 << 2));
        System.out.println(total & (1 << 3));

        String s = new String("add 1");
        String[] strings = s.split(" ");

        System.out.println(strings[0]);
        System.out.println(strings[1]);

    }
}