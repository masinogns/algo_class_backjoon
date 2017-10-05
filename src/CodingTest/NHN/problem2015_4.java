package CodingTest.NHN;

/**
 * Created by masinogns on 2017. 9. 21..
 */
public class problem2015_4 {

    public String[] solution(String string) {

        System.out.println(stringReplace(string));
        String[] splitedStrings = stringSplit(string);
        String[] sortBasisOrder = sortBasisOrder(splitedStrings);
        return new String[0];
    }

    private String[] sortBasisOrder(String[] splitedStrings) {
        return new String[0];
    }

    //특수문자 제거 하기
    private String stringReplace(String str){
        String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
        str =str.replaceAll(match, " ");
        return str;
    }
    //출처: http://jang8584.tistory.com/97 [개발자의 길]

    private String[] stringSplit(String string) {

        return new String[0];
    }
}
