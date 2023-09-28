package GroupWorks2;

public class Task3 {
    /*
    Check if a String is Palindrome: Determine whether a given string is a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
     */
    public static void main(String[] args) {
        String word="Madam";
        System.out.println("original: "+word);
        StringBuilder sb=new StringBuilder(word);

        String reverse=sb.reverse().toString();

        System.out.println("reversed: "+reverse);

        if(word.equalsIgnoreCase(reverse)){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }

    }

}
