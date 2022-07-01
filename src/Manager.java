public class Manager extends  Member{

    String specs;
    String Department;

    @Override
    void printsalary() {
        System.out.println("hello");
    }
    void fsalary(){
        super.printsalary();
    }

    public static void main(String[] args) {
        Manager e1=new Manager();
        e1.name="Abbas";
        e1.age=23;
        e1.address="Ahmedabad";
        e1.specs="IT";
        e1.Department="Devlopment";
        e1.Salary= 500000.00;
        e1.phone="6789456745";

        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.address);
        System.out.println(e1.phone);
        System.out.println(e1.specs);
        System.out.println(e1.Department);
        e1.fsalary();

    }
}
