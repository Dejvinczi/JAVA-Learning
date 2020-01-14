package timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        Timer t = new Timer(10000, listener);
        t.start();

        JOptionPane.showMessageDialog(null,"Zamknąć program?");
        System.exit(0);
    }

static class TimePrinter implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(("Kiedy usłyszysz sygnał, będzie godzina: "+ new Date()));
        Toolkit.getDefaultToolkit().beep();
    }
}

}
