package eundeang.algorithm_java.week1;

import java.util.Scanner;

public class WordInString {
    public String solution(String st) {
        String result = "";
        String[] word = st.split(" ");
        int longest = 0;
        for (String s : word){
             if(longest < s.length()) {
                longest = s.length();
                result = s;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        WordInString wordInString = new WordInString();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(wordInString.solution(input));
    }
}
