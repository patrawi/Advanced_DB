package org.example.coursera.module1_abstraction;

class Rectangle extends Shape {
    private final float width;
    private final float height;
    Rectangle(float w, float h) {
        this.width = w;
        this.height = h;

    }
    @Override
    public float calculatedArea() {
        return this.width * this.height;

    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width=" + this.width + " height=" + this.height);
    }

    @Override
    public float calculatedPerimeter() {
        return this.width * 2 + this.height * 2;
    }


}

