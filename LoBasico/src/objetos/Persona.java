package objetos;

public class Persona {
    //Atributos
    int edad;
    String nombre;
    private String apellidos;
    boolean vivo;
    char sexo = 'f';
    //Funciones
    //TipoFuncion retorno NombreFuncion(){
//
//
  //  }

    public Persona(int edad, String nombre, String apellidos){
        this.edad = edad;
        this.nombre = nombre; // this.nombre = "Sebastian";
        this.apellidos = apellidos;
        this.vivo =true;
        this.sexo = 'M';
    }
    // Esta es una funciona que saluda a alguien
    public void Saludar(String aquien){
        System.out.println("Hola "+ aquien+ " mi nombre es: "+ nombre + " " + apellidos);
    }
}