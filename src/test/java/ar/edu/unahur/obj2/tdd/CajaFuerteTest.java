package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class CajaFuerteTest {
    /*Test 1 */
    @Test
    public void queLaCajaFuerteEsteAbiertaAlCrearse(){
        CajaFuerte caja = new CajaFuerte();
        assertTrue(caja.estaAbierto());
    }

    /*Test 2 */
    @Test
    public void queSePuedeCerrarLaCajaFuerteConCodigo(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        assertFalse(caja.estaAbierto());
        assertTrue(caja.estaCerrado());
    }

    /*Test 3 */
    @Test
    public void queSePuedeAbrirLaCajaFuerteConCodigo(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.abrir(1234);
        assertTrue(caja.estaAbierto());
    }

    /*Test 4 */
    @Test
    public void noSePuedeAbrirLaCajaFuerteCuandoElCodigoEsIncorrecto(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.abrir(4321);
        assertFalse(caja.estaAbierto());
    }

    /*Test 5 */
    @Test
    public void seSigaCerradoConMismoCodigo(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.cerrar(2345);
        caja.abrir(1234);
        assertTrue(caja.estaAbierto());
    }

    /*
    Test 6:
    Al errar 3 veces para abrir la caja fuerte se bloqueara la caja en si.
    */
    @Test
    public void laCajaSeBloqueAlErrar3Veces(){
        CajaFuerte caja = new CajaFuerte();
        caja.cerrar(1234);
        caja.abrir(2345);
        caja.abrir(2345);
        caja.abrir(2345);
        assertTrue(caja.estaBloqueado());
    }
}
