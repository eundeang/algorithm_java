package eundeang.algorithm_java.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPractice {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (int i = 0 ; i < str.length(); i++){
            if (str.charAt(i)==t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        StringPractice stringPractice = new StringPractice();
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        char ch = sc.nextLine().charAt(0);

        System.out.println(stringPractice.solution(st,ch));
    }
}
