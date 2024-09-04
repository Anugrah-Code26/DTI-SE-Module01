import exercise.Circle;
import exercise.DateDifference;
import exercise.InitialName;
import exercise.Rectangle;
import exercise.TriangleAngles;

public class MainExercise {
    public static void main(String[] args) {
    // 01. Write a code to find area of rectangle!
        System.out.println("\n" + "01. Write a code to find area of rectangle!");
        
        // Rectangle Dimension
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Length: " + rectangle.getLength());
        System.out.println("Rectangle Width: " + rectangle.getWidth());
        
        // Rectangle Calculation
        System.out.println("Rectangle Circumference: " + rectangle.calculateCircumference());
        System.out.println("Rectangle Area: " + rectangle.calculateCircumference());

    // 02. Write a code to find diameter, circumference & area of a circle!
        System.out.println("\n" + "02. Write a code to find diameter, circumference & area of a circle!");

        // Circle Radius
        Circle circle = new Circle(5);
        System.out.println("Circle Radius: " + circle.getRadius());

        // Circle Calculation
        System.out.println("Circle Diameter: " + circle.calculateDiameter());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());
        System.out.println("Circle Area: " + circle.calculateArea());

    // 03. Write a code to find angles of triangle if two angles are given!
        System.out.println("\n" + "03. Write a code to find angles of triangle if two angles are given!");

        // Triangle Known Angles
        TriangleAngles triangleAngles = new TriangleAngles(80, 65);
        System.out.println("Triangle known angles: " + triangleAngles.getAngle1() + " & " + triangleAngles.getAngle2());

        // Calculate Other Triangle Angles
        System.out.println("Other Triangle Angle: " + triangleAngles.calculateAngle());

    // 04. Write a code to get difference between dates in days!
        System.out.println("\n" + "04. Write a code to get difference between dates in days!");

        // Input The Dates
        DateDifference dateDifference = new DateDifference(2024, 9, 1, 2024, 9, 10);
        System.out.println("Start Date: " + dateDifference.getStartDate());
        System.out.println("End Date: " + dateDifference.getEndDate());

        // Calculate The Difference Days
        System.out.println("Difference between the dates: " + dateDifference.calculateDateDifference() + " days");

    // 05. Write a code to print your name initial in uppercase!
        System.out.println("\n" + "05. Write a code to print your name initial in uppercase!");

        // Input Fullname
        InitialName initialName = new InitialName("John Doe");
        System.out.println("Fullname: " + initialName.getFullname());

        // Generate Initials
        System.out.println("Initial: " + initialName.getInitials());
    }
}
