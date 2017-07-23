package book.chap14.java;

import book.chap11.ArrayEnv;
import javax.swing.JOptionPane;

public class read {
    public static String m(ArrayEnv env) { return m(); }
    public static String m() {
        return JOptionPane.showInputDialog(null);
    }
}