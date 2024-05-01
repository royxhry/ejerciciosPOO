import java.util.Scanner;

public class MainMultiplicacion {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Multiplicacion m1 = new Multiplicacion();
        System.out.println("Ingresa el primer numero");
        int a = sc.nextInt();
        m1.setA(a);
        System.out.println("Ingresa el segundo numero");
        int b = sc.nextInt();
        m1.setB(b);

        m1.multiplicar();

        int r = m1.getR();
        System.out.println("EL resultado de la multiplicacion es:"+r);
        System.out.println(m1.toString());
                
        


    }
    
}
