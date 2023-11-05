import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String word1;
        String word2;
        System.out.println("Please enter the first word");
        word1 = Sc.next();
        System.out.println("Please enter the second word");
        word2 = Sc.next();

        String concatResult = word1.concat(word2);
        String concatResultReversed = word2.concat(word1);
        int areTheyEqual = concatResult.compareTo(concatResultReversed);
        boolean EqualWords;
        if (areTheyEqual == 0){
            EqualWords = true;
        }else {
            EqualWords = false;
        }
        System.out.println("The result of concatenation is: "+ concatResult);
        System.out.println("The result of the reverse concatenation is "+ concatResultReversed);
        System.out.println("Are the two strings equals? " + EqualWords);


    }
}
