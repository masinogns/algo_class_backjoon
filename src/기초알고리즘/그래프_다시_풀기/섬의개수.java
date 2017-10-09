package 기초알고리즘.그래프_다시_풀기;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 9..
 *
 * width , height 헷갈리니 조심할 것
 */
public class 섬의개수 {

    public static final int[] X = {-1,-1,-1,0,0,0,1,1,1};
    public static final int[] Y = {-1,0,1,-1,0,1,-1,0,1};

    public int solution(int width, int height, int[][] map) {

        boolean[][] check = new boolean[height][width];

        int total = 0;
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                if (map[i][j] == 1 && check[i][j] == false){
                    DFS(i, j, width, height, map, check);
                    total++;
                }
            }
        }
        return total;
    }

    private void DFS(int i, int j, int width, int height, int[][] map, boolean[][] check) {
        check[i][j] = true;

        for (int k = 0; k < 9; k++){
            int nx = i + X[k];
            int ny = j + Y[k];

            if (0 <= nx && nx < height && 0 <= ny && ny < width){
                if (map[nx][ny] == 1 && check[nx][ny] == false){
                    DFS(nx, ny, width, height, map, check);
                }
            }
        }
    }

    public static void main(String[] args) {
        섬의개수 application = new 섬의개수();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            int width = scanner.nextInt();
            int height = scanner.nextInt();

            if (width == 0 && height == 0)
                break;

            int[][] map = new int[height][width];
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    map[i][j] = scanner.nextInt();
                }
            }

            int ret = application.solution(width, height, map);

            System.out.println(ret);

        }

    }
}
