package com.company;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
//CODES ARE PRESENTED BY KUSUM SINGH
//public class swingclass {
//    //    JFRAME EXAMPLE
//    swingclass() {
//        JFrame f = new JFrame();
//        DefaultListModel<String> l1 = new DefaultListModel<>();
//        l1.addElement("NAME");
//        l1.addElement("CLASS");
//        l1.addElement("ROLL NUMBER");
//        JList<String> list = new JList<>(l1);
//        list.setBounds(200, 100, 75, 75);
//        f.add(list);
//        f.setSize(800, 400);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//
//    public static void main(String args[]) {
//        new swingclass();
//    }
//}

// BUTTON EXAMPLE
//    public static void main(String[] args) {
//        JFrame f=new JFrame("MAIN MENU");
//        JButton b=new JButton("Click Here");
//        b.setBounds(50,100,95,30);
//        f.add(b);
//        f.setSize(400,400);
//        f.setLayout(null);
//        f.setVisible(true);
//    }


//}


// JRADIOBUTTON EXAMPLE
//public class swingclass {
//    JFrame f;
//    swingclass (){
//        f=new JFrame();
//        JRadioButton r1=new JRadioButton("A) Male");
//        JRadioButton r2=new JRadioButton("B) Female");
//        r1.setBounds(75,50,100,30);
//        r2.setBounds(75,100,100,30);
//        ButtonGroup bg=new ButtonGroup();
//        bg.add(r1);bg.add(r2);
//        f.add(r1);f.add(r2);
//        f.setSize(300,300);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//    public static void main(String[] args) {
//        new swingclass ();
//    }

//CheckBox Example

//    swingclass(){
//        JFrame f= new JFrame("CheckBox Example");
//        JCheckBox checkBox1 = new JCheckBox("C++");
//        checkBox1.setBounds(100,100, 50,50);
//        JCheckBox checkBox2 = new JCheckBox("Java", true);
//        checkBox2.setBounds(100,150, 50,50);
//        f.add(checkBox1);
//        f.add(checkBox2);
//        f.setSize(400,400);
//        f.setLayout(null);
//        f.setVisible(true);
//    }
//    public static void main(String args[])
//    {
//        new swingclass();
//    }

//JTable example
//    JFrame f;
//    swingclass(){
//        f=new JFrame();
//        String data[][]={ {"101","Amit","670000"},
//                {"102","Jai","780000"},
//                {"101","Sachin","700000"}};
//        String column[]={"ID","NAME","SALARY"};
//        JTable jt=new JTable(data,column);
//        jt.setBounds(30,40,200,300);
//        JScrollPane sp=new JScrollPane(jt);
//        f.add(sp);
//        f.setSize(300,400);
//        f.setVisible(true);
//    }
//    public static void main(String[] args) {
//        new swingclass();
//    }
//

// jtogglebutton example
//    public static void main(String[] args) {
//        new swingclass();
//    }
//    private JToggleButton button;
//    swingclass() {
//        setTitle("JToggleButton with ItemListener Example");
//        setLayout(new FlowLayout());
//        setJToggleButton();
//        setAction();
//        setSize(200, 200);
//        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//    private void setJToggleButton() {
//        button = new JToggleButton("ON");
//        add(button);
//    }
//    private void setAction() {
//        button.addItemListener(this);
//    }
//    public void itemStateChanged(ItemEvent eve) {
//        if (button.isSelected())
//            button.setText("OFF");
//        else
//            button.setText("ON");
//    }
//}
