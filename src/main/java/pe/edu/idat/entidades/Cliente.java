
package pe.edu.idat.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "ClienteEntity")
@Table(name = "cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codigo_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nombres_cliente")
    private String nombres;

    @Column(name = "apellidopaterno_cliente")
    private String apellido_paterno;

    @Column(name = "apellidomaterno_cliente")
    private String apellido_materno;

    @Column(name = "genero_cliente")
    private String genero;

    @Column(name = "correo_cliente")
    private String correo;

    @Column(name = "fechanacimiento_cliente")
    private String fecha_nacimiento;

    @Column(name = "estado_cliente")
    private boolean estado;
}
