package eundeang.algorithm_java.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordReverse {
    public String reverse(String st) {
        StringBuilder stringBuilder = new StringBuilder(st);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        WordReverse wordReverse = new WordReverse();
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        scanner.nextLine();
        List<String> words = new ArrayList<>();
        for(int i = 0 ; i < c; ++i){
            words.add(scanner.nextLine());
        }
        for(int i = 0 ; i < c; ++i){
            System.out.println(wordReverse.reverse(words.get(i)));
        }

    }
}
