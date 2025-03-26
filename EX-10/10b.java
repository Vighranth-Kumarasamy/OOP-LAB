class AreaCalculator {
double area(double radius) {
return 3.14 * radius * radius;
}
int area(int side) {
return side * side;
}
int area(int length, int width) {
return length * width;
}
public static void main(String[] args) {
AreaCalculator obj = new AreaCalculator();
System.out.println("Area of Circle: " + obj.area(5.5));
System.out.println("Area of Square: " + obj.area(4));
System.out.println("Area of Rectangle: " + obj.area(4, 6));
}
}