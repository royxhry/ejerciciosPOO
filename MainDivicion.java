import java.util.Scanner;

public class MainDivicion {
    public static void main(String[]args){

        Scanner sc =new Scanner(System.in);
        Divicion d1 = new Divicion();

        System.out.println("ingresa el primer numero");
        double a = sc.nextDouble();
        d1.setA(a);
        System.out.println("ingresa el primer numero");
        double b = sc.nextDouble();
        d1.setB(b);

        d1.dividir();
        double r = d1.getR();
        System.out.println("LA divicion es:"+r);
        System.out.println(d1.toString());
        sc.close();
        


    }
}
