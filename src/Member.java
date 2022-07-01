//Q2)
//        Create a class named 'Member' having the following members:
//        Name : String
//        Age : int
//        Phone number : String
//        Address : String
//        Salary : double
//        It also has a method named 'printSalary' which prints the salary of the members.
//        Create two classes 'Employee' and 'Manager' that inherits the 'Member' class.
//        The 'Employee' and 'Manager' classes have members :
//        Specialisation : String
//        Department : String
//        Now, create a Main class which has the main method in it and assign name, age, phone
//        number, address and salary to an employee and a manager by making an object of both of these
//        classes and print the same.




public class Member {
    String name;
    int age;
    String phone;
    String address;
    Double Salary;

    void printsalary(){
        System.out.println("Salary of member is "+Salary );
    }
}
