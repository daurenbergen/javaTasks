public class TaskN4 {
    /*Create a 2D array of integers. Develop a program which will calculate
the sum of even and odd numbers for that array.*/
    public static void main(String[] args) {
        int [][] numbers = {{10,11,12},{13,14,15},{16,17,18}};
        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    sumEven=sumEven+numbers[i][j];
                }else {
                    sumOdd=sumOdd+numbers[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers is "+sumEven);
        System.out.println("Sum of odd numbers is "+sumOdd);
    }
}
