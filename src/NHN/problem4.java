package NHN;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by masinogns on 2017. 9. 18..
 */
public class problem4 {
    public int solution(int n, int[] a) {

        String sum = "";

        Arrays.sort(a);

        for (int i = a.length-1; i >= 0; i--){
            sum += String.valueOf(a[i]);
        }
        System.out.println(sum);

        Stack<Integer> stack = new Stack<>();

        for (int i : a)
            stack.push(i);

        for (int i = 0; i < a.length; i++){
            a[i] = stack.pop();
        }

        String sum2 = "";
        for (int i = a.length-1; i >= 0; i--){
            sum2 += String.valueOf(a[i]);
        }



        return Integer.parseInt(sum)+Integer.parseInt(sum2);
    }

    public static void main(String[] args) {
        problem4 application = new problem4();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }

        int ret = application.solution(N, A);

        System.out.println(ret);
    }
}
