abstract class Employee {
String name;
int id;
Employee(String name, int id) {
this.name = name;
this.id = id;
}
abstract double calculateSalary();
void display() {
System.out.println("Employee Name: " + name + ", ID: " + id);
}
}
class FullTimeEmployee extends Employee {
double salary;
FullTimeEmployee(String name, int id, double salary) {
super(name, id);
this.salary = salary;
}
double calculateSalary() {
return salary;
}
}
class PartTimeEmployee extends Employee {
double hourlyRate;
int hoursWorked;
PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
super(name, id);
this.hourlyRate = hourlyRate;
this.hoursWorked = hoursWorked;
}
double calculateSalary() {
return hourlyRate * hoursWorked;
}
}
public class Main {
public static void main(String[] args) {
Employee e1 = new FullTimeEmployee("Alice", 101, 50000);
Employee e2 = new PartTimeEmployee("Bob", 102, 20, 100);
e1.display();
System.out.println("Salary: $" + e1.calculateSalary());
e2.display();
System.out.println("Salary: $" + e2.calculateSalary());
}
}