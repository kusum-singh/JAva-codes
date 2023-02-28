package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_handling {
    public static void main(String[] args) throws IOException {
//        File myfile = new File("kusumfile.txt");
//        myfile.createNewFile();

//        to wrtie in a file
        FileWriter fw = new FileWriter("kusumfile.txt");
        fw.write("this is my first file to be handeled");
        fw.close();

//        to read a file
//        File myfile = new File("kusumfile.txt");
//        Scanner sc = new Scanner(myfile);
//        while (sc.hasNextLine()){
//            String l = sc.nextLine();
//            System.out.println(l);
//        }
//        sc.close();

//        to delete the file
        File myfile = new File("kusumfile.txt");
        if (myfile.delete()){
            System.out.println("im deleting this file for practising   " +myfile.getName());
        }
        else {
            System.out.println("some fo this codes are confusiong ki kya krna hai esmein but dekhte hai");
        }
    }
}
