package CodingTest.NHNPretest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 23..
 */
class XY{
    int x;
    int y;
    public XY(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class problem3 {

    static int[][] visited;
    static int[] mX = {0,1,0,-1};
    static int[] mY = {-1,0,1,0};

    public static void main(String[] args){
        problem3 application = new problem3();

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] map = new int[size][size];

        visited = new int[size][size];
        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                map[i][j] = sc.nextInt();
            }
        }


        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(map[i][j] == 1 && visited[i][j] == 0){
                    queue.add(application.bfs(i,j, map, size));
                    answer++;
                }
            }

        }

        int[] answerSize = null;

        if(!queue.isEmpty()){
            answerSize = new int[queue.size()];
            int i = 0;

            while (!queue.isEmpty()){
                answerSize[i] = queue.poll();
                i++;
            }
            Arrays.sort(answerSize);
        }

        System.out.println(answer);

        if(answerSize.length != 0){
            for(int i = 0; i < answerSize.length; i++)
                System.out.println(answerSize[i]);
        }

    }


    public int bfs(int x, int y, int[][] map, int maxSize){
        Queue<XY> queue = new LinkedList<>();
        queue.add(new XY(x,y));
        visited[x][y] = 1;
        int cnt = 1;

        while (!queue.isEmpty()){
            XY xy = queue.poll();
            int i = xy.x;
            int j = xy.y;
            for(int k = 0; k < 4; k++){
                int nx = i + mX[k];
                int ny = j + mY[k];

                if (0 <= nx && nx < maxSize && 0 <= ny && ny < maxSize) {
                    if (map[nx][ny] == 1 && visited[nx][ny] == 0) {
                        queue.add(new XY(nx, ny));
                        cnt++;
                        visited[nx][ny] = cnt;
                    }
                }
            }
        }

        return cnt;
    }
}
