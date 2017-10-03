package 중급알고리즘1.완전탐색0;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 3..
 */
public class 집합 {
    private int total;

    public 집합() {
        this.total = 0;
    }

    public void solution(String string){
        String[] word = string.split(" ");
        String first = word[0];

        if (word.length > 1){
            String second = word[1];
            int number = Integer.parseInt(second);
            if (first.equals("add")){
                total = total|(1 << number);
            }else if (first.equals("remove")){
                total = total&~(1 << number);
            }else if (first.equals("toggle")){
                total = total^(1 << number);
            }else if (first.equals("check")){
                if ((total & (1 << number)) == Math.pow(2, number)){
                    System.out.println("1");
                }else
                    System.out.println("0");
            }
        }else {
            if (first.equals("empty")){
                total = 0;
            }else { // all 1 ~ 20까지이다
                total = (1 << 20) - 1;
            }
        }
    }

    public static void main(String[] args) {
        집합 application = new 집합();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String string = scanner.nextLine();
            application.solution(string);
        }
    }
}
