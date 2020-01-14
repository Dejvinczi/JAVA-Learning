package interfaces;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String n, double s){
        name = n;
        salary = s;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * Porownanie pracownikow pod wzgledem
     * @param o (other) inny obiekt klasy Employe
     * @return wartosc ujemna, jestli pracownik ma nizsza pensje niz inny (other) pracownik,
     * 0 jesli sa rowe, w przeciwnym razie liczba dodatnia
     */
    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }
}
