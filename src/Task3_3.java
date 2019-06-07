public class Task3_3 {
    /*Write a java program to compare two strings lexicographically, ignoring case differences*/

    public static void main(String[] args) {
        String string1 = "Strings are so cool!";
        String string2 = "Strings are so cool";


        if (string1.compareToIgnoreCase(string2) == 0) {
            System.out.printf("\" %s \" " + " is equal to " + "\" %s \" ",string1,string2);
        } else {
            System.out.printf("\" %s \" " + " is not equal to " + "\" %s \" ",string1,string2);
        }

    }


}

