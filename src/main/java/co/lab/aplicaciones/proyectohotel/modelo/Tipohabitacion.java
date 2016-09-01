package co.lab.aplicaciones.proyectohotel.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Tipo_habitacion")
public class Tipohabitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo_Habitacion")
    private int codigoHabitacion;

    @Column(name = "Numero_Habitaciones")
    private int numeroHabitaciones;

    @Column(name = "Capacidad_max")
    private int capacidadMax;

    @Column(name = "Precio_noche")
    private int precioNoche;

    @ManyToOne
    @JoinColumn(name = "codigoHotel")
    private Hotel hotel;

    public int getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(int codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(int precioNoche) {
        this.precioNoche = precioNoche;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel Hotel) {
        this.hotel = Hotel;
    }

}
