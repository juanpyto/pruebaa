/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BBDD;

/**
 *
 * @author Ilerna 4.2.33
 */
public class empleado {
    String nombre, pass;
    int codacceso;

    @Override
    public String toString() {
        return "empleado{" + "nombre=" + nombre + ", pass=" + pass + ", codacceso=" + codacceso + '}';
    }

    public empleado() {
    }

    public empleado(String nombre, String pass, int codacceso) {
        this.nombre = nombre;
        this.pass = pass;
        this.codacceso = codacceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getCodacceso() {
        return codacceso;
    }

    public void setCodacceso(int codacceso) {
        this.codacceso = codacceso;
    }
    
    
}
