package eundeang.algorithm_java.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VisibleStudent {
    String solution(List<Integer> integerList){
        String answer = "";
        Integer biggest = 0;
        int count = 0;
        for(int i : integerList) {
            if(biggest < i) {
                biggest = i;
                count++;
            }
        }
        answer = String.valueOf(count);
        return answer;
    }

    public static void main(String[] args) {
        VisibleStudent student = new VisibleStudent();
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < input1 ; i++){
            integerList.add(Integer.parseInt(scanner.next()));
        }
        System.out.println(student.solution(integerList));
    }
}
