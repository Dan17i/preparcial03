
package co.edu.uniquindio.poo;

import java.time.LocalDate;

public record Producto( String nombre, LocalDate fechaVencimiento, float precio, Marca marca, TipoProducto tipoProducto) {
    
}
