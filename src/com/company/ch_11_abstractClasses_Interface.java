//package com.company;
//import java.util.Scanner;
//import com.sun.org.apache.xpath.internal.objects.XString;
////interface codes
////interface kusum{
////    void goal(int first);
////    void aim(int second);
////}
////interface singh{
////    public void plans();
////}
////class future implements kusum , singh{
////    void statment(){
////        System.out.println("you are the best!!!!");
////    }
////
////    @Override
////    public void aim(int second) {
////        System.out.println("get placed in FANG companies"+second);
////    }
////
////    @Override
////    public void goal(int first) {
////        System.out.println("to get first package of more than 10-12LPA"+first);
////    }
////
////    @Override
////    public void plans() {
////        System.out.println("cleaning the home for 'Diwali'");
////    }
////}
////public class ch_11_abstractClasses_Interface {
////    public static void main(String[] args) {
////        future f =new future();
////        f.aim(2);
////        f.plans();
////        f.goal(3);
////    }
//
////}
////multiple inheritance
////interface hobby{
////    void dance();
////    void listening_music();
////}
////
////interface  passion{
////    void coding();
////}
////
////class life{
////    int plans(int number){
////        System.out.println("no. of plans for november=" +number);
////        return number;
////    }
////}
////class Future extends life implements passion,hobby{
////
////    public void coding() {
////        System.out.println("right now im focusing on java");
////    }
////
////
////    public void dance() {
////        System.out.println("its just an hobby that makes me feel great");
////    }
////
////
////    public void listening_music() {
////        System.out.println("its my all time favorite work to listen songs and imagine");
////    }
////
////    void lifelong(){
////        System.out.println("till now i juts wanna get a job of 10-12lpa and enjoy life afetr that");
////    }
////}
//// public class ch_11_abstractClasses_Interface {
////     public static void main(String[] args) {
////         Future f =new Future();
////         f.coding();
////         f.plans(100);
////         f.dance();f.lifelong(); f.listening_music();
////
////     }
////}
//interface kusum{
//
//    int age(int age);
//    int phonenumber(int num);
//    void level();
//}
//interface Surname{
//    void surname();
//    void gotrr();
//}
//class Family{
//    void papa(){
//        System.out.println("i call him PITASHRI");
//    }
//    void ma(){
//        System.out.println("i call her matashri");
//    }
//    void bhaiya(){
//        System.out.println("i call him bhratashri and anuj bhratashri");
//    }
//}
//class Myworld extends Family implements kusum,Surname{
//    public void myworld(){
//        System.out.println("myworld contain every one ");
//    }
//    public void part2(){
//        System.out.println("my career is also included in myworld");
//    }
//
//    @Override
//    public int age(int age) {
//        System.out.println("my age is-" +age);
//        return 0;
//    }
//
//    @Override
//    public int phonenumber(int num) {
//        System.out.println("my phonenumber is-" +num);
//        return 0;
//    }
//
//    @Override
//    public void level() {
//        System.out.println("Im the youngest in the house");
//    }
//
//    @Override
//    public void gotrr() {
//        System.out.println("my gotrr is 'Kashyap'");
//    }
//
//    @Override
//    public void surname() {
//        System.out.println("my Surname is Singh");
//    }
//}
//
//public class ch_11_abstractClasses_Interface {
//    public static void main(String[] args) {
//        Surname s = new Myworld();
//        s.gotrr();
//        s.surname();
//        kusum k = new Myworld();
//        k.age(20);
//        k.level();
//        k.phonenumber(8308007);
//
//
//    }
//}
