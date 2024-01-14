package eundeang.algorithm_java.week1.solution;

import java.util.Scanner;

public class DuplicatedCharacterDelete {
    /**
     * public String solution(String st) {
     *         StringBuilder stringBuilder = new StringBuilder(st);
     *         for (int i = 0 ; i < stringBuilder.length()-1 ; i++) {
     *             for (int j = stringBuilder.length()-1; i< j ; j--){
     *                 if (stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
     *                     stringBuilder.deleteCharAt(j);
     *                 }
     *             }
     *         }
     *         return stringBuilder.toString();
     *     }
     */

    public String solution(String st) {
       String answer = "";
       for(int i = 0; i < st.length(); i++){
           System.out.println(st.charAt(i)+" "+i+" "+st.indexOf(st.charAt(i)));
           if (st.indexOf(st.charAt(i)) == i) answer += st.charAt(i);
       }
        return answer;
    }

    public static void main(String[] args) {
        DuplicatedCharacterDelete delete = new DuplicatedCharacterDelete();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(delete.solution(input));

    }
}
