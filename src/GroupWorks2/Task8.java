package GroupWorks2;

public class Task8 {
    /*
    Write a Java Function that increments a string,
It should take the string of unknown length. Don't use regular expressions.
Examples:
123 -> 124
53456 -> 53457
29 -> 30
Function signature:
string Increment (string str)
     */
    public static String increment(String str) {
        int num = Integer.parseInt(str);
        num++;
        return Integer.toString(num);
    }
    public static void main(String[] args) {
        System.out.println(increment("123"));
        System.out.println(increment("53456"));
        System.out.println(increment("29"));
    }
}
