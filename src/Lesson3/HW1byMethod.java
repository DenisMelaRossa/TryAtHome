package Lesson3;

import java.util.Scanner;

public class HW1byMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter triangle side 1: ");
        int a = scan.nextInt();
        System.out.print("Enter triangle side 2: ");
        int b = scan.nextInt();
        System.out.print("Enter triangle side 3: ");
        int c = scan.nextInt();
        System.out.println("Area of the triangle is: " + triangleArea(a, b, c));

        System.out.print("Enter the cube side: ");
        int cubeSide = scan.nextInt();
        System.out.println("Cube volume is " + cubeVolume(cubeSide));

        System.out.print("Enter sphere radius: ");
        int sphereRadius = scan.nextInt();
        System.out.println(("Surface area of the sphere is " + sphereSurfaceArea(sphereRadius)));

        System.out.print("Enter trapezium side 1: ");
        int trapeziumSide1 = scan.nextInt();
        System.out.print("Enter trapezium side 2: ");
        int trapeziumSide2 = scan.nextInt();
        System.out.print("Enter trapezium side 3: ");
        int trapeziumSide3 = scan.nextInt();
        System.out.print("Enter trapezium side 4: ");
        int trapeziumSide4 = scan.nextInt();
        System.out.println("Trapezium perimeter is " +
                trapeziumPerimeter(trapeziumSide1, trapeziumSide2, trapeziumSide3, trapeziumSide4));
    }

    public static double triangleArea(int a, int b, int c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double cubeVolume(int a) {
        return Math.pow(a, 3);
    }

    public static double sphereSurfaceArea(int a) {
        return 4 * Math.PI * Math.pow(a, 2);
    }

    public static double trapeziumPerimeter(int a, int b, int c, int d) {
        return a + b + c + d;
    }

}
