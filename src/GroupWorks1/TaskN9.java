package GroupWorks1;

public class TaskN9 {
    /*
    Write a java program to find the second largest number in the array?
     */
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 8, 2, 15, 3, 7 };

        int largest = numbers[0];
        int secondLargest = numbers[1];

        if (largest < secondLargest) {
            int temp = largest;
            largest = secondLargest;
            secondLargest = temp;
        }

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("The second largest number in the array is: " + secondLargest);
    }
}
