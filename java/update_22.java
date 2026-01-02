java
abstract class Shape {
    abstract void draw();  // Pure virtual method
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
