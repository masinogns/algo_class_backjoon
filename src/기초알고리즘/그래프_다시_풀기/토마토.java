package 기초알고리즘.그래프_다시_풀기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 9..
 *
 * m이 가로 n이 세로이다
 */

class tomato{
    int x, y;

    public tomato(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class 토마토 {
    public static final int[] X = {0,0,-1,1};
    public static final int[] Y = {-1,1,0,0};

    // boxes[m][n]이다
    public int solution(int m, int n, int[][] boxes) {
        boolean[][] check = new boolean[m][n];
        int[][] day = new int[m][n];

        tomato now = findPosition(m,n,boxes);
        Queue<tomato> queue = new LinkedList<>();
        queue.add(now);
        int x = now.getX() , y = now.getY();
        if (x == -1 && y == -1)
            return -1;

        check[x][y] = true;
        day[x][y] = 0;

        while (!queue.isEmpty()){
            tomato current = queue.remove();

            for (int k = 0; k < 4; k++){
                int nx = current.getX() + X[k];
                int ny = current.getY() + Y[k];

                if (0 <= nx && nx < m && 0 <= ny && ny < n){
                    if (boxes[nx][ny] == 0 && check[nx][ny] == false){
                        queue.add(new tomato(nx, ny));
                        boxes[nx][ny] = 1;
                        check[nx][ny] = true;
                        day[nx][ny] = day[current.getX()][current.getY()] + 1;
                    }
                }
            }
        }

        int ret = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                ret = Math.max(day[i][j] , ret);
//                System.out.print(day[i][j]+" ");
            }
//            System.out.println();
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (boxes[i][j] == 0 && check[i][j] == false)
                    ret = -1;
            }
        }

        return ret;
    }

    private tomato findPosition(int m, int n, int[][] boxes) {
        tomato ret = new tomato(-1,-1);

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (boxes[i][j] == 1){
                    ret.setX(i);
                    ret.setY(j);
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        토마토 application = new 토마토();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] boxes = new int[M][N];
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                boxes[i][j] = scanner.nextInt();
            }
        }

        int ret = application.solution(M, N,boxes);

        System.out.println(ret);

    }
}
