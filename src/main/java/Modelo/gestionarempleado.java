/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import BBDD.empleado;
import BBDD.fachadaBBDD;

/**
 *
 * @author Ilerna 4.2.33
 */
public class gestionarempleado {
    public int introducirempleado(String nombre, String pass) throws Exception{
      empleado pepe =  new fachadaBBDD().getempleado(nombre);
      if(pepe!=null){
          if(!pepe.getPass().equals(pass)){
       throw new Exception("La contraseña es incorrecta");   
      }
      }else{throw new Exception("no existe ese empleado");
      }
    return 2;}

}
