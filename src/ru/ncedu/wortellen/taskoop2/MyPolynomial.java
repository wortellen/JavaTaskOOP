package ru.ncedu.wortellen.taskoop2;

public class MyPolynomial {
    public double[] coeffs;

    public MyPolynomial(double... coeffs){
        this.coeffs = coeffs;
    }

    public int getDegree(){
        int tmp = 0;
        for(int i= coeffs.length-1;i>=1;i--){
            if(coeffs[i]==0)
                tmp++;
            else break;
        }
        return coeffs.length-1-tmp;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i= coeffs.length-1;i>=0;i--){
            if(i!=0&&i!=1) {
                if (coeffs[i] != 0) {
                    if(coeffs[i]>0) {
                        sb.append("+");
                        sb.append(coeffs[i]);
                        sb.append("x^");
                        sb.append(i);
                    }
                    else{
                        sb.append(coeffs[i]);
                        sb.append("x^");
                        sb.append(i);
                    }
                }
            }
            else if(i==0){
                if(coeffs[i]>0) {
                    sb.append("+");
                    sb.append(coeffs[i]);
                }
                else if(coeffs[i]<0) sb.append(coeffs[i]);
                }
            else {
                if (coeffs[i] != 0) {
                    if(coeffs[i]>0) {
                        sb.append("+");
                        sb.append(coeffs[i]);
                        sb.append("x");
                    }
                    else{
                        sb.append(coeffs[i]);
                        sb.append("x");
                    }
                }
            }
        }
        if(sb.substring(0,1).equals("+"))
            return sb.substring(1);
        else
            return sb.toString();
    }

    public double evaluate(double x){
        double result=0;
        for(int i = 0 ;i<coeffs.length;i++){
            if(i!=0)
                result +=coeffs[i]*Math.pow(x,i);
            else result+=coeffs[i];
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right){
        int newSize = Math.max(coeffs.length,right.coeffs.length);
        double[] newP = new double[newSize];
        for(int i = 0;i<coeffs.length;i++){
            newP[i]+=coeffs[i];
        }
        for(int i = 0;i<right.coeffs.length;i++){
            newP[i]+=right.coeffs[i];
        }
        return  new MyPolynomial(newP);
    }

    public MyPolynomial multiple(MyPolynomial right){
        int newSize = coeffs.length*right.coeffs.length;
        double[] newP = new double[newSize];
        for(int i=0;i<coeffs.length;i++)
            for(int j=0;j<right.coeffs.length;j++)
                newP[i+j]+=coeffs[i]*right.coeffs[j];
        return new MyPolynomial(newP);
    }
}
