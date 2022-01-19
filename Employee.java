import java.util.*;
import java.io.*;
public class Employee extends Library{
  Scanner sc = new Scanner(System.in);
  private int employeeNum;
  protected String sector;
  public ArrayList<Employee> empList = new ArrayList<>();

  Employee(){
      System.out.println("Create Employee \nInput Full Name: ");
      String name = sc.nextLine();
      System.out.println("Employee: " + name + " Sector: " + sector);
      Employee newEmp = new Employee();
  }

}
