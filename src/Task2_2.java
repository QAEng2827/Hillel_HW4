import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2_2 {
    /*Write a Java program to find and print the first 10 happy numbers.
Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits,
 and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.
Example: 19 is a happy number
12 + 92=82
82 + 22=68
62 + 82=100
12 + 02 + 02=1
*/

    //  определение счастливого числа
    public static boolean digitsInNumber(int number,int score) {
        score++;
        int digit;
        int sum = 0;

           for (; number>0; number/=10) {

                digit = number % 10;
               sum += (digit * digit);

           }
           if(sum != 1 && score!=10) {
               return digitsInNumber(sum, score);
           } else if(sum == 1) {
               return true;
           } else {
               return false;
           }
    }




    public static void main(String[] args) {
        int score=0;
        List<Integer> happyNumbers = new ArrayList<Integer>();
        System.out.println("First 10 Happy numbers: ");
        for (int number =1; number<= 45;number++) {
            int currentNumber = number;
            if(digitsInNumber(number, score)) {
                happyNumbers.add(currentNumber);
                System.out.print(currentNumber + " ");

            }
        }
//        for (int i=0; i<=10; i++){
//            System.out.print(happyNumbers[i] + " ");
//        }

    }

}
