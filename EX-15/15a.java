package mypackage;
public class Message {
public void showMessage() {
System.out.println("Hello from mypackage!");
}
}
import mypackage.Message;
public class Main {
public static void main(String[] args) {
Message msg = new Message();
msg.showMessage();
}
}