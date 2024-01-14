package eundeang.algorithm_java.week1.solution;

import java.util.Scanner;

public class NumberInString {
    /*public Integer solution(String s){
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
    }*/
    // 아스키 코드로 하는 방법
    public int solution(String s){
        int answer = 0;
        for (char x : s.toCharArray()){
            if(x>=48 && x<57) answer = answer*10+(x-48);
        }
        return answer;
    }
    public int solution1(String s){
        String answer = "";
        for (char x : s.toCharArray()){
            if(Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        NumberInString numberInString = new NumberInString();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(numberInString.solution1(input));

    }
}
