import java.util.Scanner;
//Author: Gil Silva
//Java BootCamp
//Write a program to display the numbers from 1 to user specified
// and their squares using a for loop

public class Sqrt {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a number: ");
        int input = sc.nextInt();

        System.out.println("Number    Square");
        System.out.println("________  _________");

        for(int i = 1; i <= input; i++){
            System.out.println(" " + i + "    " + (i*i));
        }
    }
}
