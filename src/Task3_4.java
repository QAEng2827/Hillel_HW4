public class Task3_4 {
    /*  Write a Java program to replace each substring of a given string that matches the given regular expression
    with the given replacement

Sample string : "The quick brown fox jumps over the lazy dog." In the above string replace all the fox with cat.
*/
    public static void main(String[] args){
        String sampleString = "The quick brown fox jumps over the lazy dog";
        String replaceWord = "fox";
        String newWord = "cat";
        System.out.println(sampleString);

         String newSampleString = sampleString.replaceAll(" "+replaceWord," "+newWord);//  чтобы заменяло именно слово, а не слог внутри другого слова
        System.out.println(newSampleString);

    }
}
