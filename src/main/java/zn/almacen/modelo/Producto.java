package zn.almacen.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer producto_id;
    private Integer proveedor_id;
    private Integer codigo;
    private String producto;
    private String descrpcion;
    private String categoria;
    private Integer cantidad;
    private Double precio;
}
