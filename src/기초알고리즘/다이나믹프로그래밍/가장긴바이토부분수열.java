package 기초알고리즘.다이나믹프로그래밍;

import java.util.Stack;

/**
 * Created by masinogns on 2017. 9. 15..
 */
public class 가장긴바이토부분수열 {
    public int solution(int n, int[] a) {
        // 가장 긴 증가하는 부분 수열의 길이
        int[] D = new int[n];
        D = findIncreaseA(D, a);

        // 가장 긴 감소하는 부분 수열의 길이
        int[] D2 = new int[n];
        D2 = findDecreaseA(D2, a);

        // 가장 긴 바이토닉 부분 수열
        // 가장 긴 증가하는 부분 + 가장 긴 감소하는 부분 - 1
        int ans = D[0] + D2[0] - 1;
        for (int i = 0; i < n; i++){
            if (ans < D[i] + D2[i] - 1)
                ans = D[i] + D2[i] - 1;
        }

        return ans;
    }

    private int[] findDecreaseA(int[] D2, int[] a) {
        for (int i = D2.length-1; i >= 0 ; i--){
            D2[i] = 1;
            for (int j = i+1; j < D2.length; j++){
                if (a[i] > a[j] && D2[j] + 1 > D2[i]){
                    D2[i] = D2[j] + 1;
                }
            }
        }
        return D2;
    }

    private void printArray(int[] a) {
        for (Integer integer : a)
            System.out.print(integer + " ");
        System.out.println();
    }

    private int[] reverseArray(int n, int[] a) {
        Stack<Integer> reverse = new Stack<>();
        for (Integer integer : a)
            reverse.push(integer);

        for (int i = 0; i < n; i++){
            a[i] = reverse.pop();
        }
        return a;
    }

    private int[] findIncreaseA(int[] D, int[] a) {
        for (int i = 0; i < D.length; i++){
            D[i] = 1;
            for (int j = 0; j < i; j++){
                if (a[j] < a[i] && D[i] < D[j] + 1)
                    D[i] = D[j] + 1;
            }
        }

        return D;
    }
}
