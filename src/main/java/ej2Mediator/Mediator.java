package ej2Mediator;

import structures.mediator.Colleague;

public interface Mediator {
    void send(String msg, Colleague colleague);
}
