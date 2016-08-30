/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.lab.aplicaciones.proyectohotel.repository;

import co.lab.aplicaciones.proyectohotel.modelo.Hotel;
import static org.eclipse.persistence.config.ExclusiveConnectionMode.Transactional;
import static org.eclipse.persistence.sessions.server.ConnectionPolicy.ExclusiveMode.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class HotelDao {
    
    @Autowired
    
    private HotelRepository hotelrepository;
    @Transactional
    public Hotel save(Hotel h){
        if(h.getNombre()==null){
            throw new IllegalArgumentException("Ingrese Nombre Correcto");
        }
        if (hotelrepository!=null){
            System.out.println("Holaaaaa");
        }
        return hotelrepository.save(h);
    }
}
