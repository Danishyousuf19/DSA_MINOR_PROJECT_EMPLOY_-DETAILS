
package Regestratio_no_2241025008;

import java.util.Scanner;
//Description: Create a class Employee with the following members:
//Fields Type
//name String
//empId int
//salary double
//hireDate Date
//jobPosition String
//contactNumber String
//address Address
// Date and Address are  the classes. Add appropriate fields and methods to
//Date and Address classes. Add appropriate constructors to set the fields of Employee. More over
//you can add appropriate setter/getter methods if required. [2 points]

class adress{
	 String street;
   String city;
    String state;
     String country;
     int pinCode;
     void setAdress() {
    	 System.out.println("\n\t**Enter your complete Adress**");
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter your Country");
    	 country=sc.next();
    	 System.out.println("Enter your State");
    	 state=sc.next();
    	 System.out.println("Enter your City");
    	 city=sc.next();
    	 System.out.println("Enter your Street");
    	 street=sc.next();
    	 System.out.println("Enter your Pincode");
    	 pinCode=sc.nextInt();
    	 
    	
     }
     void getAdress() {
    	 System.out.println("Adress : "+street+"("+pinCode+")"+city+","+state+","+country);
     }
}
class date extends adress{
	public int day;
	public int month;
	public  int year;
	void setdate() {
		System.out.println("\n\t**Enter your Date of Joining**");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter day number ");
		day=sc.nextInt();
		System.out.println("enter month number");
		month=sc.nextInt();
		System.out.println("enter year");
		year=sc.nextInt();
	}
	void getdate() {
		System.out.println("Date of Joining : "+day+"-"+month+"-"+year);
	}
			
}
//Add appropriate constructors to set the fields of Employee. More over
//you can add appropriate setter/getter methods if required.
class employee extends date{
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
		System.out.println("\t**Details of Employee**");
		System.out.println("Name : "+this.name);
		System.out.println("Employ id  : "+this.empid);
		System.out.println("Job Position : "+this.jobposition);
		System.out.println("Salary : "+this.salary);
		System.out.println("Contact Number : "+this.contactno);
		super.getdate();
		super.getAdress();
		
	}
	
}

public class test  {
//	• Arrange the employee details in descending order by salary: Create a method in Test class
//	with the following signature: [2 points]
//	public static void arrangeEmployeeBySalary(Employee e[])
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
//	• Display the details of employees whose jobPosition is manager: Create a method in Test
//	class with the following signature: [2 points]
//	public static void getEmployeesByJobPosition(Employee e[], String jp)

	public static void getEmployeesByJobPosition(employee e[],String jp) {
		System.out.println("\n\t**Details of employees who are manager by profession**");
		for(int i=0;i<e.length;i++) {
			
			if(e[i].jobposition.equals(jp)){
				
				e[i].details();
				
			}
		}
		
	}
//	• Display the details of employees whose hireDate is between 01-04-2022 to 31-03-2023:
//		Create a method in Test class with the following signature: [3 points]
//		public static void getEmployeesByHireDate(Employee e[], Date d1, Date d2)
	public static void getEmployeesByHireDate(employee e[], date d1, date d2) {
		for (int i=0;i<e.length;i++) {
			if(e[i].day>=d1.day&&e[i].day<=d2.day) {
				if(e[i].year==d1.year) {
				int m=e[i].month;
				if(m==4|m==5|m==6|m==7|m==8|m==9|m==10|m==11|m==12) {
					System.out.println("\n\t**Details of employees whose hireDate is between 01-04-2022 to 31-03-2023");
							e[i].details();
				}
			}
				else if(e[i].year==d2.year) {
					int m2=e[i].month;
					if(m2==1|m2==2|m2==3) {
						System.out.println("\n\t**Details of employees whose hireDate is between 01-04-2022 to 31-03-2023");
						e[i].details();
				}
		}
			}
			}
	}

//• Find the number of foreign employees: You can find it from the country code of the
//contactNumber field. Create a method in Test class with the following signature: [2 points]
//public static  foreignEmployeeCount(Employee e[])
	public static int foreignEmployeeCount(employee e[]) {
		int count =0;
		for(int i=0;i<e.length;i++) {
		String extract=e[i].contactno.substring(0,3);
		if(extract.equals("+91")) {
			continue;
		}count++;
				}
		
		return count;
	}
//
//• Display the details of employees whose salary is in a range 150000 INR to 300000 INR:
//Create a method in Test class with the following signature: [2 points]
//public static void getEmployeesBySalary(Employee e[], double s1, double s2)*/
	public static void getEmployeesBySalary(employee e[], double s1, double s2) {
		System.out.println("\n\t**Details of employees with "
				+ "salary in a range of 150000 INR to 300000 INR**");
		for (int i=0;i<e.length;i++) {
			double sal=e[i].salary;
			if(sal<=s2&&sal>=s1) {
				e[i].details();
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\t**Enter your Details**");
	//	• Create an employee database of a company having 500 employees: You can create an array
	//	of objects. [2 points]
		employee e[]=new employee[500];
		for(int i=0;i<e.length;i++) {
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
			e[i].setAdress();
			e[i].setdate();
		}

	     date date1=new date();
	     date1.day=1;
	     date1.month=4;
	     date1.year=2022;
	     date date2=new date();
	     date2.day=31;
	     date2.month=3;
	     date2.year=2023;
		arrangeEmployeeBySalary(e);
		int c=foreignEmployeeCount(e);
		System.out.println("\n\t**The number of foreign employees : "+c);
		getEmployeesByJobPosition(e, "manager");
		getEmployeesBySalary(e, 150000.0, 300000.0);
		getEmployeesByHireDate(e, date1, date2);
		
	}
}
//**Enter your Details**
//enter your employee id
//25008
//enter your name
//danish
//enter your job position
//manager
//enter your contact number
//+9123432
//enter your salary
//222222.3
//
//**Enter your complete Adress**
//Enter your Country
//india
//Enter your State
//kashmir
//Enter your City
//srinager
//Enter your Street
//anantnag
//Enter your Pincode
//19222222
//
//**Enter your Date of Joining**
//enter day number 
//22
//enter month number
//2
//enter year
//2023
//**Details of Employee**
//Name : danish
//Employ id  : 25008
//Job Position : manager
//Salary : 222222.3
//Contact Number : +9123432
//Date of Joining : 22-2-2023
//Adress : anantnag(19222222)srinager,kashmir,india
//
//**The number of foreign employees : 0
//
//**Details of employees who are manager by profession**
//**Details of Employee**
//Name : danish
//Employ id  : 25008
//Job Position : manager
//Salary : 222222.3
//Contact Number : +9123432
//Date of Joining : 22-2-2023
//Adress : anantnag(19222222)srinager,kashmir,india
//
//**Details of employees with salary in a range of 150000 INR to 300000 INR**
//**Details of Employee**
//Name : danish
//Employ id  : 25008
//Job Position : manager
//Salary : 222222.3
//Contact Number : +9123432
//Date of Joining : 22-2-2023
//Adress : anantnag(19222222)srinager,kashmir,india
//
//**Details of employees whose hireDate is between 01-04-2022 to 31-03-2023
//**Details of Employee**
//Name : danish
//Employ id  : 25008
//Job Position : manager
//Salary : 222222.3
//Contact Number : +9123432
//Date of Joining : 22-2-2023
//Adress : anantnag(19222222)srinager,kashmir,india







