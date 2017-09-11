package 기초알고리즘.수학1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 10..
 */
public class GCD합 {
    public int solution(int[] A) {
        int sum = 0;

        for (int i = 0; i < A.length-1; i++){
            for (int j = i+1; j < A.length; j++){
                sum += gcd(A[i], A[j]);
                System.out.println(A[i]+" "+A[j]+" : "+gcd(A[i], A[j]));
            }
        }
        return sum;
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b,a%b);
    }


}
