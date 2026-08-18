package day1.train2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("圆1",4));
        shapes.add(new Circle("圆2",5));
        shapes.add(new Rectangle("矩形1",4,5));
        shapes.add(new Rectangle("矩形2",2,3));
        for (Shape shape : shapes){
            System.out.printf("%s,面积:%.2f,周长:%.2f%n", shape.getName(),shape.getArea(),shape.getPerimeter());
        }
    }
}
