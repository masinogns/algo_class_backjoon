package 중급알고리즘1.분할정복;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 1..
 */
public class 별찍기10 {

    private int size;
    private char map[][];
    private final static int BLANK = 0;
    private final static int STAR = 1;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setMap(int size) {
        map = new char[size][size];
    }

    public char[][] getMap() {
        return map;
    }

    public void solution(int x, int y, int n, int color) {
        int i, j;
        int newColoar;

        if (color == BLANK){
            for (i = x; i < x+n; i++){
                for (j = y; j < y+n; j++){
                    map[i][j] = ' ';
                }
            }
        }else {
            if (n==1){
                map[x][y] = '*';
            }else {
                newColoar = STAR;

                int m = n / 3;

                for (i = 0; i < 3; i++){
                    for (j = 0; j < 3; j++){
                        if (i == 1 && j == 1)
                            newColoar = BLANK;
                        else
                            newColoar = STAR;

                        solution(x+m*i, y+m*j, m, newColoar);
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        별찍기10 application = new 별찍기10();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        application.setSize(N);
        application.setMap(application.getSize());

        application.solution(0,0, N,1);

        char[][] ret = application.getMap();

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print(ret[i][j]);
            }
            System.out.println();
        }
    }
}
