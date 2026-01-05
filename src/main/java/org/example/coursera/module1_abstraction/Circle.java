package org.example.coursera.module1_abstraction;

public class Circle extends  Shape{
    private final float radius;
    Circle(float r) {
        this.radius = r;
    }
    @Override
    public float calculatedArea() {
        return (float)Math.PI * this.radius * this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius=" + this.radius);

    }

    @Override
    public float calculatedPerimeter() {
        return 2 * (float) Math.PI * this.radius;
    }
}
