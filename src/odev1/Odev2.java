package odev1;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int number= input.nextInt();
        int count=0;
        int total=0;
        int average;
        for(int i=0;i<=number; i++){
            if((i+1)%2==0){
                if(i%4==0){
                    total+=i;
                }


            }
        }
        System.out.println("TOTAL = "+total);
    }
}
