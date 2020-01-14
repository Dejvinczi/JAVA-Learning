package anonymouseInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    TalkingClock clock = new TalkingClock();
	    clock.start(10000, true);
	    JOptionPane.showMessageDialog(null,"Czy chcesz zakonczyc dzialanie programu?");
	    System.exit(0);
    }
}

class TalkingClock{
    public void start(int interval, boolean beep){
        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Kiedy usłyszysz dźwięk, będzie godzina: "+new Date());
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer t = new Timer(interval,listener);
        t.start();
    }
}
