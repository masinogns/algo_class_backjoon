package 기초알고리즘.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by masinogns on 2017. 10. 9..
 */

class Score {
    int kor, eng, math;
    String name;

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return getName();
    }
}

class order implements Comparator<Score>{
    @Override
    public int compare(Score o1, Score o2) {
        int firKor = o1.getKor();
        int secKor = o2.getKor();

        if (firKor == secKor){
            int firEng = o1.getEng();
            int secEng = o2.getEng();

            if (firEng == secEng){
                int firMath = o1.getMath();
                int secMath = o2.getMath();

                if (firMath == secMath){
                    String firName = o1.getName();
                    String secName = o2.getName();

                    return firName.compareTo(secName);
                }

                return Integer.compare(secMath, firMath);
            }
            return Integer.compare(firEng, secEng);
        }
        return Integer.compare(secKor, firKor);
    }
}

public class 국영수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfPerson = Integer.parseInt(br.readLine());

        Score[] scores = new Score[numberOfPerson];

        for (int i = 0; i < numberOfPerson; i++){
            String string = br.readLine();
            String[] inputs = string.split(" ");

            String name = inputs[0];

            int kor = Integer.parseInt(inputs[1]);
            int eng = Integer.parseInt(inputs[2]);
            int math = Integer.parseInt(inputs[3]);

            scores[i] = new Score(name, kor, eng, math);
        }

        Arrays.sort(scores, new order());

        for (int i = 0; i < numberOfPerson; i++) {
            System.out.println(scores[i]);
        }
    }
}
