package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }

//        2D array

//        int[][] mom = new int[2][2];
////input
//        for (int row = 0; row < mom.length; row++) {
//            for (int col = 0; col < mom[row].length; col++) {
//                mom[row][col] = sc.nextInt();
//            }
//        }
//output - 1
//        for (int row = 0; row < mom.length; row++) {
//            for (int col = 0; col < mom[row].length; col++) {
//                System.out.print(mom[row][col] + " ");
//            }
//            System.out.println();
//        }
//
//output- 2
//        for (int row = 0; row < mom.length; row++) {
//            System.out.println(Arrays.toString(mom[row]));
//        }
// output - 3
//        for (int[] a : mom   //here int type is itself a array cause a 2d array is a array of previous number therefor here int[] is used indicating it as an array
//             ) {
//            System.out.println(Arrays.toString(a));
//
//        }

//        ArrayList<Integer> l=  new ArrayList<>();
//        l.add(2400000);
//        l.add(120000);
//        l.add(78);
//        l.add(4);
//        l.add(12);
//        System.out.println(l);
//        System.out.println(l.contains("kusum"));
//        for (int i = 0; i < 5; i++) {
//            l.add(sc.nextInt());
//        }
//        System.out.println(l);
//        for (int i = 0; i < 5; i++) {  //for prinitng l at  l[index]
//            System.out.println(l.get(i));
//        }

//        Multi-Arraylist
        ArrayList<ArrayList<Integer>>  l1 = new ArrayList<>();
        //initializing i.e adding in l1 through for loop
        for (int i = 0; i < 2; i++) {
            l1.add(new ArrayList<>());
        }

        //add elements
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                l1.get(i).add(sc.nextInt());
            }

        }
        System.out.println(l1);


    }
}
