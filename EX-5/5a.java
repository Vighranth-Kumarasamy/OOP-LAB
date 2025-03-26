class Animal {
public void eat() {
System.out.println("Animal is eating.");
}
}
class Mammal extends Animal {
public void sleep() {
System.out.println("Mammal is sleeping.");
}
}
class Dog extends Mammal {
public void bark() {
System.out.println("Dog is barking.");
}
}
public class Main {
public static void main(String[] args) {
Dog myDog = new Dog();
myDog.eat();
myDog.sleep();
myDog.bark();
}
}