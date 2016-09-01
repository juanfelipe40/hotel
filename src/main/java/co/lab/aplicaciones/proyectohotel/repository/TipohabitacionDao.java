/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.lab.aplicaciones.proyectohotel.repository;

import co.lab.aplicaciones.proyectohotel.modelo.Tipohabitacion;
import static org.eclipse.persistence.config.ExclusiveConnectionMode.Transactional;
import static org.eclipse.persistence.sessions.server.ConnectionPolicy.ExclusiveMode.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TipohabitacionDao {
        
@Autowired
    
  private TipohabitacionRepository tipohabitacionrepository;
  @Transactional
   public Tipohabitacion save(Tipohabitacion t){
        if(t.getNumeroHabitaciones()==-1){
            throw new IllegalArgumentException("Ingrese Numero Correcto");
        }
        if (tipohabitacionrepository!=null){
            System.out.println("Holaa-tipo");
        }
        return tipohabitacionrepository.save(t);
    }
}
   
   

