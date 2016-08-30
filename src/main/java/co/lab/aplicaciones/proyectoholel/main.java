/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.lab.aplicaciones.proyectoholel;

import co.lab.aplicaciones.proyectoholel.modelo.Hotel;
import co.lab.aplicaciones.proyectoholel.repository.HotelDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Esteban
 */
public class main {
    public static void main(String[] args) {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context");
      
      HotelDao hotelDao = context.getBean(HotelDao.class);
      
      Hotel hotel= new Hotel();
      
      hotel.setCodigoHotel(100);
      hotel.setNombre("La cascada");
      hotel.setDireccion("Calle Colombia");
      hotel.setCategoria("Categoria 5");
      hotel.setLocalidad("Medellin"); 
      
      hotelDao.save(hotel);
//      hotelDao.save(hotel);
//      hotelDao.save(hotel);
//      hotelDao.save(hotel);
//      hotelDao.save(hotel);
      
    }

}
