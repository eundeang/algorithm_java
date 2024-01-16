package eundeang.algorithm_java.week1;

import java.util.Scanner;

public class CompressString {
    String solution(String input) {
        String answer = "";
        char temp = '-';
        boolean flag = false;
        int num = 1;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (temp == c) {
                flag = true;
                num++;
                if (i == input.length()-1) answer += num;
            } else {
                if (flag == true) {
                    answer += num;
                }
                answer += c;
                flag = false;
                num = 1;
            }
            temp = c;
        }
        return answer;
    }

    public static void main(String[] args) {
        CompressString cs = new CompressString();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(cs.solution(input));
    }
}
