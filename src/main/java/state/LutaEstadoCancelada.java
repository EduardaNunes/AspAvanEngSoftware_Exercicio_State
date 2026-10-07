package state;

public class LutaEstadoCancelada extends LutaEstado {

    private LutaEstadoCancelada() {};
    private static LutaEstadoCancelada instance = new LutaEstadoCancelada();
    public static LutaEstadoCancelada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelada";
    }

}