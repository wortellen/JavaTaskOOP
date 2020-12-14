package ru.ncedu.wortellen.taskoop;

import ru.ncedu.wortellen.taskoop2.Ball;
import ru.ncedu.wortellen.taskoop2.Container;
import ru.ncedu.wortellen.taskoop2.MyComplex;
import ru.ncedu.wortellen.taskoop2.MyPolynomial;

public class Main {
    public static void main(String[] args) {
        testCircle();
        //testRectangle();
        //testEmployee();
        //testBook();
        //testMyPoint();
        //testMyTriangle();


    }
    public static void testCircle(){
        Circle c1 = new Circle();
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(3,"blue");
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());
        c1.setColor("green");
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
    public static void testRectangle(){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10,20);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
    public static void testEmployee(){
        Employee e = new Employee(1,"Ivan","Ivanov",30000);
        System.out.println(e.getID());
        System.out.println(e.getFirstName());
        System.out.println(e.getLastName());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        System.out.println(e.getAnnualSalary());
        System.out.println(e.raiseSalary(10));
        System.out.println(e.toString());
    }
    public static void testBook(){
        Author a1= new Author("First Author","first@gmail.com",'M');
        Author a2= new Author("Second Author","second@gmail.com",'M');
        Author a3= new Author("Third Author","third@gmail.com",'F');
        Author[] a =  {a1,a2,a3};
        Book b = new Book("Book",a,100,1);
        System.out.println(b.getAuthorNames());
        System.out.println(b.toString());

    }
    public static void testMyPoint(){
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(5,7);
        p1.setXY(0,8);
        System.out.println(p1.distance());
        System.out.println(p1.distance(2,2));
        System.out.println(p1.distance(p2));
    }
    public static void testMyTriangle(){
        MyTriangle t1 = new MyTriangle(-2,0,0,3,2,0);
        MyPoint p1 = new MyPoint(2,3);
        MyPoint p2 = new MyPoint(5,7);
        MyPoint p3 = new MyPoint(8,10);
        MyTriangle t2 = new MyTriangle(p1,p2,p3);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getType());
        System.out.println(t2.getType());
        System.out.println(t2.getPerimeter());
    }
}
