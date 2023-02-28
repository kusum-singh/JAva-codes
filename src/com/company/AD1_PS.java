//package com.company;
//
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.HashSet;
//
//public class AD1_PS {
//    public static void main(String[] args) {
//        ArrayList<String> A1 = new ArrayList<>(10);
//        A1.add("Kusum");
//        A1.add("Krishna");
//        A1.add("Shailesh");
//        A1.add("Mithlesh");
//        A1.add("KumKum");
//        A1.add("Nagendra");
//        A1.add("Shanti");
//        A1.add("Singh");
//        A1.add("Simple");
//        A1.add("Dimple");
//        for (Object o: A1) {
//            System.out.println(o);
//        }
//
//
//        LocalTime T = LocalTime.now();
//        System.out.println(T);
//        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:ss");
//        String d = T.format(tf);
//        System.out.println(d);
//
//        Date D = new Date();
//        System.out.println(D.getHours() + ":" +  D.getMinutes() +":"+ D.getSeconds());
//
//        Calendar C = Calendar.getInstance();
//        System.out.println(C.get(Calendar.HOUR)+":"+ C.get(Calendar.MINUTE) +":"+ C.get(Calendar.SECOND));
//
//        HashSet<Integer> H =  new HashSet<>();
//        H.add(12);
//        H.add(12);
//        H.add(12);
//        H.add(12);
//        H.add(12);
//        H.add(12);
//        H.add(12);
//        System.out.println(H);
//
//    }
//}
