package NHN;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by masinogns on 2017. 9. 18..
 *
 * 샘플 테스트 케이스는 다 돌아가는데 직접 돌리니 안돌아가네
 *
 * 패스했다가 나중에 다시 보기
 */
public class problem2 {
    public int solution(int n) {

        int count = 1;
        boolean check = false;

        while (count < 3){
            n = n + reverse(n);

            String s = String.valueOf(n);
            if (s.length() % 2 != 0){
                for (int i = 0; i < s.length()/2; i++){
                    if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                        continue;

                    check = true;
                    break;
                }
            }

            count++;
        }

        if (check == false)
            return -1;

        return n;
    }

    private int reverse(int N) {
        Stack<Character> stack = new Stack<>();

        String string = Integer.toString(N);
        String reverse = "";
        for (Character character : string.toCharArray())
            stack.push(character);

        while (!stack.isEmpty()){
            reverse += stack.pop();
        }

        return Integer.parseInt(reverse);
    }

    public static void main(String[] args) {
        problem2 application = new problem2();

        Scanner scanner = new Scanner(System.in);

        System.out.println(application.solution(scanner.nextInt()));
    }
}
