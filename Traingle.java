public class Traingle implements IShape{
    double length,height=0;
    String color;
    public Traingle(String color, double l, double h){
        this.color=color;
        this.length=l;
        this.height=h;
    }
    @Override
    public double calculateArea() {
        return 0.5*this.length*this.height;
    }

    @Override
    public double calculatePerimeter() {

        return this.length+Math.sqrt((4*this.height*this.height)+(this.length*this.length));
    }
}
