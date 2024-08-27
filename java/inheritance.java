import java.util.Scanner;
class Employee
{
    String name;
    double Salary;
    int age;
    double Phno;
    public Employee(String name,double Salary,int age,double Phno)
    {
        this.name = name;
        this.Salary = Salary;
        this.age=age;
        this.Phno=Phno;
    }
    public void printSalary()
    {
        System.out.println("Salary = "+Salary);
    }
    public void displayemployee()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Phone Number : "+Phno);
        printSalary();
    }
}
class Manager extends Employee
    {
        String Specialization;
        public Manager(String name,double Salary,int age,double Phno,String Specialization)
        {
            super(name,Salary,age,Phno);
            this.Specialization = Specialization;
        }
        public void displaymanager()
        {
            displayemployee();
            System.out.println("Specialization : "+Specialization);
        }
    }
class Officer extends Employee
    {
        String Department;
        public Officer(String name,double Salary,int age,double Phno,String Department)
        {
            super(name,Salary,age,Phno);
            this.Department = Department;
        }
        public void displayofficer()
        {
            displayemployee();
            System.out.println("Department : "+Department);
        }
    }
class Test
{
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the manger Details");
        System.out.println("Enter the manger name");
        String name = s.nextLine();
        System.out.println("Enter the manger age");
        int age = s.nextInt();
        System.out.println("Enter the manger salary");
        double Salary = s.nextInt();
                        s.nextLine();
        System.out.println("Enter the manger Phone Number");
        double Phno = s.nextInt();
                      s.nextLine();
        System.out.println("Enter the manger Specialization");
        String Specialization = s.nextLine();
        Manager m = new Manager(name,Salary,age,Phno,Specialization);
        System.out.println(" ");
        System.out.println("Manager Details");
        m.displaymanager();

        System.out.println("Enter the officer Details");
        System.out.println("Enter the officer name");
        String name1 = s.nextLine();
        System.out.println("Enter the officer age");
        int age1 = s.nextInt();
                s.nextLine();
        System.out.println("Enter the officer salary");
        double Salary1 = s.nextDouble();
        System.out.println("Enter the officer Phone Number");
        double Phno1 = s.nextInt();
                        s.nextLine();
        System.out.println("Enter the officer Department");
        String Department = s.nextLine();
        Officer f = new Officer(name1,Salary1,age1,Phno1,Department);
        System.out.println(" ");
        System.out.println("Officer Details");
        f.displayofficer();
    }
}
