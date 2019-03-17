package com.netcracker.MyTests;

import com.netcracker.MyTasks.Rectangle;

public class TestForRectangle {

    public static void main(String[] args) {
        //Task 2 (Rectangle class)
        beginTitle(2);
            Rectangle rec1 = new Rectangle();
            Rectangle rec2 = new Rectangle(6);
            Rectangle rec3 = new Rectangle(5, 10);
            System.out.println(rec1 + " Area=" + rec1.getArea() + ", Perimeter=" + rec1.getPerimeter());
            System.out.println(rec2 + " Area=" + rec2.getArea() + ", Perimeter=" + rec2.getPerimeter());
            System.out.println(rec3 + " Area=" + rec3.getArea() + ", Perimeter=" + rec3.getPerimeter());
            System.out.println("Length_of_rec3=" + rec3.getLength() + ", Width_of_rec3=" + rec3.getWidth());
            rec3.setLength(88);
            rec3.setWidth(99);
            System.out.println("After changes:");
            System.out.println("Length_of_rec3=" + rec3.getLength() + ", Width_of_rec3=" + rec3.getWidth());

            System.out.println("\n Equals and HashCode:");
            Rectangle rec4 = new Rectangle(88, 99);
            System.out.println("rec2: " + rec2 + ", hashcode=" + rec2.hashCode());
            System.out.println("rec3: " + rec3 + ", hashcode=" + rec3.hashCode());
            System.out.println("rec4: " + rec4 + ", hashcode=" + rec4.hashCode());
            System.out.println("rec4 equals rec3?: " + rec4.equals(rec3));
            System.out.println("rec4 == rec3?: " + (rec4 == rec3));
            System.out.println("rec3 equals rec3?: " + rec3.equals(rec3));
            System.out.println("rec3 == rec3?: " + (rec3 == rec3));
            System.out.println("rec3 equals rec2?: " + rec3.equals(rec2));
            System.out.println("rec3 == rec2?: " + (rec3 == rec2));
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