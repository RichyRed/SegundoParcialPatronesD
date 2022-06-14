package ej2Mediator;


import java.util.ArrayList;
import java.util.List;

public class ChatDelJuego implements IChatDeJuegos{

    List<Persona> jugadores = new ArrayList<>();

    public ChatDelJuego agregarJugadores(Persona jugador) {
        jugadores.add(jugador);
        return this;
    }

    @Override
    public void send(String msg, Persona p, String destino) {
        if(destino.equals("Todos")){
            for(Persona jugadorM: jugadores){
                jugadorM.receive(msg);
            }
        }else if(destino.equals("Mi equipo")){
            for(Persona jugadorM: jugadores){
                if(p.getClass().equals(jugadorM.getClass())){
                    jugadorM.receive(msg);
                }
            }
        }
    }
}
