package ej3Observer;

import structures.observer.IObserver;

public interface IPagina {
    void attach(IObserver observer);
    void detach(IObserver observer);
    void notifyObservers(String msg);
}
