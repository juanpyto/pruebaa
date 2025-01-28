/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BBDD;

/**
 *
 * @author Ilerna 4.2.33
 */
public class fachadaBBDD {
    public empleado getempleado(String nombre){
    return DAOempleado.getInstance().getempleado(nombre);
 }
}
