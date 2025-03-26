package mathoperations;
public class Calculator {
public int add(int a, int b) {
return a + b;
}
public int multiply(int a, int b) {
return a * b;
}
}
package mathoperations;
public class AdvancedCalculator {
public double power(double base, double exponent) {
return Math.pow(base, exponent);
}
}
import mathoperations.Calculator;
import mathoperations.AdvancedCalculator;
public class Main {
public static void main(String[] args) {
Calculator calc = new Calculator();
AdvancedCalculator advCalc = new AdvancedCalculator();
System.out.println("Addition: " + calc.add(5, 10));
System.out.println("Multiplication: " + calc.multiply(3, 4));
System.out.println("Power: " + advCalc.power(2, 3));
}
}