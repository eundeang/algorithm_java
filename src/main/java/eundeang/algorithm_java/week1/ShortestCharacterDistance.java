package eundeang.algorithm_java.week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShortestCharacterDistance {
    public String solution(String s, String t) {
        String answer = "";
        List<Integer> temp = new ArrayList<>();
        List<Integer> tempBack = new ArrayList<>();
        int distance = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == t.charAt(0)){
                distance = 0;
            }else {
                distance++;
            }
            temp.add(distance);
        }
        System.out.println("temp = " + temp);
        distance = 0;
        for(int i = s.length()-1 ; i >= 0 ; i--) {
            if(s.charAt(i) == t.charAt(0)){
                distance = 0;
            }else {
                distance++;
            }
            tempBack.add(distance);
        }
        Collections.reverse(tempBack);
        System.out.println("tempBack = " + tempBack);
        for(int i = 0 ; i < s.length() ; i++) {
            if (i == 0 || i == s.length() - 1) {
                answer += temp.get(i) > tempBack.get(i) ? temp.get(i) : tempBack.get(i);
            }
            else {
                if (temp.get(i) == 0 || tempBack.get(i) == 0)
                    answer += temp.get(i) >= tempBack.get(i) ? temp.get(i) : tempBack.get(i);
                else answer += temp.get(i) < tempBack.get(i) ? temp.get(i) : tempBack.get(i);
            }
            answer += " ";
        }

        return answer;
    }

    public static void main(String[] args) {
        ShortestCharacterDistance distance = new ShortestCharacterDistance();
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();
        System.out.println(distance.solution(input1, input2));
    }
}
