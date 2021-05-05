package tp.edu.myassignments;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input First number : ");

        int firstnumber = scanner.nextInt();

        System.out.print("Please input Second number : ");

        int secondnumber = scanner.nextInt();

        System.out.print("Please input Third number : ");

        int thirdnumber = scanner.nextInt();

        System.out.println(" ");

        System.out.println("First number = " + firstnumber);
        System.out.println("Second number = " + secondnumber);
        System.out.println("Third number = " + thirdnumber);

        System.out.println(" ");

        if ((firstnumber < secondnumber) && (firstnumber < thirdnumber)) {
            System.out.println("The smallest number is " + firstnumber);
        } else if ((secondnumber < firstnumber) && (secondnumber < thirdnumber)) {
            System.out.println("The smallest number is " + secondnumber);
        } else if ((thirdnumber < firstnumber) && (thirdnumber < secondnumber)) {
            System.out.println("The smallest number is " + thirdnumber);
        }
    }
}

