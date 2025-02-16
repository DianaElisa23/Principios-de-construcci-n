package personas; //Declaración del paquete

public abstract class Personal { //Declaración de clase abstracta 
    private int id;  //Sangría de bloque +2 espacios
    private String nombre;
    private String apellido;
    private int edad;

    public Personal(int id, String nombre, String apellido, int edad) { //constructor de la clase Personal
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public abstract void concentrarse();
    public abstract void viajar();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        this.edad = edad;
    }
}
