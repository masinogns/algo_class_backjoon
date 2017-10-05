package CodingTest.kakao;

import java.util.Stack;

/**
 * Created by masinogns on 2017. 9. 16..
 */
public class problem2 {
    public int solution(String dartResult) {
        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < dartResult.length(); i++){

            if (dartResult.charAt(i) == 'S')        // S일 경우 1의 계승을 취해라 그 다음에 스택에 넣어라
                stack.push((int) Math.pow(stack.pop(), 1));
            else if (dartResult.charAt(i) == 'D')   // D일 경우 2의 계승을 취해라 그 다음에 스택에 넣어라
                stack.push((int) Math.pow(stack.pop(), 2));
            else if (dartResult.charAt(i) == 'T')   // T일 경우 3의 계승을 취해라 그 다음에 스택에 넣어라
                stack.push((int) Math.pow(stack.pop(), 3));
            else if (dartResult.charAt(i) == '*'){  // *일 경우 스택에 있는 두 수를 *2을 취해라 그 다음에 스택에 넣어라
                if (stack.size() > 1){              // 스택 사이즈가 2보다 클 경우에는 스택에 값이 2개 이상있다는 말
                    int last = stack.pop()*2;
                    int first = stack.pop()*2;
                    stack.push(first);
                    stack.push(last);
                }else {                             // 스택 사이즈가 1일 때 스택에 하나의 값만 가져와서 *2를 취하고 다시 넣음
                    int last = stack.pop()*2;
                    stack.push(last);
                }
            }
            else if (dartResult.charAt(i) == '#'){  // 스택에 있는 하나의 값을 가져와서 *(-1)을 취해라
                stack.push(stack.pop()*(-1));
            }
            else if (dartResult.charAt(i) == '1'
                    && dartResult.charAt(i+1) == '0'){
                stack.push(10);
                i += 1;
            }else {                                 // 위에 조건을 모두 패스하면 숫자라는 말이니까 parseInt로 String을 숫자로해서 스택에 저장한다
                stack.push(Integer.parseInt(String.valueOf(dartResult.charAt(i))));
            }
        }

        int sum = 0;
        for (Integer integer : stack)
            sum += integer;

        return sum;
    }
}
