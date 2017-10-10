package 기초알고리즘.그래프_다시_풀기;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by masinogns on 2017. 10. 7..
 *
 * DFS BFS 쓰지도 않았다.
 *
 * 그래프 문제가 맞긴 한당가
 *
 * PASS !!
 */
public class 반복수열 {
    public int solution(int a, int p) {

        ArrayList<Integer> list = new ArrayList<>();

        int newNumber = a, index = 0;
        while (true) {
            list.add(newNumber);
            newNumber = newNumber(newNumber, p);

            if (list.contains(newNumber)) {
//                System.out.println(newNumber);
//                System.out.println(list.indexOf(newNumber));
                index = list.indexOf(newNumber);
                break;
            }
        }

        return index;
    }

    /**
     * number를 p만큼 곱하게 하는 함수
     * @param number
     * @param p
     * @return
     */
    public int newNumber(int number, int p) {
        int length = String.valueOf(number).length();

        int sum = 0, divide = 0, remaind = 0, something = 0;
        for (int i = length-1; i >= 0; i--){
            something = (int)Math.pow(10, i);
            divide = number / something;
            remaind = number % something;
            sum += Math.pow(divide, p);
            number = remaind;
        }

        return sum;
    }

    public static void main(String[] args) {
        반복수열 application = new 반복수열();

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int P = scanner.nextInt();

        int ret = application.solution(A, P);

        System.out.println(ret);
    }

}
