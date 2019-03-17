package com.netcracker.MyTests;

import com.netcracker.MyTasks.MyPoint;
import com.netcracker.MyTasks.MyTriangle;

public class TestForMyTriangle {

    public static void main(String[] args) {
        //Task 6 (MyTriangle class)
        beginTitle(6);
            MyPoint v1 = new MyPoint(0,0);
            MyPoint v2 = new MyPoint(3,0);
            MyPoint v3 = new MyPoint(0,4);
            MyTriangle tr1 = new MyTriangle(v1, v2, v3);
            MyTriangle tr2 = new MyTriangle(0,0,5,2,10,0);
            MyTriangle tr3 = new MyTriangle(0,0,2,10,4,1);
            MyTriangle tr4 = new MyTriangle(-3,0,3,0,0,-100);
            System.out.println(tr1 + ", Perimeter=" + tr1.getPerimeter() + ", Type=" + tr1.getType() + ", TypeAngle=" + tr1.getTypeAngle());
            System.out.println(tr2 + ", Perimeter=" + tr2.getPerimeter() + ", Type=" + tr2.getType() + ", TypeAngle=" + tr2.getTypeAngle());
            System.out.println(tr3 + ", Perimeter=" + tr3.getPerimeter() + ", Type=" + tr3.getType() + ", TypeAngle=" + tr3.getTypeAngle());
            System.out.println(tr4 + ", Perimeter=" + tr4.getPerimeter() + ", Type=" + tr4.getType() + ", TypeAngle=" + tr4.getTypeAngle());

            System.out.println("\n Equals and HashCode:");
            MyTriangle tr5 = new MyTriangle(-2,1,4,4,9,2);
            MyTriangle tr6 = new MyTriangle(4,4,9,2,-2,1);
            MyTriangle tr7 = new MyTriangle(4,4,9,1,-2,1);
            System.out.println("tr5: " + tr5 + ", hashcode=" + tr5.hashCode());
            System.out.println("tr6: " + tr6 + ", hashcode=" + tr6.hashCode());
            System.out.println("tr7: " + tr7 + ", hashcode=" + tr7.hashCode());
            System.out.println("tr5 equals tr6?: " + tr5.equals(tr6));
            System.out.println("tr5 == tr6?: " + (tr5 == tr6));
            System.out.println("tr5 equals tr5?: " + tr5.equals(tr5));
            System.out.println("tr5 == tr5?: " + (tr5 == tr5));
            System.out.println("tr5 equals tr7?: " + tr5.equals(tr7));
            System.out.println("tr5 == tr7?: " + (tr5 == tr7));
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