package pe.edu.idat.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "EncabezadoBoletaEntity")
@Table(name = "encabezado_boleta")
public class EncabezadoBoleta implements Serializable {

    @Id
    @Column(name = "codigo_boleta")
    private String codigo;

    @Column(name = "fecha_boleta")
    private String fecha;

    @Column(name = "estado_encabezado_boleta")
    private boolean estado;

    @ManyToOne
    @JoinColumn(name = "codigo_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "codigo_empleado", nullable = false)
    private Empleado empleado;
}
