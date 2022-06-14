package ej5State;

public class CPU {
    private String capacidadTotal;
    private double capacidadUtilizada;
    private String description;

    public CPU(){}

    public String getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(String capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public double getCapacidadUtilizada() {
        return capacidadUtilizada;
    }

    public void setCapacidadUtilizada(double capacidadUtilizada) {
        this.capacidadUtilizada = capacidadUtilizada;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void showInfo(){
        System.out.println("\n ******* CPU *******");
        System.out.println("Capacidad total: " + capacidadTotal);
        System.out.println("Capacidad utilizada: " + capacidadUtilizada);
        System.out.println("Descripcion: " + description);
    }
}
