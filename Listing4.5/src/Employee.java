import java.util.Random;

public class Employee {
    private static int nextId;

    private String name;
    private int id;
    private double salary;

    static
    {
        Random generator = new Random();
        //Ustawiamy zmienna na liczbe losowa z przedzialu o 0-999
        nextId = generator.nextInt(1000);
    }

    {
        id = nextId;
        nextId++;
    }

    //3 konstruktory przeciązone
    //1
    public Employee(String n, double s){
        name = n;
        salary = s;
    }

    //2
    public Employee(double s){
        this("Employee#"+nextId, s);
    }

    //3
    public Employee(){
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }
}
