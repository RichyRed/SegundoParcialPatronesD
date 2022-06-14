package ej2Mediator;

public class Docentes extends  Persona{

    public Docentes(IChatDeJuegos chatDeJuegos) {
        super(chatDeJuegos);
    }

    @Override
    public void send(String msg, String destino) {
        chatDeJuegos.send(msg, this, destino);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Nombre del jugador: " + getNombre());
        System.out.println("Le llego el mensaje: " + msg);



    }
}
