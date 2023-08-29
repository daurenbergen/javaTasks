public class TaskN10 {
    /*Write a program to print out duplicate elements from an Array of
    Strings?*/
    public static void main(String[] args) {
        String[] strings = { "apple", "banana", "apple", "orange", "banana", "grape", "grape" };

        for (int i = 0; i < strings.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (strings[i].equals(strings[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                System.out.println(strings[i]);
            }
        }
    }
}
