package odev1;


import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of elemnts");
        int numberOfElement=input.nextInt();
        int combOfNumberOfElement=1;
        for(int i=1; i<=numberOfElement; i++){
            combOfNumberOfElement=combOfNumberOfElement*i;
        }
        System.out.println("enter the number of parts");
        int numberOfParts=input.nextInt();
        int combofnumberofparts=1;
        for(int i=1; i<=numberOfParts; i++){
            combofnumberofparts=combofnumberofparts*i;
        }
        int fackofNAndR=numberOfElement*numberOfParts;
        int fak=1;
        for(int i=1; i<=fackofNAndR; i++){
            fak=fak*1;
        }
        int combination= combOfNumberOfElement/fak*combofnumberofparts;
        System.out.println("C(N,R) :"+combination);
    }
}
