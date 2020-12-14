package ru.ncedu.wortellen.taskoop2;

public class Container {
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    public Container(int x,int y,int width,int height){
        x1=x;
        y1=y;
        x2=x+width;
        y2=y-height;
    }

    public int getX(){
        return x1;
    }

    public int getY(){
        return y1;
    }
    public int getWidth(){
        return x2-x1;
    }
    public int getHeight(){
        return y1-y2;
    }

    public boolean collides(Ball ball){
        return ball.getX() + ball.getRadius() <= x2 && ball.getX() - ball.getRadius() >= x1 && ball.getY() + ball.getRadius() <= y1 && ball.getY() - ball.getRadius() >= y2;
    }

    public  String toString(){
        return "Container[("+x1+","+y1+"),("+x2+","+y2+")]";
    }

}
