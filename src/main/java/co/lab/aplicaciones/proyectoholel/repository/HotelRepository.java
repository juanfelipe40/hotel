/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.lab.aplicaciones.proyectoholel.repository;

import co.lab.aplicaciones.proyectoholel.modelo.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sala401
 */
public interface HotelRepository extends JpaRepository <Hotel,Integer> {
    
    
}
