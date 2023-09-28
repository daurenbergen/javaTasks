package GroupWorks2;

public class Task2 {
    /*
    2. Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH".
     */
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        String reverse=sb.reverse().toString();
        System.out.println(reverse);
    }
}
