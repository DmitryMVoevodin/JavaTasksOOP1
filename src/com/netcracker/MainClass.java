package com.netcracker;

import com.netcracker.MyTasks.*;

import java.util.Arrays;

public class MainClass {

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

        //Task 3 (Employee class)
        beginTitle(3);
            Employee eml1 = new Employee(178, "Ivan", "Gorkin", 30000);
            System.out.println("ID=" + eml1.getID() + ", FirstName=" + eml1.getFirstName() + ", LastName=" + eml1.getLastName() + ", Salary=" + eml1.getSalary());
            System.out.println(eml1.getName() + ", AnnualSalary=" + eml1.getAnnualSalary());
            eml1.setSalary(40000);
            System.out.println("After changes:");
            System.out.println(eml1.getName() + ", Salary=" + eml1.getSalary());
            eml1.raiseSalary(10000);
            System.out.println("After changes:");
            System.out.println(eml1.getName() + ", Salary=" + eml1.getSalary());
            eml1.raiseSalary2(10);
            System.out.println("After changes:");
            System.out.println(eml1.getName() + ", Salary=" + eml1.getSalary());
            System.out.println(eml1);

            System.out.println("\n Equals and HashCode:");
            Employee eml2 = new Employee(88, "Sergey", "Golisin", 30000);
            Employee eml3 = new Employee(88, "Ilya", "Golisin", 30000);
            Employee eml4 = new Employee(88, "Ilya", "Golisin", 30000);
            System.out.println("eml2: " + eml2 + ", hashcode=" + eml2.hashCode());
            System.out.println("eml3: " + eml3 + ", hashcode=" + eml3.hashCode());
            System.out.println("eml4: " + eml4 + ", hashcode=" + eml4.hashCode());
            System.out.println("eml4 equals eml3?: " + eml4.equals(eml3));
            System.out.println("eml4 == eml3?: " + (eml4 == eml3));
            System.out.println("eml3 equals eml3?: " + eml3.equals(eml3));
            System.out.println("eml3 == eml3?: " + (eml3 == eml3));
            System.out.println("eml3 equals eml2?: " + eml3.equals(eml2));
            System.out.println("eml3 == eml2?: " + (eml3 == eml2));
        endTitle();

        //Task 4 (Book class)
        beginTitle(4);
            Author[] auth1 = new Author[2];
            auth1[0] = new Author("Ilya Ilf", "ilf@gmail.com", 'm');
            auth1[1] = new Author("Evgeniy Petrov", "petr@mail.ru", 'm');
            Book book1 = new Book("The 12 chairs", auth1, 500);
            Book book2 = new Book("The Twelve Chairs", auth1, 500, 10);
            System.out.println(book1);
            System.out.println(book2);
            Author[] auth2 = null;
            Book book3 = new Book("Masha and Medved", auth2, 200, 1);
            System.out.println(book3);
            Book book4 = new Book(book3.getName(), book2.getAuthors(), book3.getPrice(), book3.getQty());
            System.out.println(book4);
            book4.setPrice(100);
            book4.setQty(23);
            System.out.println("After changes:");
            System.out.println(book4 + "; " + book4.getAuthorNames());

            System.out.println("\n Equals and HashCode:");
            Author[] auth10 = new Author[2];
            auth10[0] = new Author("Sidorov", "sidorov@gmail.com", 'm');
            auth10[1] = new Author("Bogatova", "bogatova@mail.ru", 'f');
            Author[] auth11 = auth10;
            Author[] auth12 = new Author[2];
            auth12[0] = new Author("Sidorov", "sidorov@gmail.com", 'm');
            auth12[1] = new Author("Bogatova", "bogatova@mail.ru", 'f');
            Author[] auth13 = new Author[2];
            auth13[0] = new Author("Ivanov", "sidorov@gmail.com", 'm');
            auth13[1] = new Author("Bogatova", "bogatova@mail.ru", 'f');
            Book book10 = new Book("Book-123", auth10, 100, 5);
            Book book11 = book10;
            Book book12 = new Book("Book-123", auth10, 100, 5);
            Book book13 = new Book("Book-123", auth10, 101, 5);
            Book book14 = new Book("Book-123", auth11, 100, 5);
            Book book15 = new Book("Book-123", auth12, 100, 5);
            Book book16 = new Book("Book-123", auth13, 100, 5);
            System.out.println("book10(auth10): " + book10 + ", hashcode=" + book10.hashCode() + "(" + auth10[0].hashCode() + ", " + auth10[1].hashCode() + ")");
            System.out.println("book11(auth10): " + book11 + ", hashcode=" + book11.hashCode() + "(" + auth10[0].hashCode() + ", " + auth10[1].hashCode() + ")");
            System.out.println("book12(auth10): " + book12 + ", hashcode=" + book12.hashCode() + "(" + auth10[0].hashCode() + ", " + auth10[1].hashCode() + ")");
            System.out.println("book13(auth10): " + book13 + ", hashcode=" + book13.hashCode() + "(" + auth10[0].hashCode() + ", " + auth10[1].hashCode() + ")");
            System.out.println("book14(auth11): " + book14 + ", hashcode=" + book14.hashCode() + "(" + auth11[0].hashCode() + ", " + auth11[1].hashCode() + ")");
            System.out.println("book15(auth12): " + book15 + ", hashcode=" + book15.hashCode() + "(" + auth12[0].hashCode() + ", " + auth12[1].hashCode() + ")");
            System.out.println("book16(auth13): " + book16 + ", hashcode=" + book16.hashCode() + "(" + auth13[0].hashCode() + ", " + auth13[1].hashCode() + ")");
            System.out.println("\nauth10_hashCode vs auth11_hashCode: " + auth10[0].hashCode() + ", " + auth10[1].hashCode() + " vs " + auth11[0].hashCode() + ", " + auth11[1].hashCode());
            System.out.println("hashCode for arrays: " + Arrays.hashCode(auth10) + " vs " + Arrays.hashCode(auth11));
            System.out.println("auth10 equals auth11?: " + auth10[0].equals(auth11[0]) + ", " + auth10[1].equals(auth11[1]) + "; result for arrays = " + Arrays.equals(auth10, auth11));
            System.out.println("auth10 == auth11?: " + (auth10[0] == auth11[0]) + ", " + (auth10[1] == auth11[1]) + "; result for arrays = " + (auth10 == auth11));
            System.out.println("\nauth10_hashCode vs auth12_hashCode: " + auth10[0].hashCode() + ", " + auth10[1].hashCode()  + " vs " + auth12[0].hashCode() + ", " + auth12[1].hashCode());
            System.out.println("hashCode for arrays: " + Arrays.hashCode(auth10) + " vs " + Arrays.hashCode(auth12));
            System.out.println("auth10 equals auth12?: " + auth10[0].equals(auth12[0]) + ", " + auth10[1].equals(auth12[1]) + "; result for arrays = " + Arrays.equals(auth10, auth12));
            System.out.println("auth10 == auth12?: " + (auth10[0] == auth12[0]) + ", " + (auth10[1] == auth12[1]) + "; result for arrays = " + (auth10 == auth12));
            System.out.println("\nauth10_hashCode vs auth13_hashCode: " + auth10[0].hashCode() + ", " + auth10[1].hashCode() + " vs " + auth13[0].hashCode() + ", " + auth13[1].hashCode());
            System.out.println("hashCode for arrays: " + Arrays.hashCode(auth10) + " vs " + Arrays.hashCode(auth13));
            System.out.println("auth10 equals auth13?: " + auth10[0].equals(auth13[0]) + ", " + auth10[1].equals(auth13[1]) + "; result for arrays = " + Arrays.equals(auth10, auth13));
            System.out.println("auth10 == auth13?: " + (auth10[0] == auth13[0]) + ", " + (auth10[1] == auth13[1]) + "; result for arrays = " + (auth10 == auth13));
            System.out.println("\nbook10[auth10]_hashCode vs book11[auth10]_hashCode: " + book10.hashCode() + " vs " + book11.hashCode());
            System.out.println("book10[auth10] equals book11[auth10]?: " + book10.equals(book11));
            System.out.println("book10[auth10] == book11[auth10]?: " + (book10 == book11));
            System.out.println("\nbook10[auth10]_hashCode vs book12[auth10]_hashCode: " + book10.hashCode() + " vs " + book12.hashCode());
            System.out.println("book10[auth10] equals book12[auth10]?: " + book10.equals(book12));
            System.out.println("book10[auth10] == book12[auth10]?: " + (book10 == book12));
            System.out.println("\nbook10[auth10]_hashCode vs book13[auth10]_hashCode: " + book10.hashCode() + " vs " + book13.hashCode());
            System.out.println("book10[auth10] equals book13[auth10]?: " + book10.equals(book13));
            System.out.println("book10[auth10] == book13[auth10]?: " + (book10 == book13));
            System.out.println("\nbook10[auth10]_hashCode vs book14[auth11]_hashCode: " + book10.hashCode() + " vs " + book14.hashCode());
            System.out.println("book10[auth10] equals book14[auth11]?: " + book10.equals(book14));
            System.out.println("book10[auth10] == book14[auth11]?: " + (book10 == book14));
            System.out.println("\nbook10[auth10]_hashCode vs book15[auth12]_hashCode: " + book10.hashCode() + " vs " + book15.hashCode());
            System.out.println("book10[auth10] equals book15[auth12]?: " + book10.equals(book15));
            System.out.println("book10[auth10] == book15[auth12]?: " + (book10 == book15));
            System.out.println("\nbook10[auth10]_hashCode vs book16[auth13]_hashCode: " + book10.hashCode() + " vs " + book16.hashCode());
            System.out.println("book10[auth10] equals book16[auth13]?: " + book10.equals(book16));
            System.out.println("book10[auth10] == book16[auth13]?: " + (book10 == book16));
        endTitle();

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