package eundeang.algorithm_java.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RockScissorsPaper {
    // 가위 1, 바위 2, 보 3
    void solution(int n ,List<Integer> aList, List<Integer> bList){
        for (int i = 0 ; i < n; i++){
            if(aList.get(i)==bList.get(i)) {
                System.out.println("D");
            }else if (aList.get(i) == 1) {
                if (bList.get(i)==3){
                    System.out.println("A");
                }else {
                    System.out.println("B");
                }
            }else if (aList.get(i) == 2) {
                if (bList.get(i)==1){
                    System.out.println("A");
                }else {
                    System.out.println("B");
                }
            }else if (aList.get(i) == 3) {
                if (bList.get(i)==2){
                    System.out.println("A");
                }else {
                    System.out.println("B");
                }
            }
        }

    }

    public static void main(String[] args) {
        RockScissorsPaper rockScissorsPaper = new RockScissorsPaper();
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        for (int i = 0 ; i < input; i++){
            aList.add(scanner.nextInt());
        }
        for (int i = 0 ; i < input; i++){
            bList.add(scanner.nextInt());
        }
        rockScissorsPaper.solution(input,aList,bList);
    }
}
