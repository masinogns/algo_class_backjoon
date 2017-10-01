package 중급알고리즘1.분할정복;

/**
 * Created by masinogns on 2017. 10. 1..
 */
public class _MergeSort {
    int[] a = new int[]{6,4,2,7,5,1,8};
    int[] b = new int[100];

    public void sort(int start, int end){
        // 크기가 1 일 때
        if (start == end)
            return;

        int mid = (start + end) / 2;
        sort(start, mid);
        sort(mid+1, end);
        merge(start, end);
    }

    public void merge(int start, int end){
        int mid = (start+end)/2;
        int i = start, j = mid+1, k = 0;

        // i는 왼쪽 배열 범위, j는 오른쪽 배열 범위
        // 왼쪽 배열과 오른쪽 배열을 비교하면서 임시 배열인 b배열을 완성시킨다
        while (i <= mid && j <= end){
            if (a[i] <= a[j]) b[k++] = a[i++];
            else b[k++] = a[j++];
        }

        // 남아있는 수를 모두 옮겨주는 코드
        while (i <= mid) b[k++] = a[i++];
        while (j <= end) b[k++] = a[j++];

        // 임시배열의 값을 a 배열로 옮긴다
        for (int index = start; index <= end; index++)
            a[index] = b[index-start];
    }

    public static void main(String[] args) {
        _MergeSort application = new _MergeSort();

        application.sort(0, application.a.length-1);

        for (int i : application.a)
            System.out.println(i);
    }
}
