
public class ShapeRunner {

  public static void main(String [] args) {
    Square mySquare = new Square(3f);
    System.out.println(mySquare.calculateArea());

    Triangle myTriangle = new Triangle(3f, 5f);
    System.out.println(myTriangle.calculateArea());

    Circle myCircle = new Circle(2f);
    System.out.println(myCircle.calculateArea());

    Rectangle myRectangle = new Rectangle(10f, 3f);
    System.out.println(myRectangle.calculateArea());
  }
}
