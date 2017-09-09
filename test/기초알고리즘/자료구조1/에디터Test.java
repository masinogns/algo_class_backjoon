package 기초알고리즘.자료구조1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 9..
 *
 * 입력
 첫째 줄에는 초기에 편집기에 입력되어 있는 문자열이 주어진다.
 이 문자열은 영어 소문자로만 이루어져 있으며, 길이는 100,000을 넘지 않는다.
 둘째 줄에는 입력할 명령어의 개수를 나타내는 정수 N(1≤N≤500,000)이 주어진다.
 셋째 줄부터 N개의 줄에 걸쳐 입력할 명령어가 순서대로 주어진다. 명령어는 위의 네 가지 중 하나의 형태로만 주어진다.

 출력
 첫째 줄에 모든 명령어를 수행하고 난 후 편집기에 입력되어 있는 문자열을 출력한다.
 */
public class 에디터Test {

    에디터 controller = new 에디터();

    @Test
    public void test1() throws Exception {

        String[] commands = new String[]{
                "P x","L","P y"
        };
        assertEquals("abcdyx",controller.solution("abcd", commands));

    }
}