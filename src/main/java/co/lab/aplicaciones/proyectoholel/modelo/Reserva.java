/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.lab.aplicaciones.proyectoholel.modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Esteban
 */

@Entity
@Table(name = "Reserva")
public class Reserva {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "Codigo_reserva")
    private int codigoReserva; 
    
    @Column (name = "Fecha_Entrada")
    private Date fechaEntrada;
    
    @Column (name = "Fecha_Salida")
    private Date fechaSalida;
    
    @Column (name = "Numero_Ocupantes")
    private Date numeroOcupantes;
    
    @Column (name = "Numero_Habitaciones")
    private Date numeroHabitaciones;
    
    private Cliente cliente;
    
    private Hotel hotel;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
    

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getNumeroOcupantes() {
        return numeroOcupantes;
    }

    public void setNumeroOcupantes(Date numeroOcupantes) {
        this.numeroOcupantes = numeroOcupantes;
    }

    public Date getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Date numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    
            
}  
