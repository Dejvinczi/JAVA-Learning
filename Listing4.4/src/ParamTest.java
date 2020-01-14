public class ParamTest {
    public static void main(String[] args)
    {
        //TEST 1 METODY NIE MOGĄ MODYFIKOWAĆ PARAMETRÓW LICZBOWYCH
        System.out.println("Testowanie tripleValue:");
        double percent = 10;
        System.out.println("Przed: percent = "+percent);
        tripleValue(percent);
        System.out.println("Po: percent = "+percent);

        System.out.println();
        //TEST 2 METODY MOGA ZMIENIAC STAN APARAMETROW BEDACYCH OBIEKTAMI
        System.out.println("Testowanie tripleSalary:");
        Employee harry = new Employee("Grzegorz", 5000);
        System.out.println("Przed: salary = "+harry.getSalary());
        tripleSalary(harry);
        System.out.println("Po: salary = "+harry.getSalary());

        System.out.println();
        //TEST 3 METODY NIE MOGA DODAWAC NOWYCH OBIEKTOW DO PARAMETROW OBIEKTOWYCH
        System.out.println("Testowanie swap:");
        Employee a = new Employee("Dawid", 7000);
        Employee b = new Employee("Tomasz", 5000);
        System.out.println("Przed: a = "+a.getName());
        System.out.println("Przed: b = "+b.getName());
        swap(a,b);
        System.out.println("Po: a = "+a.getName());
        System.out.println("Po: b = "+b.getName());
    }

    public static void tripleValue(double x)
    {
        x = 3 * x;
        System.out.println("Koniec metody: x=" +x);
    }

    public static void tripleSalary(Employee x)
    {
        x.raiseSalary(200);
        System.out.println("Koniec metody: salary="+x.getSalary());
    }

    public static void swap(Employee x, Employee y)
    {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("Koniec metody: x="+x.getName());
        System.out.println("Koniec metody: y="+y.getName());
    }
}
