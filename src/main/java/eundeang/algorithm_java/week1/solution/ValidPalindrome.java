package eundeang.algorithm_java.week1.solution;

import java.util.Scanner;

public class ValidPalindrome {
    /*public String solution(String st) {
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
                    return "NO";
                }else {
                    left++;
                    right--;
                }
            }
        }
        return "YES";
    }
*/

    /**
     * replaceAll 정규식 이용
     */
    public String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]","");
        String temp = new StringBuilder(s).reverse().toString();
        if(s.equals(temp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(validPalindrome.solution(input));
    }
}
