package ru.ncedu.wortellen.taskoop2;

public class Main {
    public static void main(String[] args) {
        testMyComplex();
        //testMyPolynomial();
        //testBall();
        //testContainer();
    }
    public static void testMyComplex(){
        MyComplex c1 = new MyComplex();
        MyComplex c2 = new MyComplex(5,0);
        MyComplex c3 = new MyComplex(0,4);
        MyComplex c4 = new MyComplex(-3,4);
        MyComplex c5 = new MyComplex(-3,4);
        MyComplex c6 = new MyComplex(2,9);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
        System.out.println(c2.isReal());
        System.out.println(c3.isImaginary());
        System.out.println(c3.isReal());
        System.out.println(c4.equals(c5));
        System.out.println(c2.magnitude());
        System.out.println(c4.argument());
        System.out.println(c2.add(c3));
        System.out.println(c4.multiply(c6));
        System.out.println(c5.divide(c2));
        System.out.println(c5.conjugate());

    }
    public static void testMyPolynomial(){
        double[] poly1 = {7,-76,21,34,0,0,0,0,0,0};
        double[] poly2 = {23,42.54,-8.4,-0.1};
        MyPolynomial p = new MyPolynomial(poly1);
        MyPolynomial p1 = new MyPolynomial(poly2);
        System.out.println(p.getDegree());
        System.out.println(p.evaluate(4));
        System.out.println(p.evaluate(0));
        System.out.println(p.toString());
        System.out.println(p1.toString());
        System.out.println(p.add(p1));
        System.out.println(p.multiple(p1));
    }
    public static void testBall(){
        Ball b1 = new Ball(1,1,1,45,1);
        Ball b2 = new Ball(6,4,3,0,2);
        b2.move();
        b1.reflectVertical();
        b1.reflectHorizontal();
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
    public static void testContainer(){
        Ball b = new Ball(1,1,1,45,1);
        Container c = new Container(0,10,10,10);
        System.out.println(c.toString());
        System.out.println(b.toString());
        System.out.println("двигаемся в правый верхний угол");
        while (c.collides(b)){

            b.move();
            System.out.println(b.toString());
        }
        b.reflectHorizontal();
        b.reflectVertical();
        b.move();
        System.out.println("возвращаемся в контейнер");
        System.out.println(b.toString());
        b.setxDelta(0);
        b.setyDelta(-1);
        System.out.println("двигаемся вниз");
        while (c.collides(b)){
            b.move();
            System.out.println(b.toString());
        }
    }
}
