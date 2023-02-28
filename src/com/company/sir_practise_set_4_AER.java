package com.company;
import com.sun.org.apache.bcel.internal.generic.SWITCH;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class sir_practise_set_4_AER {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
////        QUESTION 2
////        byte a = s.nextByte();
////        byte b =s.nextByte();
////        byte c = s.nextByte();
////        float marks = (a+b+c)/3.0f;
////        if (marks>=40 && a>33 && b>33 && c>33){
////            System.out.println("you r passed");
////        }
////        else {
////            System.out.println("your fail");
////        }
////        QUESTION 3
////        System.out.println("Enter your income:");
////        double income = s.nextDouble();
////        if (income<=2.5){
////            System.out.println(income+0);
////        }
////        else if (income > 10){
////            System.out.println("you pay 30% tax");
////        }
////        else if (income>5 && income<10){
////            System.out.println("you pay 20%tax");
////        }
////        else if (income<5 && income>2.5){
////            System.out.println("you pay 5% tax");
////        }
//
////        QUESTION 4
////        int days = s.nextInt();
//////        int days = 7;
////        switch (days){
////            case 1:
////                System.out.println("its monday");
////                break;
////            case 2:
////                System.out.println("its tuesday");
////                break;
////            case 3:
////                System.out.println("its wednedday");
////                break;
////            case 4:
////                System.out.println("its thrusday");
////                break;
////            case 5:
////                System.out.println("its friday");
////                break;
////            case 6:
////                System.out.println("its saturday");
////                break;
////            case 7:
////                System.out.println("its sunday");
////                break;
////            default:
////                System.out.println("week ended!");
////        }
//////   question 5
////        System.out.println(" eneter your website");
////        String url = s.next();
////        System.out.println(url.endsWith(".com"));
////        switch (url){
////            case "s1":
////                System.out.println(url.endsWith(".com"));
////                break;
////            case "s2":
////                System.out.println(url.endsWith(".org"));
////                break;
////            case "s3":
////                System.out.println(url.endsWith(".in"));
////                break;
////            default:
////                System.out.println("hence proved");
////
////        }
////     if (url.endsWith(".org")){
////         System.out.println("its a organizational website");
////     }
////     else if (url.endsWith(".com")){
////         System.out.println("its a commerical website");
////     }
////     else if (url.endsWith(".in")){
////            System.out.println("its a indian website");
////        }
////     else {
////         System.out.println("its an unnown website!!!");
////     }
////    question of 5th chapter
////        int b = s.nextInt();
////        for (int i =10; i> 0;i--){
////            System.out.println(i);
////        }
//
////        question 2
////        int a = s.nextInt();
////        int b = s.nextInt();
//////        while (a>b){
//////            System.out.println(a+b);
//////        }
////        do {
////            System.out.println(a+b);
////        }while (a>b);
////         question 2
////        int a =s.nextInt();
////        int sum = 0;
////        for (int n=0; n<a;n++){
////            sum = sum + (2*n);
////        }
////        System.out.println("the sum of first 'a' even number is");
////        System.out.println(sum);
//
////        question 6(while loop)
////        int n = 5;
//        System.out.println("eneter the number-");
//        int n = 5;
//        int  fact = 1;
//        int i = 1;
//        while (i<=n) {
//            fact = i * fact;
//            i++;
//        }
////        System.out.println(fact);
//        System.out.println("factorial of "+n+"is:" +fact);
//        question 11 usuing while loop
//        int sum = 0;

//        int i=0;
//        System.out.println("enetr the number:");
//        int n = s.nextInt();
//        while (i<n){
//            sum = sum + (2*i);
//            i++;
////        }
//        System.out.println("the sum of "+n+ "is:");
//        System.out.print(sum);

        int n =8;
        int sum =0;
        for (int i=1;i<=10;i++){
//            sum = sum + 8*i;
            sum += 8*i;
        }
        System.out.println(sum);

    }
}
