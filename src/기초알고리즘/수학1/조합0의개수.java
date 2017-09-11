package 기초알고리즘.수학1;

import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 10..
 *
 * nCm = n! / m!(n-m)!  n > m
 */
public class 조합0의개수 {
    public int solution(int N, int M) {

        int two = 0, five = 0;

        for (int i = 2; i <= N; i*=2){
            two += N / i;
        }
        for (int i = 2; i <= M; i*=2){
            two -= M / i;
        }
        for (int i = 2; i <= N-M; i*=2){
            two -= (N-M) / i;
        }

        for (int i = 5; i <= N; i*=5){
            five += N / i;
        }
        for (int i = 5; i <= M; i*=5){
            five -= M / i;
        }
        for (int i = 5; i <= N-M; i*=5){
            five -= (N-M) / i;
        }

        return Math.min(two, five);
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long two = 0, five = 0;

        for (long i=2; i<=n; i*=2) {
            two += n/i;
        }
        for (long i=2; i<=n-m; i*=2) {
            two -= (n-m)/i;
        }
        for (long i=2; i<=m; i*=2) {
            two -= m/i;
        }

        for (long i=5; i<=n; i*=5) {
            five += n/i;
        }
        for (long i=5; i<=n-m; i*=5) {
            five -= (n-m)/i;
        }
        for (long i=5; i<=m; i*=5) {
            five -= m/i;
        }

        System.out.println(two);
        System.out.println(five);
        System.out.println(Math.min(two,five));
    }
}
