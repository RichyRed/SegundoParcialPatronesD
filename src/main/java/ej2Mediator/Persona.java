package ej2Mediator;

public abstract class Persona {
    protected IChatDeJuegos chatDeJuegos;

    private String alias;
    private String nombre;
    private String ranking;

    public Persona(String alias, String nombre, String equipo) {
        this.alias = alias;
        this.nombre = nombre;
    }

    public Persona(IChatDeJuegos chatDeJuegos){
        this.chatDeJuegos = chatDeJuegos;
    }

    public IChatDeJuegos getChatDeJuegos() {
        return chatDeJuegos;
    }

    public void setChatDeJuegos(IChatDeJuegos chatDeJuegos) {
        this.chatDeJuegos = chatDeJuegos;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public abstract void send(String msg, String destino);
    public abstract void receive(String msg);
}
