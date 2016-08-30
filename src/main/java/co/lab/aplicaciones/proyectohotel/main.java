/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.lab.aplicaciones.proyectohotel;

import co.lab.aplicaciones.proyectohotel.modelo.Hotel;
import co.lab.aplicaciones.proyectohotel.repository.HotelDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Esteban
 */
public class main {
    public static void main(String[] args) {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
      
      HotelDao hotelDao = context.getBean(HotelDao.class);
      
      Hotel hotel= new Hotel();
      
      hotel.setNombre("La Terraza");
      hotel.setDireccion("Calle Ayacucho");
      hotel.setCategoria("Categoria 3");
      hotel.setLocalidad("Medellin"); 
      
      hotelDao.save(hotel);
      //hotelDao.save(hotel);
    }

}
