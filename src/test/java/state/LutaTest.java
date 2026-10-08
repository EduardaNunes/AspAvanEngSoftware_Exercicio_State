package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LutaTest {

    Luta luta;

    @BeforeEach
    public void setUp() {
        luta = new Luta();
    }

    // Luta agendada

    @Test
    public void deveConfirmarLutaAgendada() {
        assertTrue(luta.confirmar());
        assertEquals(LutaEstadoConfirmada.getInstance(), luta.getEstado());
    }

    @Test
    public void deveCancelarLutaAgendada() {
        assertTrue(luta.cancelar());
        assertEquals(LutaEstadoCancelada.getInstance(), luta.getEstado());
    }

    @Test
    public void deveAdiarLutaAgendada() {
        assertTrue(luta.adiar());
        assertEquals(LutaEstadoAdiada.getInstance(), luta.getEstado());
    }

    @Test
    public void naoDeveIniciarLutaAgendada() {
        assertFalse(luta.iniciar());
    }

    @Test
    public void naoDeveFinalizarLutaAgendada() {
        assertFalse(luta.finalizar());
    }

    @Test
    public void naoDeveReagendarLutaAgendada() {
        assertFalse(luta.reagendar());
    }

    // Luta confirmada

    @Test
    public void deveIniciarLutaConfirmada() {
        luta.setEstado(LutaEstadoConfirmada.getInstance());
        assertTrue(luta.iniciar());
        assertEquals(LutaEstadoEmAndamento.getInstance(), luta.getEstado());
    }

    @Test
    public void deveCancelarLutaConfirmada() {
        luta.setEstado(LutaEstadoConfirmada.getInstance());
        assertTrue(luta.cancelar());
        assertEquals(LutaEstadoCancelada.getInstance(), luta.getEstado());
    }

    @Test
    public void naoDeveConfirmarLutaConfirmada() {
        luta.setEstado(LutaEstadoConfirmada.getInstance());
        assertFalse(luta.confirmar());
    }

    @Test
    public void naoDeveAdiarLutaConfirmada() {
        luta.setEstado(LutaEstadoConfirmada.getInstance());
        assertFalse(luta.adiar());
    }

    @Test
    public void naoDeveFinalizarLutaConfirmada() {
        luta.setEstado(LutaEstadoConfirmada.getInstance());
        assertFalse(luta.finalizar());
    }

    @Test
    public void naoDeveReagendarLutaConfirmada() {
        luta.setEstado(LutaEstadoConfirmada.getInstance());
        assertFalse(luta.reagendar());
    }

    // Luta em andamento

    @Test
    public void deveFinalizarLutaEmAndamento() {
        luta.setEstado(LutaEstadoEmAndamento.getInstance());
        assertTrue(luta.finalizar());
        assertEquals(LutaEstadoFinalizada.getInstance(), luta.getEstado());
    }

    @Test
    public void naoDeveConfirmarLutaEmAndamento() {
        luta.setEstado(LutaEstadoEmAndamento.getInstance());
        assertFalse(luta.confirmar());
    }

    @Test
    public void naoDeveCancelarLutaEmAndamento() {
        luta.setEstado(LutaEstadoEmAndamento.getInstance());
        assertFalse(luta.cancelar());
    }

    @Test
    public void naoDeveAdiarLutaEmAndamento() {
        luta.setEstado(LutaEstadoEmAndamento.getInstance());
        assertFalse(luta.adiar());
    }

    @Test
    public void naoDeveIniciarLutaEmAndamento() {
        luta.setEstado(LutaEstadoEmAndamento.getInstance());
        assertFalse(luta.iniciar());
    }

    @Test
    public void naoDeveReagendarLutaEmAndamento() {
        luta.setEstado(LutaEstadoEmAndamento.getInstance());
        assertFalse(luta.reagendar());
    }

    // Luta finalizada (terminal)

    @Test
    public void naoDeveConfirmarLutaFinalizada() {
        luta.setEstado(LutaEstadoFinalizada.getInstance());
        assertFalse(luta.confirmar());
    }

    @Test
    public void naoDeveCancelarLutaFinalizada() {
        luta.setEstado(LutaEstadoFinalizada.getInstance());
        assertFalse(luta.cancelar());
    }

    @Test
    public void naoDeveAdiarLutaFinalizada() {
        luta.setEstado(LutaEstadoFinalizada.getInstance());
        assertFalse(luta.adiar());
    }

    @Test
    public void naoDeveIniciarLutaFinalizada() {
        luta.setEstado(LutaEstadoFinalizada.getInstance());
        assertFalse(luta.iniciar());
    }

    @Test
    public void naoDeveFinalizarLutaFinalizada() {
        luta.setEstado(LutaEstadoFinalizada.getInstance());
        assertFalse(luta.finalizar());
    }

    @Test
    public void naoDeveReagendarLutaFinalizada() {
        luta.setEstado(LutaEstadoFinalizada.getInstance());
        assertFalse(luta.reagendar());
    }

    // Luta cancelada (terminal)

    @Test
    public void naoDeveConfirmarLutaCancelada() {
        luta.setEstado(LutaEstadoCancelada.getInstance());
        assertFalse(luta.confirmar());
    }

    @Test
    public void naoDeveCancelarLutaCancelada() {
        luta.setEstado(LutaEstadoCancelada.getInstance());
        assertFalse(luta.cancelar());
    }

    @Test
    public void naoDeveAdiarLutaCancelada() {
        luta.setEstado(LutaEstadoCancelada.getInstance());
        assertFalse(luta.adiar());
    }

    @Test
    public void naoDeveIniciarLutaCancelada() {
        luta.setEstado(LutaEstadoCancelada.getInstance());
        assertFalse(luta.iniciar());
    }

    @Test
    public void naoDeveFinalizarLutaCancelada() {
        luta.setEstado(LutaEstadoCancelada.getInstance());
        assertFalse(luta.finalizar());
    }

    @Test
    public void naoDeveReagendarLutaCancelada() {
        luta.setEstado(LutaEstadoCancelada.getInstance());
        assertFalse(luta.reagendar());
    }

    // Luta adiada

    @Test
    public void deveReagendarLutaAdiada() {
        luta.setEstado(LutaEstadoAdiada.getInstance());
        assertTrue(luta.reagendar());
        assertEquals(LutaEstadoAgendada.getInstance(), luta.getEstado());
    }

    @Test
    public void deveCancelarLutaAdiada() {
        luta.setEstado(LutaEstadoAdiada.getInstance());
        assertTrue(luta.cancelar());
        assertEquals(LutaEstadoCancelada.getInstance(), luta.getEstado());
    }

    @Test
    public void naoDeveConfirmarLutaAdiada() {
        luta.setEstado(LutaEstadoAdiada.getInstance());
        assertFalse(luta.confirmar());
    }

    @Test
    public void naoDeveIniciarLutaAdiada() {
        luta.setEstado(LutaEstadoAdiada.getInstance());
        assertFalse(luta.iniciar());
    }

    @Test
    public void naoDeveFinalizarLutaAdiada() {
        luta.setEstado(LutaEstadoAdiada.getInstance());
        assertFalse(luta.finalizar());
    }

    @Test
    public void naoDeveAdiarLutaAdiada() {
        luta.setEstado(LutaEstadoAdiada.getInstance());
        assertFalse(luta.adiar());
    }

}