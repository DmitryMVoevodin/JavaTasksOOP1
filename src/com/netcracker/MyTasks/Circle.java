package com.netcracker.MyTasks;

public class Circle {

    //Private Fields_______________________________________________________

    private double radius = 1.0;
    private String color = "red";


    //Public Methods_______________________________________________________

    public Circle() {
        //Empty body
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color) {
        this.color = color;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return ("Circle[radius=" + radius + ", color=" + color + "]");
    }

    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    public double getCircumference() {
        return (2.0 * Math.PI * radius);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Circle)) return false;
        Circle another = (Circle) obj;
        return ((Extra.isEqual(this.radius, another.radius)) &&
                (this.color.equals(another.color)));
    }

    @Override
    public int hashCode() {
        int result = 17;
        long r = Double.doubleToLongBits(radius);
        result = 31 * result + ((int)(r ^ (r >>> 32)));
        result = 31 * result + color.hashCode();
        return result;
    }

}