import com.horstmann.corejava.Employee;
import static java.lang.System.*;

public class PackageTest {

    public static void main(String[] args) {
	Employee harry = new Employee("Hubert Kowalski", 5000, 1989, 10, 1);

	harry.raiseSalary(5);

	out.println("Name= "+harry.getName()+", salary="+harry.getSalary()+", hire day= "+harry.getHireDay());
    }
}
