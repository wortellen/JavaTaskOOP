package ru.ncedu.wortellen.taskoop2;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(){}

    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public String toString(){
        if(imag>=0)
        return "("+real+"+"+imag+"i)";
        else return "("+real+imag+"i)";
    }

    public boolean isReal(){
        return imag == 0.0;
    }

    public boolean isImaginary(){
        return real == 0.0;
    }
    public boolean equals(double real, double imag){
        return this.real==real && this.imag==imag;
    }

    public boolean equals(MyComplex another){
        return this.real==another.getReal() && this.imag==another.getImag();
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(real,2)+Math.pow(imag,2));
    }

    public  double argument(){
        if(real>0 && imag >=0)
            return Math.atan(imag/real);
        else if(real<0 && imag >=0)
            return Math.PI-Math.atan(Math.abs(imag/real));
        else if(real>0 && imag <0)
            return 2*Math.PI-Math.atan(Math.abs(imag/real));
        else if(real<0 && imag <0)
            return Math.PI+Math.atan(Math.abs(imag/real));
        else if(real==0&& imag>0)
            return Math.PI/2;
        else if(real==0&& imag<0)
            return 3*Math.PI/2;
        else return 0.0;

    }

    public  MyComplex add(MyComplex right){
        real+= right.getReal();
        imag+= right.getImag();
        return this;
    }

    public  MyComplex addNew(MyComplex right){
        return new MyComplex(real+right.getReal(),imag+right.getImag());
    }

    public  MyComplex subtract(MyComplex right){
        real-= right.getReal();
        imag-= right.getImag();
        return this;
    }

    public  MyComplex subtractNew(MyComplex right){
        return new MyComplex(real-right.getReal(),imag-right.getImag());
    }
    public  MyComplex multiply(MyComplex right){
            double tmpReal = real*right.getReal()-imag*right.getImag();
            double tmpImag = real*right.getImag()+imag*right.getReal();
            this.setValue(tmpReal,tmpImag);
            return this;
    }

    public  MyComplex divide(MyComplex right){
        double tmpReal = (real*right.getReal()+imag*right.getImag())/(Math.pow(right.getReal(),2)+Math.pow(right.getImag(),2));
        double tmpImag = (imag*right.getReal()-real*right.getImag())/(Math.pow(right.getReal(),2)+Math.pow(right.getImag(),2));
        this.setValue(tmpReal,tmpImag);
        return this;
    }

    public  MyComplex conjugate(){
        imag=-imag;
        return this;
    }
}
