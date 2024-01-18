package eundeang.algorithm_java.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargerThanNextOne {
    String solution(String input2){
        String answer = String.valueOf(input2.charAt(0));
        String temp = "";
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < input2.length() ; i++){
            if (input2.charAt(i) == ' '){
                list.add(Integer.parseInt(temp));
                temp = "";
            } else if (i == input2.length()-1) {
                temp += input2.charAt(i);
                list.add(Integer.parseInt(temp));
            } else {
                temp += input2.charAt(i);
            }
        }
        for (int j = 0 ; j < list.size()-1 ; j++) {
            if(list.get(j) < list.get(j+1)) {
                answer += " "+list.get(j+1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        LargerThanNextOne largerThanNextOne = new LargerThanNextOne();
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        System.out.println(largerThanNextOne.solution(input2));
    }
}
