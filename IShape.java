public interface IShape {

    //Here only one renderer object is created, but not 4 renderer objects
    Renderer rend=new Renderer();
    public double calculateArea();
    public double calculatePerimeter();

}
