package com.netcracker.MyTasks;

public class Rectangle {

    //Private Fields_______________________________________________________

    private float length;
    private float width;


    //Public Methods_______________________________________________________

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float length) {
        this.length = length;
        width = length;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength(){
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return ("Rectangle[length=" + length + ", width=" + width + "]");
    }

    public double getArea() {
        return (length * width);
    }

    public double getPerimeter() {
        return (2.0 * (length + width));
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof Rectangle)) return false;
        Rectangle another = (Rectangle) obj;
        return ((Extra.isEqual(this.length, another.length)) &&
                (Extra.isEqual(this.width, another.width)));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Float.floatToIntBits(length);
        result = 31 * result + Float.floatToIntBits(width);
        return result;
    }

}