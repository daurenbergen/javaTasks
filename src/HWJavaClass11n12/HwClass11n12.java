package HWJavaClass11n12;

public class HwClass11n12 {

    /*
    1.Write a method to return whether given number is prime or not?
     */
    boolean primeNumber (int num){
        boolean prime=true;
        for (int i = 2; i < num; i++) {
            if(num%i ==0){
                prime=false;

            }
        }
        return prime;
    }
    /*
    2.Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
    score > 90 - A
    score >80 - B
    score >70 - C
    score > 50 - D
    anything else - F
     */

    String grade (int score){
      if (score>90){
          return "A";
      }else if(score>80){
          return "B";
      }else if(score>70){
          return "C";
      }else if(score>50){
          return "D";
      }else{
          return "F";
      }
    };

    // 3.Create a method that will print whether given String is palindrome or not.
    String checkPal (String word){

        String reversedStr = "";

        for (int i =word.length() - 1; i >= 0; i--) {
            reversedStr=reversedStr+word.charAt(i);
        }

        if(word.equals(reversedStr)){
            return " ";
        }else {
            return "";
        }


    }

    // 4.Create a method that will say Hello in different language based on the country that will passed when method is executed

    String hello (String lang){
        if(lang.equals("Kazakhstan")){
           return  "Salem!";
        }else if(lang.equals("Japan")){
           return  "Kon'nichiwa!";
        }else {
           return "Hello!";
        }

    }


}





