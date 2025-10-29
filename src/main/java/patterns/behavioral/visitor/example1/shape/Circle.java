package patterns.behavioral.visitor.example1.shape;

import patterns.behavioral.visitor.example1.visitor.Visitor;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
