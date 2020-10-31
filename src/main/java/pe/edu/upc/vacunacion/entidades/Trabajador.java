package pe.edu.upc.vacunacion.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Trabajador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;

    @NotBlank(message = "El Nombre no puede ser vacio")
    private String  nombre;
    @NotBlank(message = "El Apellido Paterno no puede ser vacio")
    private String  apellidoPaterno;
    @NotBlank(message = "El Apellido Materno no puede ser vacio")
    private String  apellifoMaterno;
    @NotBlank(message = "El DNI no puede ser vacio")
    private String  dni;
    @NotNull(message = "La Fecha de Nacimiento no puede ser vacio")
    private Date    fechaNacimiento;
    private char    sexo;
    private String  cargo;
    private BigDecimal sueldo;
    private Date fechaIngreso;
    private boolean activo;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellifoMaterno() {
        return apellifoMaterno;
    }

    public void setApellifoMaterno(String apellifoMaterno) {
        this.apellifoMaterno = apellifoMaterno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
