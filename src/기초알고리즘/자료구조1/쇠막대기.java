package 기초알고리즘.자료구조1;

/**
 * Created by masinogns on 2017. 9. 8..
 *
 * 아이디어 :
 *
 * 인덱스를 0부터 시작해 나간다
 * (일 때는 스택에 인덱스를 push해 놓고
 * )일 때는 현재 인덱스와 스택의 top값을 비굑해서 만약 두 수의 차이가 1이 난다면
 * 그것은 레이저라고 판단할 수 있다
 *
 * 만약 레이저라면 남아있는 스택의 사이즈를 보고 몇개로 나뉘어 질 수 있는지 알 수 있고
 * )일 때 차이가 1이 아니라면 그것은 막대를 뜻하므로 레이저의 수를 더해 끝에 있는 막대의 수를 더해준다
 * 하나의 막대가 끝난것이기 때문에 막대를 빼내는 역할을 한다
 */

import java.util.Stack;

/**
 * Pseudo code :
 *
 * index = 0
 * while String의 charAt이 있을 때 동안 반복한다
 *   if ( charAt(index) == '(' )
 *     stack.push(index)
 *   else // charAt(index) == ')'
 *     if ( index - stack.top == -1 )
 *       charAt(index)와 charAt(index-1)은 레이저 짝입니다
 *       stack.pop(index-1)
 *       잘려진 조각 개수 += stack.size()
 *     else
 *       이것은 막대의 끝을 나타냅니다
 *       잘려진 조각 개수 += 1
 *       stack.pop(마지막) //
 */
public class 쇠막대기 {


    /**
     * 인덱스를 스택에 넣는다는 아이디어 !*
     * @param s 입력받는 문자열
     * @return
     * ret은 잘려진 조각의 갯수를 의미하는 변수
     * index는 레이저인지 막대인지 판별할 수 있는 변수이고 계속해서 증가하는 특성을 가지고 있다
     */
    public int solution(String s) {

        int index = 0, ret = 0;
        Stack<Integer> stack = new Stack<>();

        for (Character character : s.toCharArray()){
            index++;

            if (character.equals('(')){
                stack.push(index);
            }

            else {
                if ((index - stack.peek()) == 1){
                    stack.pop();
                    ret += stack.size();
                }else {
                    stack.pop();
                    ret += 1;
                }
            }
        }

        return ret;
    }
}
