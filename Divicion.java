public class Divicion{

    

    double a,b,r;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getR() {
        return r;
    }

    public void dividir() {
        this.r = a/b;
    }
    
    @Override
    public String toString() {
        return "Divicion [a=" + a + ", b=" + b + ", r=" + r + "]";
    }
    
    
}