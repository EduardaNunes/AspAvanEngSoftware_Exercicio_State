package state;

public class LutaEstadoConfirmada extends LutaEstado {

    private LutaEstadoConfirmada() {};
    private static LutaEstadoConfirmada instance = new LutaEstadoConfirmada();
    public static LutaEstadoConfirmada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Confirmada";
    }

    public boolean iniciar(Luta luta) {
        luta.setEstado(LutaEstadoEmAndamento.getInstance());
        return true;
    }

    public boolean cancelar(Luta luta) {
        luta.setEstado(LutaEstadoCancelada.getInstance());
        return true;
    }

}
