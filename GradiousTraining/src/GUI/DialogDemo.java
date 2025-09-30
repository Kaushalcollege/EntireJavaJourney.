package GUI;

import javax.swing.*;
public class DialogDemo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Dialog Demo");
        JOptionPane.showMessageDialog(jf, "This is a dialog box");
        jf.setSize(300,300);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}

