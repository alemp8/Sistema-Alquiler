package sistemagestionempresa.Modelos.Entidades;

import java.math.BigDecimal;

/**
 *
 * @author Victor Alejandro
 */
public class Empleados {
        int idEmpleado ;
	String DNI ;
	String nombre ;
	BigDecimal salario ;
	String cuenta ;
	int idJornada ;
	int idPuesto ;
	int idSucursal ;

    public Empleados() {
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    public Empleados(int idEmpleado, String nombre, BigDecimal salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.salario = salario;
    }
        
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public int getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(int idJornada) {
        this.idJornada = idJornada;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }
        
        
}
