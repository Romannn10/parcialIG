/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.abm.vendedor;

import modelo.cliente.Cliente;
import modelo.vendedor.Vendedor;
import modelo.persona.Persona;
import repositorio.RepositorioDeDatos;


/**
 *
 * @author Alumno
 */
public class ABMVendedor {
       public void altaVendedor(Persona persona){
           Vendedor ven = (Vendedor)persona;
           if(existe(ven)){
               System.out.println("El Vendedor existe pa");
            }
           else{
               RepositorioDeDatos.arrPersonas.add(ven);
           }
       }
          private boolean existe(Vendedor ven){
        /*
        if(RepositorioDeDatos.arrPersonas.contains(cli))
            return true;
        return false;
        */
        return RepositorioDeDatos.arrPersonas.contains(ven);
    }
        public void modificarDatosVendedor(Persona persona) {
            Vendedor ven=(Vendedor)persona;
             
             if(existe(ven)){
              RepositorioDeDatos.arrPersonas.set(RepositorioDeDatos.arrPersonas.indexOf(ven), ven);
              }else
               System.out.println("El vendedor que intenta modificar no existe");          
             
    }
        public void bajaVendedor(Persona persona){
            Vendedor ven = (Vendedor)persona;
            if(ven != null){
                if(RepositorioDeDatos.arrPersonas.contains(ven)){
                    RepositorioDeDatos.arrPersonas.remove(RepositorioDeDatos.arrPersonas.indexOf(ven));
                }else{
                    System.out.println("El vendedor no existe");    
                          
                }
               
            }
        }
         public void listarVendedor(String tipo) {
        for (Persona persona : RepositorioDeDatos.arrPersonas) {
            System.out.println(((Vendedor)persona).toStringVendedor());
        }
    }

}
