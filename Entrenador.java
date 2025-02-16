package personas;

public class Entrenador extends Personal{  //hereda la clase abstracta de Personal 
    private int idFederacion; //uso de lowerCamelCase

    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }
    
    @Override  // Se sobrescribe el método viajar de la clase Personal.
    public void concentrarse(){
        System.out.println(getNombre() + " " + getApellido() + " se concentra");
    }
    
    @Override // Se sobrescribe el método viajar de la clase Personal.
    public void viajar(){
        System.out.println(getNombre() + " " + getApellido() + " viaja");
    }

    public void dirigirPartido(){
        System.out.println(getNombre() + " " + getApellido() + " dirije un partido");
    }

    public void dirigirEntrenamiento(){
        System.out.println(getNombre() + " " + getApellido() + " dirije el entrenamiento");
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
}
