package 기초알고리즘.수학1;

/**
 * Created by masinogns on 2017. 9. 10..
 */
public class _PrimeNumbe {
    public boolean prime(int N) {
        if (N < 2)
            return false;

        for (int i = 2; i < N; i++){
            if (N % i == 0)
                return false;
        }
        return true;
    }

    public boolean fasterPrime(int N) {
        if (N < 2)
            return false;

        for (int i = 2; i < N/2; i++){
            if (N % i == 0)
                return false;
        }
        return true;
    }

    public boolean fastestPrime(int N) {
        if (N < 2)
            return false;

        for (int i = 2; i*i <= N; i++){
            if (N % i == 0)
                return false;
        }

        return true;
    }

    public boolean eratoshenes(int N) {

        int[] p = new int[100];         // 소수 저장
        int pn = 0;                     // 소수의 개수
        boolean[] c = new boolean[101]; // 지워졌으면 true
        int n = 100;                    // 100까지의 소수

        for (int i = 2; i <= N; i++){
            if (c[i] == false){
                p[pn++] = i;

                for (int j = i*i; j<=n; j+=i)
                    c[j] = true;
            }
        }
        return false;
    }


}
