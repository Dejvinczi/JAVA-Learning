package enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj rozmiar: (SMALL, MEDIUM, LARGE, EXTRA_LARGE):");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("rozmiar="+size);
        System.out.println("skrót="+size.getAbbrevitation());
        if(size == Size.EXTRA_LARGE)
            System.out.println("Dobra robota -> nie pominąłeś zanaku podkreślenia!");
    }

    enum Size
    {
        SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

        private String abbrevitation;

        private Size(String abbrevitation){
            this.abbrevitation = abbrevitation;
        }
        public String getAbbrevitation(){
            return abbrevitation;
        }
    }
}
