class Vehicle {
String type;
int wheels;
Vehicle() {
this.type = "Unknown";
this.wheels = 0;
}
Vehicle(String type) {
this.type = type;
this.wheels = 4;
}
Vehicle(String type, int wheels) {
this.type = type;
this.wheels = wheels;
}
void display() {
System.out.println("Vehicle Type: " + type + ", Wheels: " + wheels);
}
public static void main(String[] args) {
Vehicle v1 = new Vehicle();
Vehicle v2 = new Vehicle("Car");
Vehicle v3 = new Vehicle("Bike", 2);
v1.display();
v2.display();
v3.display();
}
}