// package warmup;

public class Rect {
   double width;
   double height;
   String color;

  Rect() {
    this.width = 1;
    this.height = 1;
    this.color = "Blue";
  }

  public double getWidth() {
    return this.width;
  }

  public double getHeight() {
    return this.height;
  }

  public String getColor() {
    return this.color;
  }

  public void setWidth(double x) {
    this.width = x;
  }

  public void setHeight(double x) {
    this.height = x;
  }

  public void setColor(String x) {
    this.color = x;
  }

  public double getPerimeter() {
    return 2 * this.width + 2 * this.height;
  }

  public double getArea() {
    return this.width * this.height;
  }
}
