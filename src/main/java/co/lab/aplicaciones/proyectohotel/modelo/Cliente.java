/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.lab.aplicaciones.proyectohotel.modelo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Esteban
 */
@Entity
@Table(name = "cliente")
public class Cliente {
    
    @Id
    @Column (name = "Nit")
    private int nit;
    
    @Column (name = "Nombre")
    private String nombre;
    
    @Column (name = "Apellido")
    private String apellido;
    
    @Column (name = "Telefono")
    private String telefono;
    
    @Column (name = "Celular")
    private String celular;
    
    @Column (name = "Domicilio")
    private String domicilio;
    
    @Column (name = "Correo")
    private String correo;
   
    //private List<Reserva> reservas;

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //public List<Reserva> getReservas() {
      //  return reservas;
    //}

    //public void setReservas(List<Reserva> reservas) {
      //  this.reservas = reservas;
        //comentario
        //otrocomentario
    //}

    
     
   
    
    
    
}
