package state;

public class LutaEstadoAdiada extends LutaEstado {

    private LutaEstadoAdiada() {};
    private static LutaEstadoAdiada instance = new LutaEstadoAdiada();
    public static LutaEstadoAdiada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Adiada";
    }

    public boolean reagendar(Luta luta) {
        luta.setEstado(LutaEstadoAgendada.getInstance());
        return true;
    }

    public boolean cancelar(Luta luta) {
        luta.setEstado(LutaEstadoCancelada.getInstance());
        return true;
    }

}