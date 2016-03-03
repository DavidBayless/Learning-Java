public class Rectangle extends Shape {
  float x;
  float y;

  public Rectangle(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public float calculateArea() {
    return this.x * this.y;
  }
}
