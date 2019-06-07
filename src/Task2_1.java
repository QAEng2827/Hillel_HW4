import java.util.Scanner;
/*Write a Java program which check whether a number is an Automorphic number or not.
(An automorphic number is a number whose square "ends" in the same digits as the number itself.
For example, 52 = 25, 62 = 36, 762 = 5776, and 8906252 = 793212890625,
 so 5, 6, 76 and 890625 are all automorphic numbers.*/
public class Task2_1 {



    public static void main(String[] args){

        System.out.print("Input a number: ");
        Scanner inputNum = new Scanner(System.in);
        int numQuest = inputNum.nextInt();
        int resultRiseToPower = numQuest*numQuest;
        if (checkOnAutopomorphic(numQuest,resultRiseToPower)){
            System.out.println("Automorphic namber");
        } else {
            System.out.println("Not an automorphic number.");
        }
    }

    private static boolean checkOnAutopomorphic(int numQuest,  int resultRiseToPower) {
//        String number = String.valueOf(numQuest);
//        String semple = String.valueOf(resultRiseToPower);
        return (""+resultRiseToPower).endsWith(""+numQuest);

      //  return (""+semple).endsWith(""+number);





    }
}
