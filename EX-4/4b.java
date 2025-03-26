Sclass Vehicle {
public void start() {
System.out.println("The vehicle is starting.");
}
}
class Car extends Vehicle {
public void honk() {
System.out.println("The car is honking.");
}
}
public class Main {
public static void main(String[] args) {
Car car = new Car();
car.start();
car.honk();
}
}