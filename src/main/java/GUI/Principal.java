/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Modelo.Fachada;
import java.util.Scanner;

/**
 *
 * @author Ilerna 4.2.33
 */
public class Principal {
    Scanner sc = new Scanner(System.in);
  Fachada f = new Fachada();
  int llave=897;
    public void autenticar() {
        System.out.println("Introduce nombre"); 
    String nombre= sc.next();
        System.out.println("Introduce contraseña");
    String pass= sc.next();
    try {
   int llave = f.autenticar(nombre, pass);
        System.out.println(llave);
    Inicio();
    }catch (Exception ex) {
        System.out.println("Introduce los datos correctamente");}
    }
    public void Inicio() {
        int x = 0;
        do {
            System.out.println("Elije una opcion");
            System.out.println("1-Gestionar pedido");
            System.out.println("2-Gestionar pedido");
            System.out.println("3-Gestionar producto");
            System.out.println("4-Salir");
            x = sc.nextInt();
            switch (x) {
                case 1: {
                    int y = 0;
                    do {
                        System.out.println("Elije opción");
                        System.out.println("1-Alta empleado");
                        System.out.println("2-Modificar empleado");
                        System.out.println("3-Consultar empleado");
                        System.out.println("4-Salir");

                        y = sc.nextInt(); 

                        switch (y) {
                            case 1: {
                                
                                break;
                            }
                            case 2: {
                                break;
                            }
                            case 3: {
                                break;
                            }
                            case 4: {
                                break;
                            }
                            default: {
                                System.out.println("Opción no válida");
                                break;
                            }
                        }
                    } while (y != 4); 
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    System.out.println("Gracias por usar la app");
                    break;
                }
                default: {
                    System.out.println("Introduce un valor adecuado");
                    break;
                }
            }
        } while (x != 4); 
    }
}


