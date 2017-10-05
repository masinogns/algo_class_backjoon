package CodingTest.NHNPretest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by masinogns on 2017. 9. 23..
 */
public class problem2 {

    public String solution(String check, String secretKey, int lotationNumber, String message) {
        String str1 = "";

        int[] secret = stringToAscii(secretKey);

        char[] madeKey = plusSecretAndMessage(secret, message);
        char[] lotation = lotationMadeKey(madeKey, lotationNumber);

        str1 = new String(lotation, 0, lotation.length);
        System.out.println(str1);

        return str1;
    }

    private char[] lotationMadeKey(char[] madeKey, int lotationNumber) {
        Queue<Character> queue = new LinkedList<>();

        if (lotationNumber > 0){
            for (Character ch : madeKey)
                queue.add(ch);

            for (int i = 0; i < lotationNumber; i++){
                queue.add(queue.poll());
            }
        }else {
            for (int i = madeKey.length-1; i >= 0; i--){
                queue.add(madeKey[i]);
            }

            for (int i = 0; i < lotationNumber; i++){
                queue.add(queue.poll());
            }
        }


        char[] array = new char[queue.size()];
        int i = 0;
        while (!queue.isEmpty()){
            array[i] = queue.poll();
            i++;
        }
        return array;
    }

    private char[] plusSecretAndMessage(int[] secret, String message) {
        int N = message.length();
        char[] msg = message.toCharArray();
        char[] ret = new char[N];

        for (int i = 0; i < N; i++){
            if (msg[i] + secret[i] > 122){
                ret[i] = (char) (((msg[i] + secret[i])%'z')+'a'-1);
            }else {
                ret[i] = (char) (msg[i] + secret[i]);
            }
        }

        return ret;
    }

    private char[] minusSecretAndMessage(int[] secret, String message) {
        int N = message.length();
        char[] msg = message.toCharArray();
        char[] ret = new char[N];

        for (int i = 0; i < N; i++){
            if (msg[i] - secret[i] < 97){
                ret[i] = (char) ((msg[i] - secret[i])+'a'-1);
            }else {
                ret[i] = (char) (msg[i] - secret[i]);
            }
        }

        return ret;
    }

    private int[] stringToAscii(String secretKey) {
        char[] secret = secretKey.toCharArray();
        int[] ret = new int[secretKey.length()];

        for (int i = 0; i < secret.length; i++){
            ret[i] = secret[i] - 'a';
        }

        return ret;
    }

    public static void main(String[] args) throws IOException {
        problem2 application = new problem2();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = br.readLine();

        String[] words = string.split(" ");
        for (String s : words)
            System.out.println(s);

        System.out.println(application.solution(words[0], words[1], Integer.parseInt(words[2]), words[3]));
    }
}
