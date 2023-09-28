package HWJavaClass11n12;

public class HwClass11n12Test {

    public static void main(String[] args) {
        HwClass11n12 a= new HwClass11n12();
        boolean prime= a.primeNumber(17);
        if(prime){
            System.out.println("Prime number");
        }else {
            System.out.println("Not prime number");
        }
        System.out.println("===============================");

        // Task 2
        String getGrade = a.grade(45);

        System.out.println(getGrade);

        System.out.println("===============================");

        // Task 3
        String  isPal= a.checkPal("anna");
        if (isPal.equals(" ")){
            System.out.println("it is a palindrome");
        }else {
            System.out.println("it is not a palindrome");
        }
        System.out.println("===============================");

        // Task 4
        String checkLang=a.hello("Kazakhstan");
        System.out.println(checkLang);
    }

}


