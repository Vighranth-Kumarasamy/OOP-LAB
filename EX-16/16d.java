public class ExceptionExample4 {
public static void main(String[] args) {
try {
int num = 5 / 0;
} catch (ArithmeticException e) {
System.out.println("Error: Division by zero.");
} finally {
System.out.println("Finally block executed.");
}
}
}	