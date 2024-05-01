import java.util.Scanner;
public class MainPaciente {
        public static void main(String[] args) {
        Scanner p1 = new Scanner(System.in);
            
     System.out.println("Ingresa nombre y apellido");
        String nombre =p1.next();
        String apellido=p1.next();
        System.out.println("Ingresa tu edad");
        int edad=p1.nextInt();
        System.out.println("Ingresa tu altura");
        double altura=p1.nextDouble();
        
        Paciente p2 = new Paciente();
        p2.nombre=nombre;
        p2.apellido= apellido;
        p2.edad= edad;
        p2.altura=altura;
        p2.mostrarNombreA();
        p2.mostrarEdad();
        p2.mostrarAtura();
        


    }
}

