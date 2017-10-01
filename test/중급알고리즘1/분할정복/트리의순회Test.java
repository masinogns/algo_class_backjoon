package 중급알고리즘1.분할정복;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masinogns on 2017. 10. 1..
 */
public class 트리의순회Test {

    트리의순회 application = new 트리의순회();

    @Test
    public void name() throws Exception {

        // 정점 N개
        int N = 3;

        // PreOrder 배열과 PostOrder 배열이 주어진다
        int[] inOrder = new int[]{1,2,3};
        int[] postOrder = new int[]{1,3,2};
        application.setInOrder(inOrder);
        application.setPostOrder(postOrder);

        int[] preOrder = new int[]{2,1,3};

        assertArrayEquals(preOrder, application.solution());
    }
}