package GroupWorks1;

public class TaskN7 {
    /*
    Write a Java Program to print the first 10 numbers of Fibonacci series.
     */
    public static void main(String[] args) {


        int fib=0;// 1, 2, 3
        int step=1;//2, 3,

        for (int i=0;i<10;i++){
            System.out.print(fib +" ");
            //            2    3
            int temp = fib+step;
            //   3
            fib=step;
            //      5
            step = temp;


        }


    }
}
