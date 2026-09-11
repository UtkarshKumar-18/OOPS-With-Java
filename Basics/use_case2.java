public class use_case2 {
    public static void main(String[] args) {
        shape[] shapes = new shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new rectangle(4.0, 6.0);
 
        for (shape s : shapes) {
            s.displayArea();   // must print correct area for each shape
        }
    }
}
//Write the Shape, Circle and Rectangle classes here:
abstract class shape{
    abstract double area();

    
    void displayArea(){
        System.out.println("Area:"+area());
    }

}

class Circle extends shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double area(){
        return Math.PI*radius*radius;
    }

}
class rectangle extends shape{
    double length;
    double breadth;
    rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double area(){
        return length*breadth;
    }

}
 
 
 
 
 
 
 
 
