/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.util.ArrayList;
import modelo.persona.Persona;
import util.coleccion.ArrayListPersona;

/**
 *
 * @author Alumno
 */
public abstract class RepositorioDeDatos {
    
    private static final int CANTIDAD_PERSONA_MAXIMA=10;
    public static int indice=0;
    public static Persona[]personas=new Persona[CANTIDAD_PERSONA_MAXIMA];
    
    public static ArrayListPersona<Persona> arrPersonas= new ArrayListPersona<Persona>();
}
