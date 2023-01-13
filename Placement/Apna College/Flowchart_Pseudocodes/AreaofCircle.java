import java.util.Scanner;

public class AreaofCircle {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = scr.nextDouble();
        double area = 3.14*radius*radius;
        System.out.println("The area of circle is " + area);

    }
}
