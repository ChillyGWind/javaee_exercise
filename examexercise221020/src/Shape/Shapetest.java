package Shape;
/**
 * author: 2054090 陈宇田
 * time: 2022/10/20
 */

import java.util.Arrays;
import java.util.Objects;

public class Shapetest {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[]{
                new Ellipse(10, 20),
                new Circle(10),
                new Triangle(4, 1.5),
                new Rectangle(5, 5),
                new Square(10),
                new Square(20),
                new Triangle(2, 3)
        };

        for (Shape shape : shapeArray) {
            System.out.println(shape);
        }

        System.out.println();

        Arrays.stream(shapeArray).sorted().map(Objects::toString).forEach(System.out::println);
    }
    }
