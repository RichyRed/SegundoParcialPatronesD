package ej2Mediator;

public class Client {
    public static void main(String[]args){
        ChatDelJuego discord = new ChatDelJuego();

        Estudiantes j1 = new Estudiantes(discord);
        j1.setNombre("ANtonio");
        j1.setAlias("Tony");
        j1.setRanking("Plata");

        Estudiantes j2 = new Estudiantes(discord);
        j2.setNombre("FEderico");
        j2.setAlias("Fede");
        j2.setRanking("BRonce");

        Estudiantes j3 = new Estudiantes(discord);
        j3.setNombre("Rogelio");
        j3.setAlias("Roger");
        j3.setRanking("Oro");

        Estudiantes j4 = new Estudiantes(discord);
        j4.setNombre("Dario");
        j4.setAlias("Drax");
        j4.setRanking("Leyenda");

        Estudiantes j5 = new Estudiantes(discord);
        j5.setNombre("Camilo");
        j5.setAlias("Cal");
        j5.setRanking("Mitico");

        discord.agregarJugadores(j1).agregarJugadores(j2).agregarJugadores(j3).agregarJugadores(j4).agregarJugadores(j5);

        System.out.println("**** New Message ****");
        j5.send("Helooow", "Todos");
        System.out.println("**** New Message ****");
        j4.send("Lest gooooo", "Mi equipo");
    }
}
