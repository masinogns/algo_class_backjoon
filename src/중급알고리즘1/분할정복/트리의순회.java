package 중급알고리즘1.분할정복;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 1..
 *
 * solve(inOrderStart, inOrderEnd, postOrderStart, postOrderEnd)
 * root = postOrder[postOrderEnd];
 * inOrderRootIndex = findRootIndex(root)
 * leftArrayNumber = inOrderRootIndex - inOrderStart
 *
 * in the situation ( post order )
 * ps ~ ps+leftArrayNumber-1 ;
 * ps+leftArrayNumber ~ pe-1 ;
 *
 * root 왼쪽 자식
 * solve(inOrderStart, inOrderRootIndex-1,
 *      postOrderStart, postOrderStart+leftArrayNumber-1)
 *
 * root 오른쪽 자식
 * solve(inOrderRootIndex+1, inOrderEnd,
 *      postOrderStart+leftArrayNumber, postOrderEnd-1)
 *
 * 값은 PostOrder의 Root들을 찾아나가면 된다
 */
public class 트리의순회 {
    private int[] inOrder;
    private int[] postOrder;
    private ArrayList<Integer> ret;

    public int[] solution() {
        ret = new ArrayList<>();

        solve(0, inOrder.length-1, 0, postOrder.length-1);
        int[] array = ret.stream().mapToInt(i->i).toArray();

        return array;
    }

    private void solve(int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) return;
        int root = postOrder[postEnd];
        ret.add(root);

        int rootIndex = searchRootIndex(root);

        // inOrder 루트의 위치에서 inOrder 시작의 위치를 빼주면 왼쪽 자식의 숫자가 나오게 된다
        // 왼쪽 부분은 왼쪽의 inOrder, postOrder와 오른쪽 부분은 오른쪽 부분의 inOrder, postOrder와 연산
        int lefArrayNumber = rootIndex - inStart;
        // 왼쪽 부분
        solve(inStart, rootIndex-1, postStart, postStart+lefArrayNumber-1);
        // 오른쪽 부분
        solve(rootIndex+1, inEnd, postStart+lefArrayNumber, postEnd-1);

    }

    private int searchRootIndex(int root) {
        for (int i = 0; i < inOrder.length; i++){
            if (root == inOrder[i])
                return i;

        }
        return 0;
    }

    public void setInOrder(int[] inOrder) {
        this.inOrder = inOrder;
    }

    public void setPostOrder(int[] postOrder) {
        this.postOrder = postOrder;
    }

    public static void main(String[] args) {
        트리의순회 application = new 트리의순회();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] inOrder = makeArray(scanner, N);
        int[] postOrder = makeArray(scanner, N);

        application.setInOrder(inOrder);
        application.setPostOrder(postOrder);

        int[] ret = application.solution();

        for (int i : ret)
            System.out.print(i+" ");
    }

    private static int[] makeArray(Scanner scanner, int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
