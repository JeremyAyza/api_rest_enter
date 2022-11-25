package pe.edu.idat.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Entity(name = "EmpleadoEntity")
@Table(name = "empleado")
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codigo_empleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nombre_empleado")
    private String nombre;
    @Column(name = "direccion_empleado")
    private String direccion;
    @Column(name = "sueldo_empleado")
    private Double sueldo;
    @ManyToOne
    @JoinColumn(name = "codigo_rol", nullable = false)
    private Rol rol;
    @Column(name = "estado_empleado")
    private boolean estado;
}
