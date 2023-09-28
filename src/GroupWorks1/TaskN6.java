package GroupWorks1;

public class TaskN6 {

    /*
    Write a java program to check whether a given number is prime or
not?
     */
    public static void main(String[] args) {
        int number = 6;
        boolean prime=true;

        for (int i = 2; i < number; i++) {

            if(number%i ==0){
              prime=false;
            }
        }
        if(prime){
            System.out.println(number+ " Prime number");
        }else {
            System.out.println(number+ " Not prime");
        }
    }
}
