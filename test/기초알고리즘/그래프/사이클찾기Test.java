package 기초알고리즘.그래프;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 9. 11..
 *
 * 배열의 인덱스가 1부터 시작되기 때문에 인덱스를 1을 늘릴 생각을 해주어야하는데
 * 배열의 인덱스 0 일 때 0을 넣고 배열의 값들을 인덱스 하나 밀린 뒤부터 값을 저장하는 형태로
 * 문제를 해결해 나갔다
 *
 * 문제 사이클 찾기는 순열 그래프 찾기인데 이것은 연결요소와 비슷한 부분이 많다
 *
 * 강의 소스에서 배열의 인덱스 0을 어떻게 처리해나가는지 봐야겠다
 *
 * 내 소스를 solution에서 a[i].add(array[i-1])로 바꿔주기만 하면 배열의 인덱스를 미룰 필요가 없어진다
 */
public class 사이클찾기Test {

    @Test
    public void test1() throws Exception {
        사이클찾기 application = new 사이클찾기();


        int arraySize = 8;
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(3,2,7,8,1,4,5,6));
        //ArrayList<Integer> array = new ArrayList<>(Arrays.asList(0,    3,2,7,8,1,4,5,6));
        // 원래 위의 소스처럼 배열을 초기화했는데 그러면 뒤에서 a[i].add(array[i-1])

        assertEquals(3, application.solution(arraySize, array));
    }

    @Test
    public void test2() throws Exception {
        사이클찾기 application = new 사이클찾기();


        int arraySize = 10;
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(2,1,3,4,5,6,7,9,10,8));

        assertEquals(7, application.solution(arraySize, array));
    }
}