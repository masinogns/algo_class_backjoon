package 중급알고리즘1.분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by masinogns on 2017. 9. 15..
 *
 * TestCase는 통과했는데 시간초과가 난다
 *
 * 1. Scanner를 BufferedReader로 바꿈
 * Scanner의 입력 속도가 굉장히 느리기 때문에. 약 10배의 속도 차이가 발생한다고 한다
 * 2. System.out.print를 StringBuilder로 바꿈
 * print의 출력 속도가 굉장히 느리기 때문에.
 *
 * 하지만 그래도 시간초과가 나는데 비해
 * 백준의 코드는 통과하는데 이유를 모르겠습니드아
 *
 * 심심하니까 리팩토링이나 해야짓 ㅎㅎ
 */
public class 배열합치기 {
    public int[] solution(int n, int m, int[] a, int[] b) {
        int[] d = new int[n+m];

        int i = 0, j = 0, index = 0;

        while (i < n && j < m){
            if (a[i] <= b[j]) d[index++] = a[i++];
            else d[index++] = b[j++];
        }

        while (i < n) d[index++] = a[i++];
        while (j < m) d[index++] = b[j++];

        return d;
    }

    public static void main(String[] args) throws IOException {
        배열합치기 application = new 배열합치기();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split("");

        // N과 M을 입력받음
        int N = Integer.valueOf(line[0]);
        int M = Integer.valueOf(line[1]);

        // A 배열 입력받기 // B 배열 입력받기
        int[] A = makeArray(br, N);
        int[] B = makeArray(br, M);

        // 배열 합치기
        int[] ret = application.solution(N, M, A, B);

        // 결과값인 ret을 stringBuilder로 만듬
        StringBuilder sb = getStringBuilder(ret);

        System.out.println(sb);
    }

    private static StringBuilder getStringBuilder(int[] ret) {
        StringBuilder sb = new StringBuilder();
        for (int i : ret)
            sb.append(i+" ");
        return sb;
    }

    private static int[] makeArray(BufferedReader br, int n) throws IOException {
        String[] line;
        int[] Array = new int[n];
        line = br.readLine().split("");
        for (int i = 0; i < n; i++){
            Array[i] = Integer.valueOf(line[i]);
        }
        return Array;
    }
}