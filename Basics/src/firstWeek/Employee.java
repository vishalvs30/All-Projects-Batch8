package firstWeek;

public class Employee {
  String eName="Jhon";
  int eId=61;
  double Salary=25000.00;
  String designation="Project Engineer";
  
  public static void main(String[] args) {
	Employee emp = new Employee();
	System.out.println("Employee Name: "+emp.eName);
	System.out.println("Employee Id: "+emp.eId);
	System.out.println("Employee salary: "+emp.Salary);
	System.out.println("Employee Designation: "+emp.designation);


}
}
