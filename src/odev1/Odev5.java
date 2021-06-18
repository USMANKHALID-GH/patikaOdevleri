package odev1;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the base number");
        int base= input.nextInt();
        System.out.println("enter the power number");
        int pow= input.nextInt();
        for(int i=1; i<=pow; i++){
            System.out.print(base+" x ");
        }
    }
}
