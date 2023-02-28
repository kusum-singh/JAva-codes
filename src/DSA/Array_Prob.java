package DSA;

import java.util.Arrays;

public class Array_Prob {
//    //swaping two numbers
//    static void swap(int[] arr, int index1, int index2){
//        int refno = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = refno;
//    }
//    public static void main(String[] args) {
//
//        int[] arr = {12,13,14,15,16};
//        swap(arr,0,1);
//        System.out.println(Arrays.toString(arr));
//    }

    //Max number finding
//    static int Max(int[] arr){
//        int maxval = arr[0];
//        if (arr.length == 0){
//            return -1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]> maxval){
//                maxval = arr[i];
//            }
//        }
//        return maxval;
//
//
//    }
//
//    public static void main(String[] args) {
//        //for the case when array is empty
//        int[] arr = {19,12,45,64,20};
//        System.out.println(Max(arr));
//
//    }

    // Max value within the range
//    static int MaxRange(int[] arr,int index1,int index2){
//        int maxval = arr[index1];
//        for (int i = index1; i<=index2; i++) {
//            if(arr[i]> maxval){
//                maxval = arr[i];
//            }
//        }
//        return maxval;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {19,12,45,64,20};
//        System.out.println(MaxRange(arr,0,4));
//    }


    //Reversing the array (using swap)
//    static  void reverse(int[] arr){
//        int start =0;
//        int end = arr.length-1;
//        while (start < end){
//            swap(arr,start,end);
//            start++;
//            end--;
//        }
//    }
//
//    static void swap(int[] arr, int index1, int index2){
//        int refno = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = refno;
//    }
//    public static void main(String[] args) {
//
//        int[] arr = {12,13,14,15,16};
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
//    }

    //Removing repeated number
//(correct answer nhi aaya)
//    static void remove(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int start = 0;
//            if (start != arr[i]){
//                System.out.println(arr[i]);
//            }
//            else{
//                start++;
//            }
//        }
//    }
//    public static void main(String[] args){
//        int[] arr = {12,12,14,14,16};
//        remove(arr);
//        System.out.println(Arrays.toString(arr));
//    }


}
