package 중급알고리즘1.분할정복;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 2..
 */
public class 버블소트 {
    private int[] a;
    private long count;
    private int[] b;

    public 버블소트() {
        b = new int[1000];
    }

    public void solution(int start, int end) {

        if (start == end)
            return;

        int mid = (start+end)/2;
        solution(start, mid);
        solution(mid+1, end);
        merge(start, end);
    }

    private void merge(int start, int end) {
        int mid = (start+end)/2;

        int i = start, j = mid+1, k = 0;

        while (i <= mid && j <= end){
            if (a[i] <= a[j]) b[k++] = a[i++];
            else {
                count += (mid - i + 1);
                b[k++] = a[j++];
            }
        }

        while (i <= mid) b[k++] = a[i++];
        while (j <= end) b[k++] = a[j++];

        for (int index = start; index < end; index++)
            a[index] = b[index-start];

    }

    public void setA(int[] a) {
        this.a = a;
    }

    public long getCount() {
        return count;
    }

    public static void main(String[] args) {
        버블소트 application = new 버블소트();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = scanner.nextInt();

        application.setA(A);
        application.solution(0, N-1);
        System.out.println(application.getCount());
    }
}
