//        Now, create a Main class which has the main method in it and assign name, age, phone
//        number, address and salary to an employee and a manager by making an object of both of these
//        classes and print the same.


public class Employee extends  Member{
    String specs;
    String Department;

    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.name="Raj";
        e1.age=21;
        e1.address="Mumbai";
        e1.specs="IT";
        e1.Department="Devlopment";
        e1.Salary= 50000.00;
        e1.phone="6789456745";

        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.address);
        System.out.println(e1.phone);
        System.out.println(e1.specs);
        System.out.println(e1.Department);
        e1.printsalary();

    }
}
