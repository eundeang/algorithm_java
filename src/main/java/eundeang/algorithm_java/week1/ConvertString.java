package eundeang.algorithm_java.week1;

import java.util.Scanner;

public class ConvertString {
    public String solution(String st) {
        st = st.toUpperCase();
        StringBuilder sb = new StringBuilder(st);
        if (st.equals(sb.reverse().toString())){
            return "YES";
        }else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        ConvertString convertString = new ConvertString();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(convertString.solution(input));
    }
}
