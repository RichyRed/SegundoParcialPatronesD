package ej3Observer;

import structures.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb implements IPagina{
    private List<Notificaciones> notificacionesList = new ArrayList<>();
    private List<IUser> users = new ArrayList<>();

    public PaginaWeb(){}

    public void noti(Notificaciones notificaciones){
         notificacionesList.add(notificaciones);
         notifyObservers(notificaciones);
    }

    @Override
    public void attach(IUser observer) {
        users.add(observer);
    }

    @Override
    public void detach(IUser observer) {
        users.remove(observer);

    }


    @Override
    public void notifyObservers(String msg) {

    }
}
