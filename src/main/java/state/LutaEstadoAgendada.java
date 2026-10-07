package state;

public class LutaEstadoAgendada extends LutaEstado {

    private LutaEstadoAgendada() {};
    private static LutaEstadoAgendada instance = new LutaEstadoAgendada();
    public static LutaEstadoAgendada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Agendada";
    }

    public boolean confirmar(Luta luta) {
        luta.setEstado(LutaEstadoConfirmada.getInstance());
        return true;
    }

    public boolean cancelar(Luta luta) {
        luta.setEstado(LutaEstadoCancelada.getInstance());
        return true;
    }

    public boolean adiar(Luta luta) {
        luta.setEstado(LutaEstadoAdiada.getInstance());
        return true;
    }

}
