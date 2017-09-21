package NHN;

import java.util.*;

/**
 * Created by masinogns on 2017. 9. 18..
 */

class Number{
    int first;
    int second;
    boolean hasTwoPosition;

    public Number(int first, int second, boolean hasTwoPosition) {
        this.first = first;
        this.second = second;
        this.hasTwoPosition = hasTwoPosition;
    }
}

class orderFirstAscending implements Comparator<Number> {

    @Override
    public int compare(Number o1, Number o2) {
        int val1 = o1.first;
        int val2 = o2.first;

        if (val1 == val2){
                return Integer.compare(o1.second, o2.second);
        }
        return Integer.compare(val1, val2);
    }
}

public class problem4 {
    public long solution(int n, int[] a) {

        Number[] number = new Number[n];

        for (int i = 0; i < n; i++) {
            if (a[i] > 9){
                int first = Integer.parseInt(String.valueOf(String.valueOf(a[i]).charAt(0)));
                int second = Integer.parseInt(String.valueOf(String.valueOf(a[i]).charAt(1)));
                number[i] = new Number(first, second, true);
            }else {
                number[i] = new Number(a[i], a[i], false);
            }
        }

        Arrays.sort(number, new orderFirstAscending());

        String ret1 = "";

        for (int i = 0; i < n; i++){
            if (number[i].hasTwoPosition){
                ret1 += String.valueOf(number[i].first);
                ret1 += String.valueOf(number[i].second);
            }else {
                ret1 += String.valueOf(number[i].first);
            }
        }

        String ret2 = "";

        for (int i = n-1; i >= 0 ; i--){
            if (number[i].hasTwoPosition){
                ret2 += String.valueOf(number[i].first);
                ret2 += String.valueOf(number[i].second);
            }else {
                ret2 += String.valueOf(number[i].first);
            }
        }

        return Long.parseLong(ret1)+Long.parseLong(ret2);
    }

    public static void main(String[] args) {
        problem4 application = new problem4();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }

        System.out.println(application.solution(N, A));
    }
}