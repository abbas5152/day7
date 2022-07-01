//Q3)
//        Create a Student class with the following fields:
//        roll: Integer
//        name: String
//        address: String
//        marks: Integer
//        Create a Demo class and perform the following operation in the main method:
//        Take the number as input from the user, How many Student objects need to be
//        created.
//        Create an array of Students with those numbers.
//        Initialise all the student objects by taking details from the user.
//        print all the Student details.
//        print the average of all the Student marks.


import java.util.Scanner;

public class Student {
    int roll;
    String  name;
    String  address;
    int  marks;

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n=s1.nextInt();
        int[] mark=new int[n];
        String[] nam= new String[n];
        String[] add = new String[n];
        int[] no=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter rollno");
            no[i]=s1.nextInt();


            System.out.println("enter student name");
            nam[i]=s1.next();
            System.out.println("enter student address");
            add[i]=s1.next();

            System.out.println("enter marks");
            mark[i]=s1.nextInt();

        }
        for(int i=0;i<n;i++){

            System.out.println( "roll no of student is "+ no[i]);
            System.out.println("name of student is "+ nam[i]);
            System.out.println("address of student is "+add[i]);
            System.out.println("mark  of student is "+ mark[i]);
            System.out.println("-------------------------------");
        }
        int sum=0;
        for(int i=0;i<n;i++) {
           sum=sum+mark[i];
        }
        System.out.println("Avreage score of student is  "+ (sum/n));
    }
}
