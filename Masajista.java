package personas;

public class Masajista extends Personal{   //hereda la clase abstracta de Personal 
    private String profesion;  //Sangría de bloque +2 espacios
    private int añosExperiencia;  //uso de lowerCamelCase
    public Masajista(int id, String nombre, String apellido, int edad, String profesion, int añosExperiencia) {
        super(id, nombre, apellido, edad);
        this.profesion = profesion;
        this.añosExperiencia = añosExperiencia;
    }

    @Override  // Se sobrescribe el método viajar de la clase Personal.
    public void concentrarse(){
        System.out.println(getNombre() + " " + getApellido() + " se concentra");
    }
    @Override  // Se sobrescribe el método viajar de la clase Personal.
    public void viajar(){
        System.out.println(getNombre() + " " + getApellido() + "  viaja");
    }

    public void darMasaje(){
        System.out.println(getNombre() + " " + getApellido() + " da un masaje");
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
}
