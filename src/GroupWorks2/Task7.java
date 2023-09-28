package GroupWorks2;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {
    /*
    7. You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"
     */
    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<>();
        names.add("John");
        names.add("Arnold");
        names.add("Roman");
        names.add("Ali");
        names.add("Bill");

        for(String s:names){
            if(s.startsWith("A")){
                System.out.println(s.toLowerCase());
            }
        }
    }
}
