package GUI;

import javax.swing.*;
public class JScrollPaneDemo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("JScrollPane Demo");
        JTextArea ta=new JTextArea();
        ta.setText("This is a long text area.\nIt has multiple lines.\nScroll to see more.");
        JScrollPane sp=new JScrollPane(ta);
        sp.setBounds(50,50,200,100);
        jf.add(sp);
        jf.setSize(300,300);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
