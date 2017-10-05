package CodingTest.NHN;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by masinogns on 2017. 9. 21..
 */
public class problem2015_2 {
    public boolean solution(String result) {

        Stack<Character> stack = new Stack<>();

        for (char ch : result.toCharArray()){
            if (ch == '(')
                stack.push(ch);
            else if (ch == '[')
                stack.push(ch);
            else if (ch == '{')
                stack.push(ch);
            else if (ch == ')'){
                if (stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            }
            else if (ch == ']'){
                if (stack.peek() == '[')
                    stack.pop();
                else
                    return false;
            }
            else if (ch == '}'){
                if (stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            }
        }

        if (stack.isEmpty())
            return true;

        return false;
    }

    public static void main(String[] args) {
        problem2015_2 application = new problem2015_2();

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String[] strings = new String[N];

        for (int i = 0; i < N; i++){
            strings[i] = scanner.nextLine();
        }


        for (int i = 0; i < N; i++){
            boolean check = false;

            check = application.solution(strings[i]);

            if (!check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
