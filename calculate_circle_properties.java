import java.util.Scanner;
public class calculate_circle_properties {

    public static void main(String[] args) {
    
    // Create a Scanner

    Scanner input = new Scanner(System.in);
    
    // Get user input for center coordinates

    System.out.println("Enter center point: ");
    int x1 = input.nextInt();
    int y1 = input.nextInt();

    // Get user input for a point on the circle's edge

    System.out.println("Enter point on the circle's edge: ");
    int x2 = input.nextInt();
    int y2 = input.nextInt();

    double circumference , area , radius;
    
    // Calculate radius by using distance formula

    radius = Math.sqrt((Math.pow(x1 - x2, 2)) + (Math.pow(y1 -y2, 2)));

    // Calculate area and circumference

    area = Math.PI * Math.pow(radius, 2);

    circumference = Math.PI * radius * 2;

    // Display results

    System.out.println("Area of the circle: " + area);
    System.out.println("Circumference of the circle: " + circumference);
    }
}   
