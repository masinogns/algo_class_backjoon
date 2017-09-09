package 기초알고리즘.자료구조1;

/**
 * Created by masinogns on 2017. 9. 9..
 *
 *
 * 내 아이디어 :
 *
 * 스택을 2개 두어서 커서를 관리한다
 * 스택은 문자열이 들어있게 된다
 * 임시 스택은 커서가 움직일 때마다 변하는 것을 기록한다
 *
 * L: 커서를 왼쪽으로 옮길 때, 스택에 있는 가장 위에 있는 값을 임시 스택으로 옮긴다
 * D: 커서를 오른쪽으로 옮길 때, 임시스택에 있는 가장 위에 있는 값을 스택으로 옮긴다
 * B: 스택에 있는 값을 pop한다
 * P x: x element를 추가할 때 스택에 추가한다
 *
 */

import java.io.*;
import java.util.Stack;

/**
 * Psedo code
 *
 * String s
 * Stack stack, temp
 * stack = s.CharArray
 *
 * while until string is empty
 *  if ( s.charAt() == 'L')
 *    char wannaMove = stack.pop
 *    temp.push(wannaMove)
 *  else if ( s.charAt() == 'D' )
 *    char wannaMove = temp.pop
 *    stack.push(waanaMove)
 *  else if ( s.charAt() == 'B' )
 *    stack.pop
 *  else if ( s.charAt() == 'P' )
 *    stack.push(x)
 */
public class 에디터 {
    public String reverse="";

    public String solution(String string, String[] commands) {
        Stack<Character> stack = new Stack<>(), temp = new Stack<Character>();

        for (int c = 0; c < string.length(); c++){
            stack.push(string.charAt(c));
        }

        for (int i = 0; i < commands.length; i++){

            if (commands[i].equals("L"))
                temp.push(stack.pop());
            else if (commands[i].equals("D"))
                stack.push(temp.pop());
            else if (commands[i].equals("B"))
                stack.pop();
            else
                stack.push(commands[i].charAt(2));
        }

        String ret = "";

        while (!temp.isEmpty()) ret+=temp.pop();
        while (!stack.isEmpty()) ret+=stack.pop();

        reversString(ret);

        return reverse;
    }


    public void reversString(String str){
        if (str.length() == 0)
            return;
        else {
            reversString(str.substring(1));     // substring(1)는 첫 글자를 제외한 나머지 문자열
            reverse += str.charAt(0);           // charAt(0)은 문자열에서 첫 글자를 리턴
        }
    }


    public static void main(String[] args) throws IOException {
        에디터 application = new 에디터();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = String.valueOf(br.readLine());

        int number = Integer.valueOf(br.readLine());

        String[] commands = new String[number];

        for (int i = 0; i < number; i++){
            commands[i] = String.valueOf(br.readLine());
        }

        System.out.println(application.solution(string, commands));
    }
}
