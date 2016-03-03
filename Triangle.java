public class Triangle extends Shape {

  float base;
  float height;

  public Triangle(float base, float height) {
    this.base = base;
    this.height = height;
  }

  public float calculateArea() {
    return this.base * this.height / 2;
  }
}
