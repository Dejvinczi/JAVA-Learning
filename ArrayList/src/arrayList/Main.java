package arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> staff= new ArrayList<>();
        staff.add(new Employee("Karol Krakowski", 75000, 1987,12,15));
        staff.add(new Employee("Henryk Kwiatek", 50000, 1989,10,1));
        staff.add(new Employee("Waldemar Kowalski", 40000, 1990,3,15));

        for(Employee e:staff){
            e.raiseSalary(5);
        }

        for(Employee e:staff){
            System.out.println("Name=" +e.getName()+ ", salary=" +e.getSalary()+ ", hireDay=" +e.getHireDay());
        }
    }
}
