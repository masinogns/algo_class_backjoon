package 기초알고리즘.그래프;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 10..
 * int[][] e = {{1,2},{1,5},{2,3},{2,4},{2,5},{5,4},{4,3},{4,6},{2,1},{5,1},{3,2},{4,2},{5,2},{4,5},{3,4},{6,4}};
 입력 테스트
 6 8
 1 2
 1 5
 2 3
 2 4
 2 5
 5 4
 4 3
 4 6
 */
public class _Edge_List {

    private static final int STARTVERTEX = 0;
    private static final int ENDVERTEX = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();      // 간선 숫자

        int[][] E = new int[M*2][2];

        for(int i = 0; i < M; i++){
            int u = 0, v = 0;
            u = scanner.nextInt();
            v = scanner.nextInt();

            E[i][STARTVERTEX] = u;
            E[i+M][STARTVERTEX] = v;
            E[i][ENDVERTEX] = v;
            E[i+M][ENDVERTEX] = u;
        }

        for (int i = 0; i < M*2; i++){
            System.out.println("Vertex Index : "+i+" ->"+E[i][STARTVERTEX]+" "+E[i][ENDVERTEX]);
        }

        Arrays.sort(E, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0])
                    return Integer.compare(o1[1], o2[1]);

                int time1 = o1[0];
                int time2 = o2[0];
                return Integer.compare(time1,time2);
            }
        });

        System.out.println("");
        System.out.println("");
        for (int i = 0; i < M*2; i++){
            System.out.println("Vertex Index : "+i+" ->"+E[i][STARTVERTEX]+" "+E[i][ENDVERTEX]);
        }

        // 정점이 연결된 갯수를 카운팅하는 부분
        int[] cnt = new int[M];
        for (int i = 0; i < M*2 ; i++){
            cnt[E[i][0]] += 1;
        }

        // 정점이 연결된 갯수를 출력하는 부분
        for (int i = 0; i <= N; i++){
            System.out.println(cnt[i]);
        }

        // 정점이 연결된 갯수를 더하는 부분
        for (int i = 1; i <= N; i++){
            cnt[i] = cnt[i-1] + cnt[i];
        }

        for (int i = 1; i <= N; i++){
            System.out.println(cnt[i]);
        }

        // i번째 정점과 연결된 간선은 E배열에서 cnt[i-1] ~ cnt[i]-1
        // 4번째 정점과 연결된 간선들을 출력하는 방법
        System.out.println("");
        System.out.println(cnt[3]);
        System.out.println(cnt[4]);
        for (int i = cnt[3]; i < cnt[4]; i++){
            System.out.println(E[i][STARTVERTEX] +"_"+ E[i][ENDVERTEX]);
        }


    }
}
