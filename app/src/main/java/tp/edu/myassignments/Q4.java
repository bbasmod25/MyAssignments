package tp.edu.myassignments;

import java.util.Scanner;

public class Q4 {

    public static int calculatePrice(int numofipad,int price)
    { int Totalprice = numofipad * price;

    return Totalprice;
    }

    public static void main(String[] args) {

        System.out.print("Please input number of ipads = ");
        Scanner sc = new Scanner(System.in);
        int numofipad = sc.nextInt();
        int price = 1000;
        int Totalprice = calculatePrice(numofipad,price);
        System.out.println("    ");
        System.out.println("The Total cost of ipads is = $" + Totalprice);

    }
}
