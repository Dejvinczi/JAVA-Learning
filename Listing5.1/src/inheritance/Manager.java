package inheritance;

public class Manager extends Employee{
    private double bonus;

    /**
     * @Param n imię i nazwisko
     * @Param s pensja
     * @Param year rok zatrudnienia
     * @Param month miesiac zatrudnienia
     * @Param day dzien zatrudnienia
     */

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bonus = 0;
    }


    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b){
        bonus = b;
    }
}
