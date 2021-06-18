package odev1;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
          int number= input.nextInt();
          int count=0;
          int total=0;
          int average;
          for(int i=0;i<=number; i++){
              if(i%4==0||i%3==0){
                total+=i;
                count++;
              }
          }
         // ortalama
        average=total/count;
        System.out.println("the average of the numbers divisible by 3 and 4 = " +average);

    }
}
