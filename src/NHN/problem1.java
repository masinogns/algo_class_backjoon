package NHN;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 9. 18..
 */
public class problem1 {
    public long[] solution(int n, long[] a) {

        Arrays.sort(a);

        long[] temp = new long[2];

        long dif = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++){
            long min = a[i]-a[i-1];
            if(min < dif){
                dif = min;
                temp[0] = a[i-1];
                temp[1] = a[i];
            }
        }

        return temp;
    }

    public static void main(String[] args) {

        problem1 application = new problem1();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long[] A = new long[N];
        for (int i = 0; i < N; i++){
            A[i] = scanner.nextLong();
        }

        long[] result = new long[2];

        result = application.solution(N, A);

        System.out.println(result[0]+" "+result[1]);

    }
}
