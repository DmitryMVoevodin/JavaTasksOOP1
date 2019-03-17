package com.netcracker.MyTests;

import com.netcracker.MyTasks.MyPoint;

public class TestForMyPoint {

    public static void main(String[] args) {
        //Task 5 (MyPoint class)
        beginTitle(5);
            MyPoint p1 = new MyPoint();
            MyPoint p2 = new MyPoint(5);
            MyPoint p3 = new MyPoint(7,6);
            System.out.println(p1 + ", DistanceWith_0_0=" + p1.distance());
            System.out.println(p2 + ", DistanceWith_0_0=" + p2.distance());
            System.out.println(p3 + ", DistanceWith_0_0=" + p3.distance());
            System.out.println("Point p3: x=" + p3.getX() + ", y=" + p3.getY() + ", i.e. (" + p3.getXY()[0] + ", " + p3.getXY()[1] + ")");
            p3.setX(1012);
            p3.setY(333);
            System.out.println("After changes:");
            System.out.println(p3);
            p3.setXY(9, -1);
            System.out.println("After changes:");
            System.out.println(p3);
            System.out.println(p2 + " & " + p3 + ", Distance=" + p2.distance(p3) + " or " + p3.distance(p2.getX(), p2.getY()));
            MyPoint p4 = null;
            System.out.println(p3.distance(p4));

            System.out.println("\n Equals and HashCode:");
            MyPoint p5 = new MyPoint(3,2);
            MyPoint p6 = new MyPoint(3,2);
            MyPoint p7 = new MyPoint(3,1);
            System.out.println("p5: " + p5 + ", hashcode=" + p5.hashCode());
            System.out.println("p6: " + p6 + ", hashcode=" + p6.hashCode());
            System.out.println("p7: " + p7 + ", hashcode=" + p7.hashCode());
            System.out.println("p5 equals p6?: " + p5.equals(p6));
            System.out.println("p5 == p6?: " + (p5 == p6));
            System.out.println("p5 equals p5?: " + p5.equals(p5));
            System.out.println("p5 == p5?: " + (p5 == p5));
            System.out.println("p5 equals p7?: " + p5.equals(p7));
            System.out.println("p5 == p7?: " + (p5 == p7));
        endTitle();
    }

    //For some sort of design
    private static void beginTitle(int num) {
        System.out.println("******************* Task " + num + " *******************");
    }
    private static void endTitle() {
        System.out.println("**********************************************" + "\n");
    }

}