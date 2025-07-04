package Java_Switch;

import java.util.Scanner;
public class Colour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();

    switch(str){

        case "G":

        System.out.println("Green");
        break;

        case "R":
        System.out.println("Red");
        break;

        case "B":
        System.out.println("Blue");
        break;

        case "O":
        System.out.println("Orange");
        break;

        case "Y":
        System.out.println("Yellow");
        break;

        case "W":
        System.out.println("White");
        break;

        default:
        System.out.println("invalid code");

    }

    sc.close();
    }
    
}
