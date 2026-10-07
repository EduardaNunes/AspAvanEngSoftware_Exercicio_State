package state;

public class LutaEstadoEmAndamento extends LutaEstado {

    private LutaEstadoEmAndamento() {};
    private static LutaEstadoEmAndamento instance = new LutaEstadoEmAndamento();
    public static LutaEstadoEmAndamento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Andamento";
    }

    public boolean finalizar(Luta luta) {
        luta.setEstado(LutaEstadoFinalizada.getInstance());
        return true;
    }

}
