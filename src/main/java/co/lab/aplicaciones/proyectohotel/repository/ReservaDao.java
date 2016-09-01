/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.lab.aplicaciones.proyectohotel.repository;

import co.lab.aplicaciones.proyectohotel.modelo.Reserva;
import static org.eclipse.persistence.config.ExclusiveConnectionMode.Transactional;
import static org.eclipse.persistence.sessions.server.ConnectionPolicy.ExclusiveMode.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



 @Repository
 public class ReservaDao {
   /** 
    @Autowired
    
    private HotelRepository reservarepository;
    @Transactional
    public Reserva save(Reserva r){
        if(r.getFechaEntrada()==null){
            throw new IllegalArgumentException("Ingrese fecha Correcta");
        }
        if (reservarepository!=null){
            System.out.println("Holaa-reserva");
        }
       return reservarepository.save(r);
    
   
    }

 }

  */
 }


