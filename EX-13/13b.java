.abstract class Bank {
abstract double getInterestRate();
void display() {
System.out.println("Banking system running...");
}
}
class SBI extends Bank {
double getInterestRate() {
return 5.5;
}
}
class HDFC extends Bank {
double getInterestRate() {
return 6.8;
}
}
public class Main {
public static void main(String[] args) {
Bank b1 = new SBI();
Bank b2 = new HDFC();
System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
b1.display();
}
}