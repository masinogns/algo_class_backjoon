package NHN;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by masinogns on 2017. 9. 18..
 *
 * PASS
 */
public class problem3 {
    public int[] solution(String s) {

        String words[] =  s.split(" ");

        int first = 0, second = 0;

        for (int i = 0; i < words.length; i++){
            if (findFirstRule(words[i])){
                first++;
            }

            if (findSecondRule(words[i]))
                second++;
        }

        return new int[]{first, second};
    }

    private boolean findSecondRule(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++){
            char one = word.charAt(i);

            if (one == 'a' || one=='e'||one=='i'||one=='o'||one=='u'){

                if (stack.size() < 3){
                    stack.removeAllElements();
                }
            }
            else{
                stack.push(one);
            }

        }

        if (stack.size() > 2)return true;

        return false;
    }

    public boolean findFirstRule(String word){

        for (int i = 1; i < word.length(); i++){
            char one = word.charAt(i);
            char two = word.charAt(i-1);

            if ((one == 'a' || one=='e'||one=='i'||one=='o'||one=='u')&&
                    (two == 'a' || two=='e'||two=='i'||two=='o'||two=='u')){
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        problem3 application = new problem3();

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int[] result = new int[2];

        result = application.solution(s);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
