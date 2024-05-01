public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    double altura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad<0) {
            System.out.println(" edad es invilida");
            
        }else{
            this.edad = edad;
        }
        
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura<0) {
            System.out.println("altura invalida");
            
        } else{
            this.altura = altura;
        }
        
    }

    public void mostrarNombre() {
        System.out.println(" mi nombre es: " + this.nombre);

    }

    public void mostrarApellido() {
        System.out.println("mi apellido es: " + this.apellido);
    }


    public void mostrarAltura(){
        System.out.println("mi altura es: " +this.altura);
      
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura + "]";
        
    }


}