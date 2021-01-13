package Lesson_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        float a = scanner.nextFloat();
        System.out.println("Input a number: ");
        float b = scanner.nextFloat();
        System.out.println("Input a number: ");
        float c = scanner.nextFloat();
        System.out.println("Input a number: ");
        float d = scanner.nextFloat();
        float result;
        result = ( a * ( b + ( c / d ) ) );
        System.out.println(result);
        scanner.close();
    }
}

