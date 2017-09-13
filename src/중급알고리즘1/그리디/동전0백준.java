package 중급알고리즘1.그리디;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 12..
 */
public class 동전0백준 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;

        // 중요 로직
        for (int i=n-1; i>=0; i--) {
            ans += k/a[i];
            k %= a[i];
        }

        System.out.println(ans);
    }
}