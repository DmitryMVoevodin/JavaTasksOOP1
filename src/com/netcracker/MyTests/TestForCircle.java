package com.netcracker.MyTests;

import com.netcracker.MyTasks.Circle;

public class TestForCircle {

    public static void main(String[] args) {
        //Task 1 (Circle class)
        beginTitle(1);
            Circle cir1 = new Circle();
            Circle cir2 = new Circle(10.0);
            Circle cir3 = new Circle("green");
            Circle cir4 = new Circle(5.0, "blue");
            System.out.println(cir1 + " Area=" + cir1.getArea() + ", Circumference=" + cir1.getCircumference());
            System.out.println(cir2 + " Area=" + cir2.getArea() + ", Circumference=" + cir2.getCircumference());
            System.out.println(cir3 + " Area=" + cir3.getArea() + ", Circumference=" + cir3.getCircumference());
            System.out.println(cir4 + " Area=" + cir4.getArea() + ", Circumference=" + cir4.getCircumference());
            System.out.println("Radius_of_cir2=" + cir2.getRadius() + ", Color_of_cir2=" + cir2.getColor());
            cir2.setColor("brown");
            cir2.setRadius(7);
            System.out.println("After changes:");
            System.out.println("Radius_of_cir2=" + cir2.getRadius() + ", Color_of_cir2=" + cir2.getColor());

            System.out.println("\n Equals and HashCode:");
            Circle cir5 = new Circle(5.0, "blue");
            System.out.println("cir4: " + cir2 + ", hashcode=" + cir2.hashCode());
            System.out.println("cir4: " + cir4 + ", hashcode=" + cir4.hashCode());
            System.out.println("cir5: " + cir5 + ", hashcode=" + cir5.hashCode());
            System.out.println("cir4 equals cir5?: " + cir4.equals(cir5));
            System.out.println("cir4 == cir5?: " + (cir4 == cir5));
            System.out.println("cir4 equals cir4?: " + cir4.equals(cir4));
            System.out.println("cir4 == cir4?: " + (cir4 == cir4));
            System.out.println("cir4 equals cir2?: " + cir4.equals(cir2));
            System.out.println("cir4 == cir2?: " + (cir4 == cir2));
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