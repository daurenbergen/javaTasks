public class TaskN8 {
    /*Maximum and minimum number in the array?*/
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 8, 2, 15, 3, 7 };

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);
    }
}
