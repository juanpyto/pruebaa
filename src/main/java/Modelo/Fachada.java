/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ilerna 4.2.33
 */
public class Fachada {
   public int autenticar(String nombre, String pass) throws Exception{  
   return new gestionarempleado().introducirempleado(nombre, pass);}
}
