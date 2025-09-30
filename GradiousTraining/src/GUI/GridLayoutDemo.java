package GUI;

import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo {
    JFrame jf;

    GridLayoutDemo() {
        jf = new JFrame();
        jf.setLayout(new GridLayout(3, 3));

        for (int i = 1; i <= 9; i++) {
            jf.add(new JButton(String.valueOf(i)));
        }

        jf.setSize(300, 300);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
