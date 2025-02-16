package personas;

public class Futbolista extends Personal { //hereda la clase abstracta de Personal 
    private int numJugador;   //Sangría de bloque +2 espacios
    private String posicionEnCancha; //uso de lowerCamelCase 

    public Futbolista(int id, String nombre, String apellido, int edad, int numJugador, String posicionEnCancha) {
        super(id, nombre, apellido, edad);
        this.numJugador = numJugador;
        this.posicionEnCancha = posicionEnCancha;
    }

    @Override // Se sobrescribe el método viajar de la clase Personal.
    public void concentrarse(){
       System.out.println(getNombre() + " " + getApellido()+ "  se concentra");
    }
     
    @Override // Se sobrescribe el método viajar de la clase Personal.
    public void viajar(){
        System.out.println(getNombre() + " " + getApellido() + "  viaja");
    }

    public void  jugarPartido(){
        System.out.println(getNombre() + " " + getApellido() + " juega un partido");
    }
    public void entrenar(){
        System.out.println(getNombre() + " " + getApellido() + " entrena");
    }

    public int getNumJugador() {
        return numJugador;
    }

    public void setNumJugador(int numJugador) {
        this.numJugador = numJugador;
    }

    public String getPosicionEnCancha() {
        return posicionEnCancha;
    }

    public void setPosicionEnCancha(String posicionEnCancha) {
        this.posicionEnCancha = posicionEnCancha;
    }

}
