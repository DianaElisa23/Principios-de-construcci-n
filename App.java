import personas.*;
public class App {
    public static void main(String[] args) throws Exception {
        Futbolista futbolista = new Futbolista(1, "Fernando", "Tapia", 28, 9, "Portero");
        Futbolista futbolista2 = new Futbolista(2, "Ramon", "Juarez", 26, 15, "Defensa");
        Futbolista futbolista3 = new Futbolista(3, "Jose", "Ramirez", 30, 10, "Medio");
        Futbolista futbolista4 = new Futbolista(4, "Guillermo", "Martinez", 21, 27, "Delantero");
        Futbolista futbolista5 = new Futbolista(5, "Jeremy", "Marquez", 19, 5, "Medio");
        Futbolista futbolista6 = new Futbolista(6, "Raymundo", "Fulgencio", 24, 3, "Delantero");
        Futbolista futbolista7 = new Futbolista(7, "Roberto", "Meraz", 29, 7, "Medio");
        Entrenador entrenador = new Entrenador(8, "Jaime", "Lozano", 50, 2302);
        Entrenador entrenador2 = new Entrenador(9, "Miguel", "Herrera", 60, 2013);
        Masajista masajista = new Masajista(10, "Alejandro", "Martinez", 56, "Fisioterapeuta", 5);
        Masajista masajista2 = new Masajista(11, "Carlos", "Pecanha", 49, "Fisioterapeuta", 9);

        futbolista.entrenar();
        futbolista2.jugarPartido();
        futbolista3.concentrarse();
        futbolista4.entrenar();
        futbolista5.entrenar();
        futbolista6.jugarPartido();
        futbolista7.jugarPartido();


        entrenador.concentrarse();
        entrenador.dirigirPartido();

        entrenador2.concentrarse();
        entrenador2.dirigirEntrenamiento();

        masajista.darMasaje();
        masajista.viajar();
        masajista2.concentrarse();

    }
}
