/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.lab.aplicaciones.proyectohotel.repository;

import co.lab.aplicaciones.proyectohotel.modelo.Cliente;
import static org.eclipse.persistence.config.ExclusiveConnectionMode.Transactional;
import static org.eclipse.persistence.sessions.server.ConnectionPolicy.ExclusiveMode.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class ClienteDao {
     @Autowired
    
    private ClienteRepository clienterepository;
    @Transactional
    public Cliente save(Cliente c){
        if(c.getNombre()==null){
            throw new IllegalArgumentException("Ingrese Nombre Correcto");
        }
        if (clienterepository!=null){
            System.out.println("Holaa-cliente");
        }
        return clienterepository.save(c);
    }
}
    

