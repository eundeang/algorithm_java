package eundeang.algorithm_java.week1;

import java.util.Scanner;

public class SpecificWordReverse {
    public String solution(String st) {
        String answer = "";
        char[] chars = st.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            if (!Character.isAlphabetic(chars[left])) left++;
            else if (!Character.isAlphabetic(chars[right])) right--;
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left += 1;
                right -= 1;
            }

        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        SpecificWordReverse specificWordReverse = new SpecificWordReverse();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(specificWordReverse.solution(input));
    }
}
