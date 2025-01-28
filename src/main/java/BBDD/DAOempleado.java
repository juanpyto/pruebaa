/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BBDD;

import java.util.ArrayList;

/**
 *
 * @author Ilerna 4.2.33
 */
public class DAOempleado {
    empleado pepe= null;
    ArrayList<empleado> listaempleado = new ArrayList();
     private static final DAOempleado INSTANCE = new DAOempleado(); 

    private DAOempleado() {
         listaempleado.add(new empleado("pepe", "pepe",1)); 
    }
    public static DAOempleado getInstance() {
        return INSTANCE;
    }

    public ArrayList<empleado> getListaempleado() {
        return listaempleado;
    }

    public void setListaempleado(ArrayList<empleado> listaempleado) {
        this.listaempleado = listaempleado;
    }
    public empleado getempleado(String nombre){ 
    for(empleado e: listaempleado){
        if(e.getNombre().equals(nombre)){
            pepe=e;
        }
    }
    return pepe;
    }
}

