package com.netcracker.MyTasks;

public class MyPoint {

    //Private Fields_______________________________________________________

    private int x = 0;
    private int y = 0;

    //Public Methods_______________________________________________________

    public MyPoint() {
        x = y = 0;
    }

    public MyPoint(int x) {
        this.x = y = x;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getXY() {
        int[] xy = new int[2];
        xy[0] = x; xy[1] =y;
        return xy;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2.0) + Math.pow(this.y - y, 2.0));
    }

    public  double distance(MyPoint another) {
        if (another == null) {
            return distance();
        } else {
            return distance(another.x, another.y);
        }
    }

    public double distance() {
        return distance(0,0);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(!(obj instanceof MyPoint)) return false;
        MyPoint another = (MyPoint) obj;
        return ((this.x == another.x) && (this.y == another.y));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }

}