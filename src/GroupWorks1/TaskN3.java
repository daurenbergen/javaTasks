package GroupWorks1;

public class TaskN3 {
    public static void main(String[] args) {

        /*Create a 2D array or integer type where you will store odd and even
        numbers. Develop a program which will identify/print the even
        numbers only.*/

        int [][] numbers = {{10,11,12},{13,14,15},{16,17,18}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    System.out.println(numbers[i][j]);
                }
            }
        }

    }
}
