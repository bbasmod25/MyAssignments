package tp.edu.myassignments;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input Maximum number : ");

        int maxnum = scanner.nextInt();

        System.out.print("Please input Minimum number : ");

        int minnum = scanner.nextInt();

        System.out.println(" ");

        System.out.println("Upper limit : " + maxnum);

        System.out.println("Lower limit : " + minnum);

        int minnum1 = minnum+1;

        System.out.println(" ");

        System.out.print("counting : ");

        for(int num=minnum1; (num<maxnum) ; num++)
        {
            System.out.print( num + " ");
        }



    }

}


