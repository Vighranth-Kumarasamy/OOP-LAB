class Employee {
private String name;
private double salary;
public void setName(String name) {
this.name = name;
}
public void setSalary(double salary) {
if (salary > 0) {
this.salary = salary;
} else {
System.out.println("Invalid salary amount");
}
}
public String getName() {
return name;
}
public double getSalary() {
return salary;
}
public static void main(String[] args) {
Employee e = new Employee();
e.setName("Alice");
e.setSalary(50000);
System.out.println("Employee Name: " + e.getName());
System.out.println("Employee Salary: $" + e.getSalary());
}
}