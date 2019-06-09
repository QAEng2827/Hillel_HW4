public class Task3_5 {

    /*Write a Java program to reverse a string using loop*/

    public static void main(String[] args){
        String sampleString = "The quick brown fox jumps ";
        System.out.printf("The given string is: %s%n",sampleString);
        char[] reversString = sampleString.toCharArray();
        System.out.print("The reversed string is: ");
        int j=reversString.length;
        for ( j= j-1; j>=0; j--){
            System.out.print(reversString[j]);

        }

    }
}
