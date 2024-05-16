package CIRCLE;
public class CircleRunner {
    public static void main(String[] args){

        Circle peggy = new Circle(3.0);

        double circumference = 0.0;
        circumference = peggy.getC();
        System.out.println(circumference);

        double area = 0.0;
        area = peggy.getArea();
        System.out.println(area);
        
        peggy.changeR(1.0);
        area = peggy.getArea();
        
    }
}
