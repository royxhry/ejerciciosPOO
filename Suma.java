public class Suma{
    
    private int a,b,r;
    public int getA() {
        return a;
    }
    
    public void setA(int a) {
        this.a = a;
    }
    
    public int getB() {
        return b;
    }
    
    public void setB(int b) {
        this.b = b;
    }
    
    public void sumar() {
        this.r = a+b;
    }
    
    public int getR() {
        return r;
    }
    
    
    @Override
    public String toString() {
        return "Suma [a=" + a + ", b=" + b + ", r=" + r + "]";
    }
}