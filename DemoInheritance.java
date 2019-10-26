// Practice Exam question solution by Mike OMalley.
// P.S. It is HORRIBLE code below.  Recommend code tidy up urgently !
import java.text.DecimalFormat;

class Employee
{
protected String empName;
protected String empSSN;

public Employee(String empName, String empSSN)
{
this.empName = empName;
this.empSSN = empSSN;
}
// update the employee name
public void setName(String empName)
{ this.empName = empName; }

// returns a formatted string to display employee information
public String toString()
{ return "Name:   " + empName + '\n' + "SS#: " + empSSN; }

} //end of class Employee


class SalaryEmployee extends Employee
{
// new attributes that extends attributes in Employee
private double salary;

public SalaryEmployee(String empName, String empSSN, double salary)
{
super (empName, empSSN);
this.salary = salary;

}

// accessor method to return the salary public
double getSalary()
{ return salary; }

// mutator method to update the salary
public void setSalary(double sal)
{ salary = sal; }

// return a formated string with salaried employee information
// including name, ssn, status (salaried) and monthly pay
public String toString()
{
DecimalFormat fmt = new DecimalFormat("#.00");
return super.toString() + '\n' +
"Status: Salary" + '\n' +
"Salary: $" + fmt.format(salary) + "\n";
}

}//End of class SalaryEmployee

class HourlyEmployee extends Employee
{
    // special attributes for hourly pay
private double hourlyPay;
private double hoursWorked;

public HourlyEmployee(String empName, String empSSN,
double hourlyPay, double hoursWorked)
{
// missing lines of codes
super(empName, empSSN);
this.hourlyPay = hourlyPay;
this.hoursWorked = hoursWorked;



}

// access and update the hourly pay and hours worked
public void setHourlyPay(double hourlyPay)
{ this.hourlyPay = hourlyPay; }

public void setHoursWorked(double hoursWorked)
{ this.hoursWorked = hoursWorked; }

// access and update the hourly pay and hours worked
public double getHourlyPay()
{ return hourlyPay; }

public double getHoursWorked()
{ return hoursWorked; }

// call toString() from superclass and add info type of
// employee (hourly), hourly pay rate and hours worked
public String toString()
{
DecimalFormat fmt = new DecimalFormat("#.00");
return super.toString() + '\n' +
"Status: Hourly" + '\n' +
"Rate:$" + fmt.format(hourlyPay) + "\n" +
"Hours:  " + fmt.format(hoursWorked) + "\n";
}
}// End of  HourlyEmployee

public class DemoInheritance
{
public static void main(String[] args)
{
HourlyEmployee hEmp = new HourlyEmployee("Steve Howard", "896-54-3217",10.50,40);
SalaryEmployee sEmp = new SalaryEmployee("Moira Dunn", "456-14-3787",800.0);
System.out.println(hEmp); System.out.println(sEmp);
}
}
