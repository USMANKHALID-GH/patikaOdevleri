package odev1;

import java.util.Scanner;

public class odev3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a number");
        int number= input.nextInt();
        int count=0;
        int total=0;
        int average;
        for(int i=0;i<=number; i++){
            System.out.println(" power of 5: "+Math.pow(i,5)+"\t power of 4: "+ Math.pow(i,4) );

        }
    }
}
