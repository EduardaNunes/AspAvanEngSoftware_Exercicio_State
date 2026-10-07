package state;

public abstract class LutaEstado {

    public abstract String getEstado();

    public boolean confirmar(Luta luta) {
        return false;
    }

    public boolean cancelar(Luta luta) {
        return false;
    }

    public boolean adiar(Luta luta) {
        return false;
    }

    public boolean iniciar(Luta luta) {
        return false;
    }

    public boolean finalizar(Luta luta) {
        return false;
    }

    public boolean reagendar(Luta luta) {
        return false;
    }

}
