package 중급알고리즘1.완전탐색0;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 3..
 *
 * N이 주어졌을 때 1부터 N까지의 수로 이루어진 순열을 사전순으로 출력하는 프로그램
 */
public class 모든순열Test {

    모든순열 application = new 모든순열();

    @Test
    public void name() throws Exception {
        int N = 3;

        application.solution(N);
    }
}