class Car {
private String model;
private int speed;
public void setModel(String model) {
this.model = model;
}
public void setSpeed(int speed) {
if (speed >= 0) {
this.speed = speed;
} else {
System.out.println("Invalid speed value");
}
}
public String getModel() {
return model;
}
public int getSpeed() {
return speed;
}
public static void main(String[] args) {
Car c = new Car();
c.setModel("Tesla");
c.setSpeed(120);
System.out.println("Car Model: " + c.getModel());
System.out.println("Car Speed: " + c.getSpeed() + " km/h");
}
}