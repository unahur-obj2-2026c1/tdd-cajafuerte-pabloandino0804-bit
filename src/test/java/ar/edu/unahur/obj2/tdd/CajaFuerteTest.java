package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class CajaFuerteTest {
    
    @Test
    public void queLaCajaFuerteEsteAbiertaAlCrearse(){
        CajaFuerte caja = new CajaFuerte();
        assertTrue(caja.estaAbierta());
    }

    @Test
    public void queSePuedeCerrarLaCajaFuerteConCodigo(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        assertFalse(caja.estaAbierta());
        assertTrue(caja.estaCerrada());
    }

    @Test
    public void queSePuedeAbrirLaCajaFuerteConCodigo(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.abrir(1234);
        assertTrue(caja.estaAbierta());
    }

    @Test
    public void noSePuedeAbrirLaCajaFuerteCuandoElCodigoEsIncorrecto(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.abrir(4321);
        assertFalse(caja.estaAbierta());
    }
}
