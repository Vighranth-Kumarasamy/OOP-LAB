interface Printable {
void print();
}
interface Showable {
void show();
}
class Document implements Printable, Showable {
public void print() {
System.out.println("Printing document...");
}
public void show() {
System.out.println("Displaying document...");
}
}
public class Main {
public static void main(String[] args) {
Document doc = new Document();
doc.print();
doc.show();
}
}