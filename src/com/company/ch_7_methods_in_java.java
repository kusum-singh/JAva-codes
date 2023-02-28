package com.company;
import sun.security.krb5.internal.crypto.CksumType;

import java.util.Scanner;
public class ch_7_methods_in_java {
    int logic(int x, int y) {
        int c;
        c = y + x * x;
        return c;
    }

    public static void main(String[] args) {
        ch_7_methods_in_java object = new ch_7_methods_in_java();
        int a = 10;
        int b= 5;
        int z;


        z = object.logic(a, b);
        System.out.println(z);
    }

//    static void name(int a) {
//        a = 89;
//        return;
//    }

//    static int chnge(int q, int r) {
//        int j;
//        j = q - r;
//        return j;
//    }

//    static void kusum(int[] array) {
//        array[1] = 200;
//    }

//    public static void main(String[] args) {
//        int[] arr={24,35,67,48,19};
//        int x = 24;
//        int y = 8;
//        name(x);
//        System.out.println(x);
//
//        int i = 10;
//        int g = 5;
//        int z;
//        z = chnge(i,g);
//        System.out.println(z);
//
//        int[] marks ={10,20,30,40,50,60};
//        kusum(marks);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//    }

//  ~METHOD OVERLAPPING
//    static void curtain(){
//        System.out.println("great morning");
//    }
//    static void  curtain(int a){
//        System.out.println("good morning *" + a + "love you");
//    }
//    static int curtain(int a, int b){
//        System.out.println("good morning *" + a + "love you");
//        return b;
//    }

//    public static void main(String[] args) {
//        curtain();
//        curtain(20);
//        curtain(200, 50);
//    }
// static void  curtain(int a){
//        System.out.println("good morning *" + a + "love you");
//    }

//    VARARGS
//    static int sum(int...arr){
//        int sum=0;
//        for (int element: arr){
//         sum = sum + element;
//        }
//        return sum;
//    }
//static int sum(int a,int...arr){
//        int sum=a;
//        for (int element: arr){
//         sum = sum + element;
//        }
//        return sum;
//    }

//    public static void main(String[] args) {
//        System.out.println("the addtion of 55,78 and 55 is " +sum(55,55,78));
//        System.out.println("the addtion of 55,78 and 55 is " +sum(0));
//    }
//    public  static void main(String[] args) {
//        System.out.println("the addtion of 55,78 and 55 is " +sum(55,55,78));
//        System.out.println("the addtion of 55,78 and 55 is " +sum(25));
//    }

//    RECURSION
//    static int factorial(int a){
//    if (a==0 || a==1){
//        return 1;
//    }
//    else {
//        return a*factorial(a-1);
//    }
//    }

//    public static void main(String[] args) {
//        System.out.println("eneter the nummber:");
//    Scanner s= new Scanner(System.in);
//    int n= s.nextInt();
//        System.out.println("the factorial of " +n + "is:");
//        System.out.print(factorial(n));
//    }


//     static void ksum(int [] x){
//        x [1] = 2;
//
//    }
//    public static void main(String[] args) {
//        int [] y = { 1,2,3,4,5,6};
//        System.out.println(y[1]);
//    }

//    static int factorial(int n){
//        if (n==0 || n==1){
//            return 1;
//        }
//        else {
//            int mul =1; ;
//            for (int i =1; i<= n;i++){
//                mul *= i;
//            }
//            return mul;
//        }
//    }
//
//    public static void main(String[] args) {
//        int v =4;
//        System.out.println(factorial(v));
//    }






}
