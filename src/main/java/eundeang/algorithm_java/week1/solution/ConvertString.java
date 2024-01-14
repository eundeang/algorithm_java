package eundeang.algorithm_java.week1.solution;

import java.util.Scanner;

public class ConvertString {
    /** public String solution(String st) {
        st = st.toUpperCase();
        StringBuilder sb = new StringBuilder(st);
        if (st.equals(sb.reverse().toString())){
            return "YES";
        }else {
            return "NO";
        }
    } */
    public String solution(String str){
        //직접 비교 방식
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0 ; i < len/2; i++){
            if(str.charAt(i)!= str.charAt(len-i-1)) return "NO";
        }
        return answer;
    }
    public String solution1(String str){
        String answer = "NO";
        String temp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(temp)) return "YES";
        return answer;
    }

    public static void main(String[] args) {
        ConvertString convertString = new ConvertString();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(convertString.solution1(input));
    }
}
