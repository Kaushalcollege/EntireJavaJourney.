package GUI;

import javax.swing.*;
public class JButtonDemo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("JButton Demo");
        JButton b1=new JButton("Click Me");
        b1.setBounds(100,100,100,30);
        jf.add(b1);
        jf.setSize(300,300);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
