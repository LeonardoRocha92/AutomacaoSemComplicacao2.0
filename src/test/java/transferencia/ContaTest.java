package transferencia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    public void realizarTransacao(){

        Cliente xuxa = new Cliente("Xuxa","12345678900","11111");
        Cliente silvioSantos = new Cliente("Silvio Santos","88987654321","22222");

        Conta contaXuxa = new Conta("0025","2254",2500.00,xuxa);
        Conta contaSilvio = new Conta("0026","2251",3500.00,silvioSantos);

        contaXuxa.realizarTransferencia(1000.00,contaSilvio);

        assertEquals(1500.00,contaXuxa.getSaldo());
        assertEquals(4500.00,contaSilvio.getSaldo());

    }

}