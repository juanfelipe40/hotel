/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.lab.aplicaciones.proyectohotel.modelo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author Esteban
 */

@Entity
@Table(name = "hotel")
public class Hotel {   
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Column(name = "Codigo_Hotel")
    private int codigoHotel;

    @Column(name = "Nombre")
    private String nombre;
    
    @Column(name = "Direccion")
    private String direccion;
    
    @Column(name = "Categoria")
    private String categoria;
    
    @Column(name = "Localidad")
    private String localidad;
    
    //private List<Tipohabitacion> tipoHabitaciones;
    
    //private List<Reserva> reservas;

    public int getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(int codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    //public List<Tipohabitacion> getTipoHabitaciones() {
      //  return tipoHabitaciones;
    //}

    //public void setTipoHabitaciones(List<Tipohabitacion> tipoHabitaciones) {
      //  this.tipoHabitaciones = tipoHabitaciones;
    //}

    //public List<Reserva> getReservas() {
      //  return reservas;
    //}

    //public void setReservas(List<Reserva> reservas) {
      //  this.reservas = reservas;
    //}

  
    
    
}
