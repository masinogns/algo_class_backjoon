package CodingTest.kakao;

import java.util.ArrayList;

/**
 * Created by masinogns on 2017. 9. 16..
 *
 * 자카드 유사도
 *
 * 집합 A, B 사이의 자카드 유사도 J(A, B) : 교집합 / 합집합
 * 두 집합이 공집합일 때는 0이다
 */
public class problem5 {
    public int solution(String str1, String str2) {

        ArrayList<String> convertedStr1 = null, convertedStr2 = null;
        ArrayList<String> removedStr1 = null, removedStr2 = null;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        convertedStr1 = convertStringToArray(str1);
        convertedStr2 = convertStringToArray(str2);

        removedStr1 = removeSpecificWord(convertedStr1);
        removedStr2 = removeSpecificWord(convertedStr2);
        System.out.println(removedStr1);
        System.out.println(removedStr2);

        // intersection 교집합, union 합집합
        int intersection = findIntersection(removedStr1, removedStr2);
        int union = findUnion(removedStr1, removedStr2, intersection);

        if (intersection == 0 && union == 0){
            return 1*65536;
        }

        double result = (double)intersection/union;

        return (int) (result*65536);
    }

    private int findUnion(ArrayList<String> removedStr1, ArrayList<String> removedStr2, int intersection) {
        for (String s : removedStr1){
            if (removedStr2.contains(s)){
                removedStr2.remove(s);
            }
        }

        return removedStr1.size()+removedStr2.size();
    }

    private int findIntersection(ArrayList<String> removedStr1, ArrayList<String> removedStr2) {
        int count = 0;
        for (String s : removedStr2){
            if (removedStr1.contains(s)){
                count++;
            }
        }

        return count;
    }

    private ArrayList<String> removeSpecificWord(ArrayList<String> convertedStr1) {
        char[] chars = new char[2];

        for (int i = 0; i < convertedStr1.size(); i++){
            int ascii = 0;
            chars = convertedStr1.get(i).toCharArray();
            for (int j = 0; j < 2; j++){
                ascii = (int)chars[j];

                if ((48 <= ascii && ascii <= 57 ) || (97 <= ascii && ascii <= 122)){
                    continue;
                }else {
                    convertedStr1.remove(i);
                    i-=1;
                }
            }
        }

        return convertedStr1;
    }

    private ArrayList<String> convertStringToArray(String str1) {
        int N = str1.length()-1;
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < N; i++){
            result.add(String.valueOf(str1.charAt(i)) + String.valueOf(str1.charAt(i+1)));
        }

        return result;
    }
}
