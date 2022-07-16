public class Square extends Rectangle{
    public Square(String color,double side){
        super(color,side,0);
    }

    //Runtime polymorphism - Rectangle calculateArea is overridden in square when it is called
    // from square perspective
    public double calculateArea(){
        System.out.println("This is calculated in Square");
        return this.length*this.breadth;
    }

}
