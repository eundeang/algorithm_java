package eundeang.algorithm_java.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cipher {
    String solution(String st){
        String answer = "";
        char[] temp = st.toCharArray();
        String tempVersionOne = "";
        List<String> binaryToDecimal = new ArrayList<>();
        for (int i = 0; i < temp.length ; i++ ){
            if (i > 0 && i % 7 == 0) {
                binaryToDecimal.add(String.valueOf(Integer.parseInt(tempVersionOne,2)));
                tempVersionOne = "";

            }
            if (temp[i] == '#') tempVersionOne += "1";
            else tempVersionOne += "0";
            if (i == temp.length-1) {
                binaryToDecimal.add(String.valueOf(Integer.parseInt(tempVersionOne,2)));
            }
        }
        for (String decimal : binaryToDecimal){
            char ch = (char) Integer.parseInt(decimal);
            answer += ch;
        }

        return answer;
    }

    public static void main(String[] args) {
        Cipher cipher = new Cipher();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String input = scanner.next();
        System.out.println(cipher.solution(input));
    }
}
