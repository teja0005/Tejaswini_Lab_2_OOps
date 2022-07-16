public class Circle implements IShape{
    double radius;
    final double pie=3.14;
    String color;
    public Circle(String color, double r){
        this.color=color;
        this.radius=r;
    }
    @Override
    public double calculateArea() {
        return this.radius*this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*pie*this.radius;
    }
}
