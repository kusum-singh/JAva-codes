//package com.company;
////class cylinder{
////    private int radius;
////    private int height;
////
////    public int getRadius() {
////        return radius;
////    }
////
////    public void setRadius(int radius) {
////        this.radius = radius;
////    }
////
////    public int getHeight() {
////        return height;
////    }
////
////    public void setHeight(int height) {
////        this.height = height;
////    }
////}
////
////public class ch_9_practise_set {
////    public static void main(String[] args) {
////        cylinder c1 = new cylinder();
////        c1.setHeight(12);
////        int h= c1.getHeight();
////        System.out.println("the height of cylinder is " +h);
////
////        c1.setRadius(5);
////        int r = c1.getRadius();
////        System.out.println("the height of cylinder is " +r);
////
////        System.out.println("the volume of cylinder is " +(3.14*r*r*h));
////        System.out.println("the surface area of ctlinder is " +((2*3.14*r*h)+(2*3.14*r*r)));
////    }
////
////
////}
//
////QUESTION 3
////class cylinder{
////    private int radius;
////    private int height;
////
////    public cylinder(int radius, int height){
////        this.radius=radius;
////        this.height=height;
////    }
////
////    public int getRadius() {
////        return radius;
////    }
////
////    public int getHeight() {
////        return height;
////    }
////}
////
////public class ch_9_practise_set {
////    public static void main(String[] args) {
////        cylinder c2 = new cylinder(5,5);
////        System.out.println("the radius and height of cylinder is respectively");
////        System.out.print(c2.getHeight());
////        System.out.println(c2.getRadius());
////    }
////}
//class rectangle{
//    private int lenght;
//    private int breath;
//
//    public rectangle(int lenght,int breath) {
//        this.lenght = lenght;
//        this.breath = breath;
//    }
//    int area(int l, int b){
//        l=lenght;
//        b=breath;
//        int area= l*b;
//        System.out.println(area);
//        return area;
//
//    }
//    public rectangle() {
//        int length = 2;
//        int breath = 2;
//    }
//
//    public int getLenght() {
//        return lenght;
//    }
//
//    public int getBreath() {
//        return breath;
//    }
//}
//
//public class ch_9_practise_set {
//    public static void main(String[] args) {
//        rectangle r1 = new rectangle(5,10);
//        System.out.println(r1.getBreath());
//        System.out.println(r1.getLenght());
//        System.out.println("the area of rectangle is " +(r1.getBreath()* r1.getLenght()));
//        r1.area(5,2);
//
//    }
//}
