abstract class Animal {
abstract void makeSound();
void sleep() {
System.out.println("Animal is sleeping...");
}
}
class Dog extends Animal {
void makeSound() {
System.out.println("Dog barks.");
}
}
class Cat extends Animal {
void makeSound() {
System.out.println("Cat meows.");
}
}
public class Main {
public static void main(String[] args) {
Animal a1 = new Dog();
Animal a2 = new Cat();
a1.makeSound();
a2.makeSound();
a1.sleep();
}
}