package ej5State;

public class Programas {
    private String programasUtilizados;

    public Programas(){}

    public String getProgramasUtilizados() {
        return programasUtilizados;
    }

    public void setProgramasUtilizados(String programasUtilizados) {
        this.programasUtilizados = programasUtilizados;
    }

    public void showInfo(){
        System.out.println(programasUtilizados);
    }
}
