package day1.train2;

public class Circle extends Shape{

    private double radius;

    public Circle(String name ,double radius) {
        // super 的使用问题
        this.radius = radius;
        this.setName(name);
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
