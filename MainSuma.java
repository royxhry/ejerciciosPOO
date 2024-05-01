import java.util.Scanner;

public class MainSuma {
    public static void main(String[] args) {
        Scanner p1 = new Scanner(System.in);
        Suma s1 = new Suma();
        System.out.println("ingresa el primer numero ");
        int a = p1.nextInt();
        s1.setA(a);   
        System.out.println("ingresa el segundo numero");
        int b = p1.nextInt();
        s1.setB(b);
        
        s1.sumar();

        int r = s1.getR();
        System.out.println("El resultado de la suma es "+r);
       System.out.println(s1.toString());
       
    }

}