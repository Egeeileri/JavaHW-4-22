package HW1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mom’s first name? ");
        String momName= input.next();
        System.out.println("Dad’s first name? ");
        String dadName= input.next();
        System.out.println("Boy or Girl? ");
        String gender = input.next();
        if (gender.equals("boy")){
            System.out.println("Suggested baby name: DANRY");
        }else if (gender.equals("girl")){
            System.out.println("Suggested baby name: MAIEL");
        }
    }
}
