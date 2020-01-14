package innerClass;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(10000,true);
        clock.start();
        JOptionPane.showMessageDialog(null,"Czy zamknac program?");
        System.exit(0);
    }
}
