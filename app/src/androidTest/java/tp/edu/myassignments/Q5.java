package tp.edu.myassignments;

import java.util.Scanner;

public class Q5 {


    public static int computeProduct(int firstnum , int secondnum) {

        int Product = firstnum * secondnum;

        return Product;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("First number : ");

        int firstnum = scanner.nextInt();

        System.out.print("Second number : ");

        int secondnum = scanner.nextInt();

        int Product = computeProduct(firstnum, secondnum);

        if ((firstnum < 10) || (secondnum < 10) || (firstnum > 50) || (secondnum > 50)) {

            System.out.println("Not in range!");
        }

        else {
            System.out.println("The product of " + firstnum + " & " + secondnum + " = " + Product);
        }
    }
}


