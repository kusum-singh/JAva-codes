package com.company;
class emoplyee{
    int id;
    String name;
    void details(){
        System.out.println("my id is:" +id);
        System.out.println("and my name is:" +name);
    }

}
public class ch_8_OOPs {
    public static void main(String[] args) {
        emoplyee kusum = new emoplyee();
        emoplyee krishna = new emoplyee();
         kusum.id=14;
         kusum.name= "kusum singh";
         krishna.id=90;
         krishna.name= "krishna singh";
         krishna.details();

         kusum.details();
    }


    }
