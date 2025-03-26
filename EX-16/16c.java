public class ExceptionExample3 {
public static void main(String[] args) {
try {
int num = Integer.parseInt("abc");
} catch (NumberFormatException e) {
System.out.println("Error: Cannot convert string to number.");
} catch (Exception e) {
System.out.println("General Exception Caught.");
}
}
}