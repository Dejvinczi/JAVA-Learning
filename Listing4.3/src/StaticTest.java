public class StaticTest {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Tomasz", 40000);
        staff[1] = new Employee("Dariusz", 60000);
        staff[2] = new Employee("Grzegorz", 65000);

        for(Employee e: staff){
            e.setId();
            System.out.println("Name="+e.getName()+"\n id="+e.getId()+"\n salary="+e.getSalary()+"\n\n");
        }
        System.out.println("Nastepne dostępne id = "+Employee.getNextId());
    }
}
