package 중급알고리즘1.완전탐색0;

/**
 * Created by masinogns on 2017. 10. 4..
 */
public class 모든순열백준꺼 {
    public static boolean next_permutation(int[] a) {
        int i = a.length-1;
        while (i > 0 && a[i-1] >= a[i]) {
            i -= 1;
        }

        // 마지막 순열
        if (i <= 0) {
            return false;
        }

        int j = a.length-1;
        while (a[j] <= a[i-1]) {
            j -= 1;
        }

        int temp = a[i-1];
        a[i-1] = a[j];
        a[j] = temp;

        j = a.length-1;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i += 1;
            j -= 1;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] d = new int[3];

        d = new int[]{1,2,3};
        do {
            for (int i : d)
                System.out.print(i+" ");
            System.out.println();
        }while (next_permutation(d));
    }
}
