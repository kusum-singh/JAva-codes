package com.company;
//Question 3rd and 5th
//class monkey{
//    void jump(){
//        System.out.println("our ancerstors i.e monkeies used to jump");
//    }
//    void bite(){
//        System.out.println("monkeis used to bite the animals and fruits");
//    }
//}
//interface Basicanimal{
//    void eat();
//    void sleep();
//}
//class Human extends monkey implements Basicanimal{
//    @Override
//    public void eat() {
//        System.out.println("as animals grew up they started to est manually");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("as animals grew they started to sleep and enjoy life");
//    }
//}
//public class Ch_11_PS {
//    public static void main(String[] args) {
//        Basicanimal Ba = new Human();
//        Ba.eat();
//        Ba.sleep();
//
//        Human h = new Human();
//        h.jump();
//        h.bite();
//    }
//}


//Question 4th
abstract  class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smartphone extends telephone{
    void grsphics(){
        System.out.println("smartphone has a feature og graphics");
    }

    @Override
    void lift()
        {
            System.out.println("after ringing we have to lift the phone");
        }

    @Override
    void disconnect() {
        System.out.println("disconnecting......");
    }

    @Override
    void ring() {
        System.out.println("ringinggg......");
    }
}
public class Ch_11_PS {
    public static void main(String[] args){
        telephone n =new smartphone();
        n.disconnect();
        n.lift();
        n.ring();

    }
}

//Question 1 and 2nd
//abstract class pen{
//    abstract  void write();
//   abstract void refill();
//}
//class Fountainpen extends pen{
//    @Override
//    void refill() {
//        System.out.println("lets refill our pen");
//    }
//
//    @Override
//    void write() {
//        System.out.println("we write with the help of a pen");
//    }
//}
//public class Ch_11_PS {
//    public static void main(String[] args) {
//        Fountainpen f = new Fountainpen();
//        f.refill();
//        f.write();
//    }
//}

//Question 6 aand 7
//interface tvremotr{
//    void buttonremote();
//}
//interface smarttvremote extends tvremotr{
//    @Override
//    void buttonremote();
//    void remote();
//    void features();
//}
//
//class tv implements smarttvremote{
//    @Override
//    public void buttonremote() {
//        System.out.println("its called purane zamane ka remote");
//    }
//
//    @Override
//    public void remote() {
//        System.out.println("smart tv should have smart remote");
//    }
//
//    @Override
//    public void features() {
//        System.out.println("smart tv has many features like casting phone");
//    }
//}
//public class Ch_11_PS {
//    public static void main(String[] args) {
//        smarttvremote sr = new tv();
//        sr.buttonremote();
//        sr.features();
//        sr.remote();
//    }
//}
