/**
 * Clase para probar el funcionamiento del código
 * @author Daniel Jurado UQ
 * @since 2023-09-13
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");
       
        Marca marca = new Marca("Diana", "www.Diana.com", "diana@gmail.co");
        Producto producto = new Producto("Arroz", LocalDate.of(2024, 5, 5), (float)2000, marca,TipoProducto.NACIONAL);

        assertEquals("Diana",marca.nombre());
        assertEquals("www.Diana.com",marca.web());
        assertEquals("diana@gmail.co", marca.mail());
        assertEquals("Arroz", producto.nombre());
        assertEquals( LocalDate.of(2024, 5, 5),producto.fechaVencimiento());
        assertEquals((float)2000,producto.precio());
        assertEquals( marca,producto.marca());
        assertEquals(TipoProducto.NACIONAL, producto.tipoProducto());

        LOG.info("Finalizando test datosCompletos");
    }

}
