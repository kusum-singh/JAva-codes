package com.company;

import javafx.scene.control.ListView;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;

//public class AD1 extends Thread{
//    Arraylist
//public static void main(String[] args) {
//    ArrayList<Integer> L1 = new ArrayList<>();
//    ArrayList<Integer> L2 = new ArrayList<>(2);
//L2.add(1);
//L2.add(111);
//L2.add(11);
//    System.out.println(L2);
//    L1.add(12);
//    L1.add(13);
//    L1.add(16);
//    L1.add(15);
//    L1.add(14);
//    System.out.println(L1);
//    System.out.println(L1.get(3));
//    L1.add(1,2);
//    System.out.println(L1.get(1));
//    System.out.println(L1);
//    L1.addAll(0,L2);
//    System.out.println(L1);
//    System.out.println(L1.contains(11));
//    L1.add(0,12);
//    System.out.println(L1);
//    System.out.println(L1.indexOf(12));
//    System.out.println(L1.lastIndexOf(12));
//    L1.set(0,122);
//    System.out.println(L1);
////    L1.remove(5);
////    System.out.println(L1);
//}
//}

//    Linked List
//public static void main(String[] args) {
//    LinkedList<Integer> L1 = new LinkedList<>();
//    L1.add(129);
//    L1.add(128);
//    L1.add(156);
//    L1.add(13);
//    System.out.println(L1);
//    L1.addFirst(123);
//    System.out.println(L1);
//    L1.addLast(3455);
//    System.out.println(L1);
//    System.out.println("prints first number of array");
//    System.out.println(L1.getFirst());
//    System.out.println("prints last number of array");
//    System.out.println(L1.getLast());
//    System.out.println(L1.subList(2,4));

//    Object[] objectAarray = L1.toArray();
//    int length = objectAarray.length;;

//   Object[] kks = new Object[L1.size()];
//    kks = L1.toArray();
//    System.out.println(kks);

//    ListIterator<Integer> n = L1.listIterator(2);
//    while (n.hasNext()){
//        System.out.println(n.next());
//    }
//}

//    public static void main(String[] args) {
//        ArrayDeque<Integer> A = new ArrayDeque<>(6);
//        A.add(12);
//        A.add(13);
//        A.add(14);
//        A.add(15);
//        A.add(16);
//        A.add(17);
//        A.add(18);
//        System.out.println(A);
//        System.out.println(A.getLast());
//        System.out.println(A.pollLast());
//        System.out.println(A);System.out.println(A.pollLast());
//        System.out.println(A);System.out.println(A.pollLast());
//        System.out.println(A);System.out.println(A.pollLast());
//        System.out.println(A);System.out.println(A.pollLast());
//        System.out.println(A);System.out.println(A.pollLast());
//        System.out.println(A);System.out.println(A.pollLast());
//        System.out.println(A);
//
//        A.pollFirst();
//    }

//    public static void main(String[] args) {
//        HashSet<Integer> H = new HashSet<>(4, 0.4f);
//        H.add(3);
//        H.add(4);
//        H.add(8);
//        H.add(5);
//        H.add(59);
////        H.add(67);   ignored cause 4 is the capacity of hashset
//        System.out.println(H);
//        System.out.println(H.isEmpty());
//        System.out.println(H.size());
//        H.clear();
//        System.out.println(H);
//
//    }
public class AD1 {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
//        System.out.println(System.currentTimeMillis()/1000/3600/365/24);
//        System.out.println(Long.MAX_VALUE);
//
//        Date D = new Date(32);
//        Date D1 = new Date();
//        System.out.println(D);
//        System.out.println(D1);
//        System.out.println(D.getTime());
//        System.out.println(D1.getTime());
//        System.out.println(D1.compareTo(D));

//        Calendar C = Calendar.getInstance();
//        System.out.println(C.getCalendarType());
//        System.out.println(C.getTime());
//        System.out.println(C.get(Calendar.YEAR));
//        System.out.println(C.get(Calendar.DAY_OF_MONTH));
//        C.add(Calendar.YEAR, 5);
//        System.out.println(C.getTime());
//        System.out.println(C.getWeeksInWeekYear());
//        System.out.println(C.getMaximum(Calendar.WEEK_OF_MONTH));
//        Calendar C1 = Calendar.getInstance(TimeZone.getTimeZone("Mumbai"));
//        System.out.println(C1.getTimeZone());


        LocalDateTime dt = LocalDateTime.now();
//        System.out.println(dt);
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ISO_LOCAL_DATE");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
        String mydate = dt.format(dtf);
        System.out.println(mydate);





    }

}

//}