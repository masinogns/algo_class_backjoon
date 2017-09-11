package 기초알고리즘.수학1;

/**
 * Created by masinogns on 2017. 9. 10..
 *
 * Prime Factorization = 소인수 분해
 *
 *
 */
public class _PrimeFactorization {

    public int primeFactorization(int N) {

        for (int i = 2; i*i <= N; i++){
            while (N%i == 0){
                System.out.println(i);          // i는 소수니까 출력시켜주고
                N /= i;                         // N = N/i --> while문의 조건의 N은 N/i바뀐다
            }
        }

        if (N > 1)
            System.out.println(N);
        return 0;
    }
}
