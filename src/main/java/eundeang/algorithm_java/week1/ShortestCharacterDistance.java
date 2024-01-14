//package eundeang.algorithm_java.week1;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class ShortestCharacterDistance {
//    public String solution(String s, String t) {
//        String answer = "";
//        List<Integer> temp = new ArrayList<>();
//        StringBuilder sb = new StringBuilder(s);
//        int point = 0;
//        temp.add(0);
//        while (point < sb.length()) {
//            temp.add(sb.indexOf(t, point));
//            point = sb.indexOf(t, point) + 1;
//        }
//        int left = -1, right = 0;
//
//        for (int i : temp) {
//            left = right;
//            right = i;
//            right/left
//        }
//        answer += " ";
//
//    }
//
//    public static void main(String[] args) {
//        ShortestCharacterDistance distance = new ShortestCharacterDistance();
//        Scanner scanner = new Scanner(System.in);
//        String input1 = scanner.next();
//        String input2 = scanner.next();
//        distance.solution(input1, input2);
//        System.out.println(distance.solution(input1, input2));
//    }
//}
