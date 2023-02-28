//package com.company;
//
//// Question 1,2,3 are imergeed in one
////class kkc{
////    @Deprecated
////    void clam(){
////        System.out.println("my work is coding recently");
////    }
////}
/////**
//// * @deprecated here a method is deprecated
//// */
////public class AD_2_ps {
////    @SuppressWarnings("Deprecation")
////
////    public static void main(String[] args) {
////        kkc k2 = new kkc();
////
////        k2.clam();
////    }
////}
//// Question 4
////interface  kkm{
////    void name();
////}
////public class  AD_2_ps{
////    public static void main(String[] args) {
////        kkm k3 = new kkm() {
////            @Override
////            public void name() {
////                System.out.println("im kuusm singh anf this is ananymous class");
////            }
////
////        };
////        k3.name();
//
////        kkm k3 = ()->{
////            System.out.println("im dimple and this is lambda expression");
////        };
////        k3.name();
////    }}
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class AD_2_ps {
//    public static void main(String[] args) {
//        int i = 7;
//        String table = " ";
//        for (int j = 1; j<=10; j++){
//          table += i*j;
//          table += "\n";
//        }
//        int i1 = 87;
//        String table1 = " ";
//        for (int j1 = 1; j1<=10; j1++){
//          table += i1*j1;
//          table += "\n";
//        }
//        try {
//            FileWriter fw = new FileWriter("multiplication table.txt");
//            fw.write(table);
//            fw.write(table1);
//            fw.close();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
//}