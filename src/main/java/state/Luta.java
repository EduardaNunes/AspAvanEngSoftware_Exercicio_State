package state;

public class Luta {

    private LutaEstado estado;

    public Luta(){
        this.estado = LutaEstadoAgendada.getInstance();
    }

    public void setEstado(LutaEstado estado){
        this.estado = estado;
    }
    
    public LutaEstado getEstado() {
        return estado;
    }

    public boolean confirmar() {
        return estado.confirmar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean adiar() {
        return estado.adiar(this);
    }

    public boolean iniciar() {
        return estado.iniciar(this);
    }

    public boolean finalizar() {
        return estado.finalizar(this);
    }

    public boolean reagendar() {
        return estado.reagendar(this);
    }

}