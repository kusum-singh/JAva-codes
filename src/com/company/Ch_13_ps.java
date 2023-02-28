//package com.company;
////all 1st, 2nd , 3rd question's solution in one problem
//
///**
// * @author kusum singh
// * @version 2.0
// * @since 2002
// * @see " im great to see my java doc"
// */
//
///**
// * @param "here parameter is void type"
// * @return here return type is void so no return is required
// * @throws InterruptedException is the type of exception occured
// * @deprecated no deprecated method was used
// */

//class kusumsingh extends Thread{
//    @Override
//    public void run() {
//            System.out.println("Good Morning");
//
//    }
//    public void kks(){
//        System.out.println("knock kncok!!");
//    }
//}
//class krishna extends Thread{
//    @Override
//
//    public void run() {
//            System.out.println("welcome!!!!!");
//    }
//    public void k2(){
//        try {
//            Thread.sleep(20);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("sleep fast!!!");
//    }
//}

//public class Ch_13_ps {
//    public static void main(String[] args) {
//        kusumsingh ks = new kusumsingh();
//        ks.start();
//        krishna kk = new krishna();
//        kk.start();
//        kk.k2();
//        ks.kks();
//        kk.setPriority(Thread.MAX_PRIORITY);
//        ks.setPriority(Thread.MIN_PRIORITY);
//        System.out.println(ks.getPriority());
////        System.out.println(ks.getState());
//    }
//}
