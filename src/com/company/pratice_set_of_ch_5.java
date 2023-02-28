package com.company;
import java.util.Scanner;
public class pratice_set_of_ch_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int a =0;
//        for (int i= 4; i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//
//        }

//  int[] ages = {12,34,56,78,90};
//        System.out.println(ages.length);
////        for (int i=0;i< ages.length;i++){
////            System.out.println(ages[i]);
////        }
//        int n = ages.length;
//        for (int i=n-1;i<=n;i--){
//            System.out.println(ages[i]);
//        }

//        for (int i=4;i>=0;i--){
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//        int i = 1;
//        while (2*i>0){
//            System.out.println((2*i)+1);
//            i++;
//        }
//        int n = 2;
//        for (int i=n;i>0,i++)
//        reverse order multiplication table
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter value of n-");
//        int n = s.nextInt();
////        int n =10;
//        for (int i=1; i<=10 ;i++){
//            System.out.println(n*i);
//        }
//        for (int i=10;i>0;i--){
//            System.out.println(n*i);
//        }
//        for (int i =1;i<2;i++){
//            System.out.println(i);
//            i--;
//        }
//        int i =4;
//        int j =0;
//        while (i>1 && j<1){
//            i--;
//            j++;
//                System.out.print("*");
//            System.out.println("\n");
//
////        }
//        int n =8;
//        for (int i =1;i<=10;i++){
//            System.out.println(n*i);
//
//        }
        //factoriql
        System.out.println("eneter the numbr:");
        int n = s.nextInt();
        int fact = 1;
        for (int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("factorial is:");
        System.out.print(fact);



    }
}
