package mark35Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class Employee {
    private int empId;
    private String empName;
    private String dept;
    private int rating;
    private int salary;

    // Parameterized constructor
    public Employee(int empId, String empName, String dept, int rating, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
        this.rating = rating;
        this.salary = salary;
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDept() {
        return dept;
    }

    public int getRating() {
        return rating;
    }

    public int getSalary() {
        return salary;
    }

    // Setters
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Solution8 {
    public static void main(String[] args) {
        // Read Employee data and call the methods here
    	 Scanner scanner = new Scanner(System.in);
         List<Employee> employeeList = new ArrayList<>();

         // Read employee data
         for (int i = 0; i < 5; i++) {
             int empId = scanner.nextInt();
             String empName = scanner.next();
             String dept = scanner.next();
             int rating = scanner.nextInt();
             int salary = scanner.nextInt();
             employeeList.add(new Employee(empId, empName, dept, rating, salary));
         }

         // Read salary and department for methods
         int salaryInput = scanner.nextInt();
         String deptInput = scanner.next();

         // Call methods and handle output
         String[] departments = findDept(employeeList.toArray(new Employee[0]), salaryInput);
         if (departments != null) {
             // Print departments without trailing comma
             for (int i = 0; i < departments.length; i++) {
                 System.out.print(departments[i]);
                 if (i < departments.length - 1) {
                     System.out.print(", ");
                 }
             }
             System.out.println(); // Move to the next line after printing departments
         } else {
             System.out.println("No Department found");
         }

         int secondHighestSalary = findSecondHighestSalary(employeeList.toArray(new Employee[0]), deptInput);
         if (secondHighestSalary != 0) {
             System.out.println(secondHighestSalary);
         } else {
             System.out.println("No data found");
         }

         scanner.close();
    }

    public static String[] findDept(Employee[] employees, int salary) {
        // Implementation logic goes here
    	List<String>ls=new ArrayList<>();
    	boolean flag=false;
    	for(Employee employee:employees)
    	{
    		if(employee.getSalary()==salary && employee.getRating()>=3)
    		{
    			if(!ls.contains(employee.getDept()))
    			{
    			ls.add(employee.getDept());
    			}
    			
    		}
    	}
    	return ls.toArray(new String[0]);
    	
    }

    public static int findSecondHighestSalary(Employee[] employees, String dept) {
        // Implementation logic goes here
    	TreeSet<Employee>ts=new TreeSet<>((f1,f2)->Integer.compare(f2.getSalary(), f1.getSalary()));
    	for(Employee employee:employees)
    	{
    		if(employee.getDept().equalsIgnoreCase(dept))
    		{
    			ts.add(employee);
    		}
    	}
    	
    	ts.pollFirst();
    	
       Employee res=ts.pollFirst();
       return res.getSalary();
       
        
        
        
    }
}

