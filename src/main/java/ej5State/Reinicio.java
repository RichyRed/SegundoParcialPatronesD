package ej5State;

public class Reinicio implements IStateCompu {
    @Override
    public void resourceManager(Computadora computadora) throws InterruptedException {
        System.out.println("\n ** Reiniciar ***\n" );
        computadora.getMemoriaRam().setCapacidadUtilizada(0);
        computadora.getCpu().setCpu().setCapacidadUtilizada(0);
        computadora.getProgramas().setProgramasUtilizados("Cerrando programas, no disponible");
        computadora.getMemoriaRam().showInfo();
        computadora.getCpu().showInfo();
        computadora.getProgramas().showInfo();
    }
}
