package CodingTest.NHNPretest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by masinogns on 2017. 9. 23..
 */
public class problem1 {
    public ArrayList<Integer> solution(String string1) {

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> ret = new ArrayList<>();

        int[] array = stringToIntArray(string1);

        for (int i = 0; i < array.length; i++){

            if (queue.size() < 3){                  // 큐 사이즈가 3미만이라면 계속 담는다
                queue.add(array[i]);
            }else {                                 // 큐 사이즈가 3이상이라면 조건 발동

                if (queue.contains(array[i])) {     // 이전 주머니에 들어있는 아이템 기존 아이템 선물, 새로 담기
                    queue.remove(array[i]);
                    queue.add(array[i]);
                } else {                            //  주머니에 없는 아이템; 가장 오래 전에 습득한 아이템 버림, 담기
                    ret.add(queue.poll());
                    queue.add(array[i]);
                }
            }
        }

        return ret;
    }


    private int[] stringToIntArray(String string1) {
        String[] words = string1.split(" ");
        int[] ints = new int[words.length];
        for (int i = 0; i < words.length; i++)
            ints[i] = Integer.parseInt(words[i]);

        return ints;
    }

    public static void main(String[] args) throws IOException {
        problem1 application = new problem1();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = br.readLine();

        ArrayList<Integer> ret = application.solution(string);

        if (ret.isEmpty()){
            System.out.println(0);
        }else {
            for (Integer i : ret)
                System.out.println(i);
        }
    }
}
