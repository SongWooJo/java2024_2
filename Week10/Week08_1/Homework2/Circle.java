package Homework2;

import java.util.Scanner;

public class Circle implements MathConstants {
    public double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 반지름을 입력하세요: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle();

        double area = circle.calculateArea(radius);

        System.out.println("원의 넓이는: " + area);
    }
}