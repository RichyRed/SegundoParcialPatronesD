package ej5State;

public class Client { public static void main (String[]args) throws InterruptedException {
    Computadora pc = new Computadora();
    pc.setState(new Encendido());

    pc.resourceManager();
}
}
