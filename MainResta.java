import java.util.Scanner;
public class MainResta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Resta resta = new Resta();

        System.out.println("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        resta.setA(num1);

        System.out.println("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        resta.setB(num2);

        resta.restar();

        int resultado = resta.getR();
        System.out.println("El resultado de la resta es " + resultado);
        System.out.println(resta.toString());

        scanner.close();
    }
}

    

