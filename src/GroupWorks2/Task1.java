package GroupWorks2;

public class Task1 {
    /*
        1. Write a program to swap 2 String without a temporary variable?
     */
    public static void main(String[] args) {
        String word1="Washington State";
        String word2="Washington D.C";

        word1=word1+word2;
        word2=word1.substring(0,word1.length()-word2.length());
        word1=word1.substring(word2.length());
        System.out.println(word1);
        System.out.println(word2);

    }

}
