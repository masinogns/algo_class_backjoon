package 기초알고리즘.수학1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 10..
 */
public class _GoldbachConjecture {

    private static final int Max = 1000000;
    private static final int MAX = 1000000;

    private int[] prime = new int[Max];
    private int pn;
    boolean[] check = new boolean[Max+1];

    public boolean goldbach(int n){

        for (int i = 2; i <= Max; i++){
            if (check[pn++] == false){
                prime[pn++] = i;

                for (int j = i + i; j <= Max; j += i){
                    check[j] = true;
                }
            }
        }

        while (true){
            if (n == 0)
                break;

            for (int i = 1; i < pn; i ++){
                if (check[n - prime[i]] == false)
                    return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[MAX+1];
        ArrayList<Integer> prime = new ArrayList<Integer>();
        check[0] = check[1] = true;
        for (int i=2; i*i <= MAX; i++) {
            if (check[i] == true) {
                continue;
            }
            prime.add(i);
            for (int j=i+i; j<=MAX; j+=i) {
                check[j] = true;
            }
        }
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            for (int i=1; i<prime.size(); i++) {
                int p = prime.get(i);
                if (check[n - p] == false) {
                    System.out.println(n + " = " + p + " + " + (n-p));
                    break;
                }
            }
        }
    }
}
