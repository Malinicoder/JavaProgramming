package JAVA_IF_ELSE;
import java.util.*;
public class InterestCheck {
    public static void main(String[] args) {
        //input Scanner obj
        Scanner sc=new Scanner(System.in);
        String gender=sc.nextLine();
        int age=sc.nextInt();

        char gen=gender.charAt(0);
        //Ascii of m=109 and M=77
        if(gen==109 || gen==77){
            if(age>=1 && age<=58)
            System.out.println("8.4%");
            else if(age>=59 && age<=100){
                System.out.println("10.5%");
            }
        }
        //Ascii of f=102 and F=70
        else if(gen ==70 || gen ==102 ){
                if(age>=1 && age<=58)
                    System.out.println("8.2%");
                else if(age>=59 && age<=100){
                     System.out.println("9.2%");
            }
        }

        sc.close();
    }
}
