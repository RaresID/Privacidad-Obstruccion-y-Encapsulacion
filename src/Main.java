/*Crear un objeto persona en el main.*/
/*Utiliza los gets y sets para darle valores a las propiedades
edad, nombre y telefono,por último muéstralas por consola.*/
public class Main {
    public static void main(String[] args) {

        Persona telefono = new Persona();
        telefono.setTelefono(667991823);

        Persona edad = new Persona();
        edad.setEdad(36);

        Persona nombre = new Persona();
        nombre.setNombre("Raluca");
        System.out.println("el nombre de esta persona es "+nombre.getNombre());
        System.out.println("el numero de telefono de esta persona es "+telefono.getTelefono());
        System.out.println("la edad de esta persona es "+edad.getEdad()+" años");

    }
}

/*Crear clase Persona.*/
/*Crear las variables privadas edad, nombre y telefono de la clase Persona.*/
/*Crear gets y sets de cada propiedad.*/
class Persona{
    private int edad;
    public void setEdad (int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    private String nombre;
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    private int telefono;
    public void setTelefono (int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return telefono;
    }
}