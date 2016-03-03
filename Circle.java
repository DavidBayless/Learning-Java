public class Circle extends Shape {

   float radius;

   public Circle(float radius) {
     this.radius = radius;
   }
   public float calculateArea() {
     return 3.14159265f * this.radius * this.radius;
   }
}
