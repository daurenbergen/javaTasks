package GroupWorks1;

public class TaskN2 {
    public static void main(String[] args) {
        /*Create an array of integer values. After the array is created, calculate
the sum of all stored elements in that array. */

        int number []= {10,20,30,40,50};
        int sum=0;
        for (int i = 0; i < number.length; i++) {
            sum=sum+number[i];
        }
        System.out.println(sum);
    }
}
