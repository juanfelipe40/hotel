/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.lab.aplicaciones.proyectohotel.repository;

import co.lab.aplicaciones.proyectohotel.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepository extends JpaRepository <Cliente,Integer>{
    
}
