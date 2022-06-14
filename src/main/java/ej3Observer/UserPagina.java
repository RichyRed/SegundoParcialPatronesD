package ej3Observer;

public class UserPagina implements  IUser{

    String elementos;
    Persona persona;

    public UserPagina(String elementos, Persona persona) {
        this.elementos = elementos;
        this.persona = persona;
    }

    @Override
    public void update(String msg, Notificaciones newNotificaciones) {
        System.out.println("***** Notificaciones: " + msg+ "******");
        System.out.println("Persona: " +persona.getName());
        System.out.println("Preferencia: "+ elementos);
        newNotificaciones.showInfo();
    }

    @Override
    public void update2(String msg, Notificaciones newNotificaciones) {
            System.out.println("***** Notificaciones: " + msg+ "******");
            System.out.println("Persona: " +persona.getName());
            System.out.println("Preferencia: "+ elementos);
            newNotificaciones.showInfo();
    }

    @Override
    public String getPreferenciasNotificaciones(){
        return elementos;
    }

    public Persona getPersona(){
        return persona;
    }
}
