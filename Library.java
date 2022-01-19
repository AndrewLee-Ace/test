import java.util.*;
import java.io.*;
public class Library{

  private int inventory;
  private String libName;

  protected int id;
  protected int numEmployees;
  protected String empName;
  protected ArrayList<String> employees = new ArrayList<>();

  Library(){
      libName = "Generic Name";
      inventory = 0;
      numEmployees = 0;
  }
  Library(String placeName){
      libName = placeName;
      inventory = 0;
      numEmployees = 0;
  }

  Library(String placeName, int a, int n){
      libName = placeName;
      inventory = a;
      numEmployees = n;
  }

  String getLibName(){
      System.out.println("Libarary Name: " + libName);
      return libName;
  }

  int getInventory(){
      System.out.println(inventory + " stock available\n");
      return inventory;
  }


  public static void main(String[] args){
    Library lib = new Library();
    Library lib1 = new Library("Drew's Spot");

    lib.getLibName();
    lib1.getLibName();
    lib1.getInventory();

    Employee Andrew;
  }
}
