package interfaces;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Employee[] staff = new Employee[3];

	    staff[0] = new Employee("Henryk Kwiatek", 35000);
        staff[1] = new Employee("Karol Kowalski", 75000);
        staff[2] = new Employee("Tadeusz Nowak", 35000);

        Arrays.sort(staff);

        for(Employee e : staff){
            System.out.println("Name=" +e.getName()+", salary=" +e.getSalary());
        }
    }
}
