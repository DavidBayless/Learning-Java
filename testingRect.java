
class TestingRect {
  public static void main(String [] args) {
    Rect newRectOne = new Rect();
    Rect newRectTwo = new Rect();
    newRectOne.setHeight(40);
    newRectOne.setWidth(4);
    newRectOne.setColor("Red");
    newRectTwo.setHeight(35.9);
    newRectTwo.setWidth(3.5);
    newRectTwo.setColor("White");

    System.out.println(newRectOne.getArea());
    System.out.println(newRectTwo.getArea());
    System.out.println(newRectOne.getPerimeter());
    System.out.println(newRectTwo.getPerimeter());
  }
}
