package eundeang.algorithm_java.week1;

import java.util.Scanner;

public class NumberInString {
    public Integer solution(String s){
        String answer = "";
        char[] chars = s.toCharArray();
        int left = 0;
        while (left < s.length()) {
            if (Character.isDigit(chars[left])) {
                answer += chars[left];
            }
            left++;
        }
        return Integer.valueOf(answer);
    }

    public static void main(String[] args) {
        NumberInString numberInString = new NumberInString();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(numberInString.solution(input));

    }
}
