public class Rectangle implements IShape{
    double length,breadth=0;
    String color;
    public Rectangle(String color,double l,double b){
        this.color=color;
        this.length=l;
        this.breadth=b;
    }

    @Override
    public double calculateArea() {
        return this.length*this.breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(this.length+this.breadth);
    }
}
