package 중급알고리즘1.이분탐색;

import java.util.Arrays;

/**
 * Created by masinogns on 2017. 10. 2..
 *
 * M 미터 보다 작다면 M 미터를 충족시키기 위해서 나무를 좀 더 잘라야 하므로
 * 절단기의 Height을 낮춰야 한다 그러면 left 쪽을 봐야하고
 *
 * M 미터 보다 높다면 M 미터를 충족했기 때분에 최대한의 Height를 찾기 위해서
 * 절단기의 Height을 높여야 한다 그러면 right 쪽을 봐야한다
 *
 */
public class 나무자르기 {
    private int numberOfTree;
    private int m;
    private int[] trees;
    private int ret;

    public void setNumberOfTree(int numberOfTree) {
        this.numberOfTree = numberOfTree;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setTrees(int[] trees) {
        this.trees = trees;
    }

    public int[] getTrees() {
        return trees;
    }

    public int findMaxLength(int[] trees) {
        Arrays.sort(trees);
        return trees[trees.length-1];
    }

    public int getM() {
        return m;
    }

    public int getRet() {
        return ret;
    }

    public void solution(int start, int end, int target, int[] trees) {
        int left = start, rigth = end;
        int height;

        while (left <= rigth){
            height = (left + rigth) / 2;

            // 적어도 M미터를 확보했고 Height를 높여가면서 M미터를 줄여가는 것
            if (isBiggerThanM(height, target, trees)){
                ret = Math.max(ret, height);
                left = height + 1;
            }else
                rigth = height - 1;
        }
    }

    private boolean isBiggerThanM(int height, int target, int[] trees) {
        int count = 0;

        for (int tree : trees){
            if (tree - height > 0)
                count += tree - height;
        }

        if (target <= count)
            return true;

        return false;
    }
}
