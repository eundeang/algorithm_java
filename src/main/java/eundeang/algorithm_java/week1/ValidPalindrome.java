package eundeang.algorithm_java.week1;

import java.util.Scanner;

public class ValidPalindrome {
    public String solution(String st) {
        char[] upperChars = st.toUpperCase().toCharArray();
        int left = 0 , right = upperChars.length-1;
        boolean isReversed = true;
        while (left < right) {
            if (!Character.isAlphabetic(upperChars[left])){
                left++;
            }else if (!Character.isAlphabetic(upperChars[right])){
                right--;
            } else {
                if(upperChars[left] != upperChars[right]){
                    isReversed = false;
                    break;
                }else {
                    left++;
                    right--;
                }
            }
        }
        if (isReversed){
            return "YES";
        }else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(validPalindrome.solution(input));
    }
}
