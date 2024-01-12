package eundeang.algorithm_java.week1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeCaseType {
    public String solution(String s){
        String result = "";
        for (char ch:s.toCharArray()){
            if(Character.isUpperCase(ch)){
                result += Character.toLowerCase(ch);
            }else {
                result += Character.toUpperCase(ch);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        ChangeCaseType changeCaseType = new ChangeCaseType();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(changeCaseType.solution(input));

    }
}
