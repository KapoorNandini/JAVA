import javax.print.event.PrintEvent;

class Employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("My Id is " +id);
        System.out.println("My name is " +name);
    }
    public int getSalary(){
        return salary;
    }
}
public class classes {
    public static void main(String[] args) {
        Employee kabir = new Employee();
        Employee sooraj = new Employee();
        
        kabir.id = 12;
        kabir.name = "kabir singh";
        kabir.salary = 100000;

        sooraj.id = 5;
        sooraj.name = "sooraj kumar";
        sooraj.salary = 80000;

        kabir.printDetails();
        sooraj.printDetails();

        int salary = kabir.getSalary();
        int salary2 = sooraj.getSalary();
        System.out.println("The salary is "+salary);
        System.out.println(salary2);




    }
}
