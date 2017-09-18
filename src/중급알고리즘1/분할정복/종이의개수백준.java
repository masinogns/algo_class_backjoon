package 중급알고리즘1.분할정복;

/**
 * Created by masinogns on 2017. 9. 15..
 *
 * 분석을 시작한다
 */

import java.io.*;

public class 종이의개수백준{
    /**
     * 한 종이 영역 안에 같은 값들이 있는지 확인하는 로직
     *
     * @param a :   N*N 종이 배열
     * @param x :   x좌표
     * @param y :   y좌표
     * @param n :   종이 N size
     * @return
     *
     *      figure 02   x, y와 x+something , y+something 의 값들을 비교한다
     *      same(a, 0, 0, 9)
     *      반복 행 사이즈 = x좌표 0 + 9
     *      반복 열 사이즈 = y좌표 0 + 9
     *      만약 a[x좌표 0][y좌표 0]이 a[x좌표 0 + i][y좌표 0 + i] 값이 같다면
     *      계속한다.
     *      값이 다르다면 false를 리턴한다
     */
    public static boolean same(int[][] a, int x, int y, int n) {
        for (int i=x; i<x+n; i++) {
            for (int j=y; j<y+n; j++) {
                if (a[x][y] != a[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * solve(x,y,n) : (x,y)부터 가로로 n개, 세로로 n개의 종이 개수를 확인하는 함수
     * 문제에서 제시된 작은 부분 문제는 총 9개이므로 m = n/3라고 문제를 나눌 수 있다
     *
     * @param a :   N*N 종이 배열
     * @param cnt : -1,0,1 출력 배열
     * @param x :   x좌표
     * @param y :   y좌표
     * @param n :   종이 N size
     *
     *          figure 01 x,y에 들어가는 +3되는 부분이 i*m(=3)인 부분이다
     *          solve(0,0,3)    solve(0,0+3,3)      solve(0,0+6,3)
     *          solve(0+3,0,3)  solve(0+3,0+3,3)    solve(0+3,0+6,3)
     *          solve(0+6,0,3)  solve(0+6,0+3,3)    solve(0+6,0+6,3)
     */
    public static void solve(int[][] a, int[] cnt, int x, int y, int n) {
        // 같은지를 확인하는 로직
        // same이 true라면 밑에 count값을 하나 증가시킨다
        if (same(a, x, y, n)) {
            // a[x][y]의 값이 -1, 0, 1이기 때문에 -1때문에 +1을 해준다
            // 그 다음 종이가 same하다면 count를 +1 해준다
            cnt[a[x][y]+1] += 1;
            return;
        }

        // same이 true가 아니라면 종이를 9개로 나누고 나누는 부분이 same이 true인지 false인 확인한다
        // 문제에서 작은 부분 문제는 총 9개라고 명시
        int m = n/3;

        // 행과 열을 1씩 증가해가면서 x,y를 m만큼 증가시키면서 같은 번호인지 확인하고 있다
        // for문을 돌았을 때 실행되는 반복문들의 시각적인 모습 figure 01
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                solve(a, cnt, x+i*m, y+j*m, m);
            }
        }
    }

    /**
     * @variable br :   입력을 위한 BufferedReader
     * @variable n :    종이의 사이즈를 입력받는 변수
     * @variable a[][] :종이 사이즈 * 사이즈만큼의 종이들을 저장할 배열 변수
     * @variable cnt[]: -1, 0, 1로만 채워진 종이 갯수들을 저장
     */
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[][] a = new int[n][n];
        int[] cnt = new int[3];

        // String을 입력받아서 Integer로 변환하고 종이 저장 배열인 a에 저장한다
        for (int i=0; i<n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j=0; j<n; j++) {
                a[i][j] = Integer.valueOf(line[j]);
            }
        }

        // Main Logic 종이들 찾는 로직
        // 9*9사이즈의 종이와 -1,0,1을 넣을 배열, x좌표, y좌표, 종이 size를 파라미터로 받는다
        solve(a, cnt, 0, 0, n);

        // -1, 0, 1로만 채워진 종이 갯수들 출력
        for (int i=0; i<3; i++) {
            System.out.println(cnt[i]);
        }
    }
}
