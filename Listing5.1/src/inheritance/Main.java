package inheritance;

/**
 * Ten program demonstruje dziedziczenie
 * @author Dawid
 */

public class Main {
    public static void main(String[] args) {
	    Employee[] staff = new Employee[3];
	    Manager boss = new Manager("Henryk Kwiatek", 5000, 1989, 10,1);
	    boss.setBonus(500);

	    staff[0] = boss;
	    staff[1] = new Employee("Dawid Kwiatkowski", 3000, 1990, 12,2);
	    staff[2] = new Employee("Krystian Maciejka", 3600, 1995, 1,2);


	    for(Employee e: staff){
	        System.out.println("Name ="+e.getName()+", salary="+e.getSalary()+", hire day="+e.getHireDay());
        }
    }
}
