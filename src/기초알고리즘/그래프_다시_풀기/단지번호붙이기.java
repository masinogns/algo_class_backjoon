package 기초알고리즘.그래프_다시_풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by masinogns on 2017. 10. 9..
 */
public class 단지번호붙이기 {

    public static final int[] X = new int[]{0,0,-1,1};
    public static final int[] Y = new int[]{-1,1,0,0};
    public ArrayList<Integer> result;

    public int getTotal(){
        return result.size();
    }

    public void solution(int mapSize, int[][] map) {

        boolean[][] check = new boolean[mapSize][mapSize];
        result = new ArrayList<>();

        int total = 0;
        for (int i = 0; i < mapSize; i++){
            for (int j = 0; j < mapSize; j++){
                if (map[i][j] == 1 && check[i][j] == false){
                    int ans = DFS(i, j, check, map, mapSize, 0);
                    total++;
                    result.add(ans);
                }
            }
        }

        System.out.println(result.size());

        Collections.sort(result);
        for (Integer integer : result)
            System.out.println(integer);

    }

    private int DFS(int x, int y, boolean[][] check, int[][] map, int mapSize, int count) {
        check[x][y] = true;
        count++;

        for (int i = 0; i < 4; i++){
            int nx = x + X[i];
            int ny = y + Y[i];
            if (0 <= nx && 0 <= ny && nx < mapSize && ny < mapSize){
                if (map[nx][ny] == 1 && check[nx][ny] == false){
                    count = DFS(nx, ny, check, map, mapSize, count++);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        단지번호붙이기 application = new 단지번호붙이기();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mapSize = Integer.parseInt(br.readLine());

        int[][] map = new int[mapSize][mapSize];
        String[] mapString = new String[mapSize];
        for (int i = 0; i < mapSize; i++){
            mapString[i] = br.readLine();
        }

        for (int i = 0; i < mapSize; i++){
            String[] strings = mapString[i].split("");

            for (int j = 0; j < mapSize; j++){
                map[i][j] = Integer.parseInt(strings[j]);
            }
        }


        application.solution(mapSize, map);
    }
}
