import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest {

    @Test
    void deveRealizarPagamento() {
        Pagamento pagamento = new Pagamento();
        pagamento.realizarPagamento(80.0f, 20.0f);
        assertEquals(100.0f, pagamento.getValorTotal());
    }

    @Test
    void deveReverterPagamento() {
        Pagamento pagamento = new Pagamento();
        pagamento.reverterPagamento(80.0f, 10.0f);
        assertEquals(70.0f, pagamento.getValorTotal());
    }

    @Test
    void deveMultiplicarPagamento() {
        Pagamento pagamento = new Pagamento();
        pagamento.multiplicarPagamento(80.0f, 1.1f);
        assertEquals(88.0f, pagamento.getValorTotal());
    }

    @Test
    void deveDividirPagamento() {
        Pagamento pagamento = new Pagamento();
        pagamento.dividirPagamento(100.0f, 2.0f);
        assertEquals(50.0f, pagamento.getValorTotal());
    }


    @Test
    void deveCalcularMediaPagamento() {
        Pagamento pagamento = new Pagamento();
        pagamento.calcularMediaPagamento(70.0f, 80.0f);
        assertEquals(75.0f, pagamento.getValorTotal());
    }

}


