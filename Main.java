public class Main {
    public static void main(String[] args) {
        Rectangle r=new Rectangle("Blue",12,13);
        System.out.println(r.calculateArea());
        System.out.println(r.calculatePerimeter());
        r.rend.draw(); //Compile time polymorphism
        r.rend.draw("This is a Rectangle");//Compile time polymorphism

        //Here only one renderer object is created in Interface-IShape, but not 4. This one renderer
        //object is used by all the classes. Its like 1 object is created by IShape and its been
        //implemented by all other classes. That's the reason the methods in renderer class
        //are compile-time polymorphism

        Square s=new Square("Green",10);
        System.out.println(s.calculateArea()); //Run time polymorphism
        System.out.println(s.calculatePerimeter());
        s.rend.draw(); //Compile time polymorphism
        s.rend.draw("This is a Square");//Compile time polymorphism

        Circle c=new Circle("Pink",10);
        System.out.println(c.calculateArea());
        System.out.println(c.calculatePerimeter());
        c.rend.draw();//Compile time polymorphism
        c.rend.draw("This is a Circle");//Compile time polymorphism

        Traingle t=new Traingle("White",10,20);
        System.out.println(t.calculateArea());
        System.out.println(t.calculatePerimeter());
        t.rend.draw();//Compile time polymorphism
        t.rend.draw("This is a Triangle");//Compile time polymorphism

    }
}