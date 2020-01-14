package abstractClasses;

import java.time.LocalDate;

public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        super(n);
        salary = s;
        hireDay = LocalDate.of(year,month,day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    @Override
    public String getDescription() {
        return"Jestem pracownikiem zarabiajacym: "+salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary +=raise;
    }
}
