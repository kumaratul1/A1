class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;

    }

    public void setName(String n) {
        name = n;
    }

}
public class Oops_1 {
    public static void main(String[] args) {
        Employee Atul= new Employee();
        Atul.setName("Atul");
        System.out.println(Atul.getName());
        Atul.salary=500000;
        System.out.println(Atul.getSalary());




    }
}
