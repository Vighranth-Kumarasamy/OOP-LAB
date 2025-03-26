interface Animal {
void makeSound();
}
class Dog implements Animal {
public void makeSound() {
System.out.println("Dog barks.");
}
}
class Cat implements Animal {
public void makeSound() {
System.out.println("Cat meows.");
}
}
public class Main {
public static void main(String[] args) {
Animal a1 = new Dog();
Animal a2 = new Cat();
a1.makeSound();
a2.makeSound();
}
}