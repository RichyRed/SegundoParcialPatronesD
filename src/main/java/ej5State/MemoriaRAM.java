package ej5State;

public class MemoriaRAM {
    private String capacidadTotal;
    private int capacidadUtilizada;
    private String descripcion;

    public MemoriaRAM(){}

    public String getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(String capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public int getCapacidadUtilizada() {
        return capacidadUtilizada;
    }

    public void setCapacidadUtilizada(int capacidadUtilizada) {
        this.capacidadUtilizada = capacidadUtilizada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void showInfo(){
        System.out.println("\n ----- RAM ----- \n");
        System.out.println("Capacidad Total:"+ capacidadTotal);
        System.out.println("Capaciad utlizada: " + capacidadUtilizada);
        System.out.println("Descripcion:" + descripcion);
    }
}
