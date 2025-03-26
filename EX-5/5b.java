class Vehicle {
public void start() {
System.out.println("The vehicle is starting.");
}
}
class Car extends Vehicle {
public void drive() {
System.out.println("The car is driving.");
}
}
class ElectricCar extends Car {
public void charge() {
System.out.println("The electric car is charging.");
}
}
public class Main {
public static void main(String[] args) {
ElectricCar myElectricCar = new ElectricCar();
myElectricCar.start();
myElectricCar.drive();
myElectricCar.charge();
}
}