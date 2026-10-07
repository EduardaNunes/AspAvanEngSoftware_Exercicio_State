package state;

public class LutaEstadoFinalizada extends LutaEstado {

    private LutaEstadoFinalizada() {};
    private static LutaEstadoFinalizada instance = new LutaEstadoFinalizada();
    public static LutaEstadoFinalizada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Finalizada";
    }

}