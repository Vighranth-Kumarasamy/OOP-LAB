interface Vehicle {
void speedUp();
default void applyBrakes() {
System.out.println("Brakes applied.");
}
static void showMessage() {
System.out.println("Vehicle interface in action.");
}
}
class Car implements Vehicle {
public void speedUp() {
System.out.println("Car speeds up.");
}
}
public class Main {
public static void main(String[] args) {
Car c = new Car();
c.speedUp();
c.applyBrakes();
Vehicle.showMessage();
}
}