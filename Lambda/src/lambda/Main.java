package lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    String[] planets = new String[]{"Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};

	    System.out.println(Arrays.toString(planets));
	    System.out.println("Sortowanie alfabetyczne:");
	    Arrays.sort(planets);
	    System.out.println(Arrays.toString(planets));
	    System.out.println("Sortowanie wedlug dlugosci:");
	    Arrays.sort(planets,(first, second)-> first.length() - second.length());
	    System.out.println(Arrays.toString(planets));

	    Timer t= new Timer(10000, event -> System.out.println("Jest godzina: "+ new Date()));
	    t.start();

	    JOptionPane.showMessageDialog(null,"Zamknac program?");
	    System.exit(0);
    }
}
