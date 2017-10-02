package 중급알고리즘1.분할정복;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 2..
 *
 * 애매하게 맞았넹..
 */

public class Z {
    private int n;
    private int[][] map;
    private int count;

    public void setN(int n) {
        this.n = n;
    }

    public void setMap(int size) {
        int mapSize = (int) Math.pow(2, size+1);
        map = new int[mapSize][mapSize];
    }

    public void solution(int x, int y, int n, int count) {
        if (n == 1){
            for (int i = x; i < x+2; i++){
                for (int j = y; j < y+2; j++){
                    map[i][j] = count++;
                }
            }
        }else {
            int m = n / 2;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    solution(x + i * 2, y + j * 2, m, count);
                    count+=4;
                }
            }
        }
    }

    public int getPosition(int x, int y) {
        return map[x][y];
    }

    public int[][] getMap() {
        return map;
    }

    public static void main(String[] args) {
        Z application = new Z();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        application.setN(N);
        application.setMap(N);
        application.solution(0,0, (int) Math.pow(2, N), 0);

        System.out.println(application.getPosition(X, Y));
    }
}
