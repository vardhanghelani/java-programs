import java.util.Scanner;
public class Office {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Employes e1= new Employes();
        Manager m1= new Manager();
        System.out.println(" Name, ENTER AGE ,PHONE NUMBER , ADRESS, SALARY");
        e1.Name= s.nextLine();
        e1.Age=s.nextInt();
        s.nextLine();
        e1.phoneNumber=s.nextLine();
        e1.Address=s.nextLine();
        e1.Salary=s.nextDouble();
     e1.Specialization();
        e1.print();
        e1.printSalary();
        System.out.println(" Name, ENTER AGE ,PHONE NUMBER , ADRESS, SALARY OF MANAGER");

        m1.Name= s.nextLine();
           
        m1.Age=s.nextInt();
            m1.phoneNumber=s.nextLine();
            m1.Address=s.nextLine();
            s.nextDouble();
            m1.Salary=s.nextDouble();
            m1.Position();
            m1.print();
            m1.printSalary();

        
    }
}
class Member{
String Name;
int Age;
String phoneNumber;
String Address;
double Salary;
void print(){
    System.out.println("NAME="+Name);
    System.out.println("AGE="+Age);
    System.out.println("PHONE NUMBER="+phoneNumber);
    System.out.println("ADDRESS="+Address);

}
void printSalary(){
    System.out.println("Salary="+Salary);
}
}
class Employes extends Member{
   void Specialization(){
    System.out.println("Speciallization= CYBER SECURITY");
   }
   
}
class Manager extends Member{
void Position(){
    System.out.println("POSTION OF MANAGER = HR");
}
}
