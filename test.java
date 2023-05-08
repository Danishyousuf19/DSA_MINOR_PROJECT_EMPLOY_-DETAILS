import java.util.Scanner;

class employee{
	int empid;
	String name;
	String contactno;
	String jobposition;
	double salary;
	employee(String n,int id,String p,String ci,double s){
		name=n;
		contactno =ci;
		jobposition=p;
		salary=s;
		empid=id;
		
	}
	void details()
	{
		System.out.println("\tDetails of Employ\n");
		System.out.println("Name = "+this.name);
		System.out.println("Employ id  = "+this.empid);
		System.out.println("Job Position = "+this.jobposition);
		System.out.println("Salary = "+this.salary);
		System.out.println("Contact Number = "+this.contactno);
	}
	
}

public class test  {
	public static void arrangeEmployeeBySalary(employee e[]) {
		for(int i=0;i<e.length-1;i++) {
			for(int j=0;j<e.length-i-1;j++) {
				if(e[j].salary>=e[j+1].salary) {
					//swap
					employee temp=e[j];
					e[j]=e[j+1];
					e[j+1]=temp;
				}
			}
			
			
		}
		for(int i=e.length-1;i>=0;i--) {
			e[i].details();
		}
	}

	public static void getEmployeesByJobPosition(employee e[]) {
		
		for(int i=0;i<e.length;i++) {
			
			if(e[i].jobposition.equals("manager")){
				
				e[i].details();
				
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		employee e[]=new employee[2];
		for(int i=0;i<2;i++) {
			System.out.println("enter your employee id");
			int empid =sc.nextInt();
			System.out.println("enter your name");
			String name =sc.next();
			System.out.println("enter your job position");
			String jobposition =sc.next();
			System.out.println("enter your contact number");
			String contactno=sc.next();
			System.out.println("enter your salary");
			double salary=sc.nextDouble();
			
			e[i] = new employee(name, empid, jobposition, contactno, salary);

			
			
		}
		arrangeEmployeeBySalary(e);

		
		getEmployeesByJobPosition(e);
	}
}
/*
Description: Create a class Employee with the following members:
Fields Type
name String
empId int
salary double
hireDate Date
jobPosition String
contactNumber String
address Address
Observe here that Date and Address are also the classes. Add appropriate fields and methods to
Date and Address classes. Add appropriate constructors to set the fields of Employee. More over
you can add appropriate setter/getter methods if required. [2 points]
Write a Java program to do the following operations. (Create a Test class with a main() method)
• Create an employee database of a company having 500 employees: You can create an array
of objects. [2 points]
• Arrange the employee details in descending order by salary: Create a method in Test class
with the following signature: [2 points]
public static void arrangeEmployeeBySalary(Employee e[])
• Displaythe details of employees whose jobPosition is manager: Create a method in Test
class with the following signature: [2 points]
public static void getEmployeesByJobPosition(Employee e[], String jp)
• Display the details of employees whose hireDate is between 01-04-2022 to 31-03-2023:
Create a method in Test class with the following signature: [3 points]
public static void getEmployeesByHireDate(Employee e[], Date d1, Date d2)
• Find the number of foreign employees: You can find it from the country code of the
contactNumber field. Create a method in Test class with the following signature: [2 points]
public static int foreignEmployeeCount(Employee e[])
• Display the details of employees whose salary is in a range 150000 INR to 300000 INR:
Create a method in Test class with the following signature: [2 points]
public static void getEmployeesBySalary(Employee e[], double s1, double s2)*/