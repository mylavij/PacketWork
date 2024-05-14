package BOX;
public class BoxRunner {
    public static void main(String[] args){
        Box bob = new Box(2.0, 6.0);
        double area = bob.getArea();
        System.out.println("The area is " + area);
        bob.bigger(2.0);
        double perimeter = bob.getPerimeter();
        System.out.println("The perimeter is " + perimeter);
    }
}
