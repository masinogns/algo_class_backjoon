package 중급알고리즘1.분할정복;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class 배열합치기 {
    public int[] solution(int n, int m, int[] a, int[] b) {
        int[] d = new int[n+m];

        int i = 0, j = 0, index = 0;

        while (i < n || j < m) {
            if (j >= m ||(i < n && a[i] <= b[j]) )
                d[index++] = a[i++];
            else
                d[index++] = b[j++];
        }

        return d;
    }
}
