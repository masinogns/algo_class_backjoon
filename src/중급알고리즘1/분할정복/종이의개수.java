package 중급알고리즘1.분할정복;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class 종이의개수 {

    private int[] cnt = new int[3];

    public int[] getCnt() {
        return cnt;
    }

    public void solution(int[][] papers, int x, int y, int size) {
        if (isSameRange(papers, x, y, size)){
            cnt[papers[x][y]+1] += 1;

            return;
        }

        int m = size / 3;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                solution(papers, x+i*m, y+j*m, m);
            }
        }
    }

    private boolean isSameRange(int[][] papers, int x, int y, int size) {
        for (int i = x; i < x+size; i++){
            for (int j = y; j < y+size; j++){
                if (papers[x][y] != papers[i][j])
                    return false;
            }
        }
        return true;
    }
}
