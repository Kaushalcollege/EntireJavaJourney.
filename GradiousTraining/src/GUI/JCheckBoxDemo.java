package GUI;

import javax.swing.*;
public class JCheckBoxDemo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("JCheckBox Demo");
        JCheckBox cb1=new JCheckBox("Java");
        cb1.setBounds(100,100,100,30);
        JCheckBox cb2=new JCheckBox("Python");
        cb2.setBounds(100,150,100,30);
        jf.add(cb1);
        jf.add(cb2);
        jf.setSize(300,300);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
