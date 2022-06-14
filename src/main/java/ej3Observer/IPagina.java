package ej3Observer;

public interface IPagina {
    void attach(IUser observer);
    void detach(IUser observer);
    void notifyObservers(Notificaciones notificaciones);
}
