/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.abm.cliente;

import java.util.ArrayList;
import modelo.cliente.Cliente;
import modelo.persona.Persona;
import repositorio.RepositorioDeDatos;

/**
 *
 * @author Alumno
 */
public class ABMCliente implements IABMPersona{

    @Override
    public void altaPersona(Persona persona) {
        if(!existe(persona.getDni())){
            RepositorioDeDatos.personas[RepositorioDeDatos.indice]=(Cliente)persona;
            RepositorioDeDatos.indice++;
        }else
            System.out.println("El Cliente ya Existe");
    }

    @Override
    public void bajaPersona(Persona persona) {
       
    }

    @Override
    public void modificarDatosPersona(Persona persona) {
       
    }
    
    private boolean existe(int dni){
        for (Persona persona : RepositorioDeDatos.personas) {
            if(persona.getDni()==dni)
                return true;
        }
        return false;
    }
    
    private boolean existe(Cliente cli){
        /*
        if(RepositorioDeDatos.arrPersonas.contains(cli))
            return true;
        return false;
        */
        return RepositorioDeDatos.arrPersonas.contains(cli);
    }
    
    @Override
    public void listarPersonas(String tipo) {
       int indice=0;
        while(indice<RepositorioDeDatos.personas.length-1){
            if(RepositorioDeDatos.personas[indice]!=null && RepositorioDeDatos.personas[indice] instanceof Cliente)
                System.out.println(((Cliente)RepositorioDeDatos.personas[indice]).toStringCliente());
            indice++;
        }
    }

    @Override
    public void altaPersonas(Persona persona) {
       Cliente cliente=(Cliente)persona;
       if(cliente!=null){
           if(!existe(cliente))
               RepositorioDeDatos.arrPersonas.add(cliente);
           else
               System.out.println("El cliente ya existe");
       }else
            System.out.println("El cliemnte no puede ser nulo");
    }

    @Override
    public void bajaPersonas(Persona persona) {
       Cliente cliente=(Cliente)persona;
       if(cliente!=null){
           /*
           if(RepositorioDeDatos.arrPersonas.remove(cliente))
               System.out.println("El cliente fue eliminado con exito");
           */
            Cliente clieste2=(Cliente)RepositorioDeDatos.arrPersonas
                    .remove(RepositorioDeDatos.arrPersonas.indexOf(cliente));
            if(clieste2!=null)
                System.out.println("El Cliente: "+clieste2.getDni()+ " Fue eliominado con exito");
       }else
            System.out.println("El cliente a eliminar no puede ser nulo");
    }

    @Override
    public void modificarDatosPersonas(Persona persona) {
       Cliente cliente=(Cliente)persona;
       if(cliente!=null){
           if(existe(cliente)){
              RepositorioDeDatos.arrPersonas.set(RepositorioDeDatos.arrPersonas.indexOf(cliente), cliente);
           }else
               System.out.println("El cliente que intenta modificar no existe");          
       }else
            System.out.println("El cliente a eliminar no puede ser nulo");
    }

    @Override
    public void modificarDatosPersonas(Persona perOriginal, Persona perUpdate) {
       Cliente cliente=(Cliente)perOriginal;
       if(cliente!=null){
           if(existe(cliente)){
              RepositorioDeDatos.arrPersonas.remove(cliente);
              RepositorioDeDatos.arrPersonas.add((Cliente)perUpdate);
               System.out.println("El cliente Se actualizo de forma cortrecta");
           }else
               System.out.println("El cliente que intenta modificar no existe");
       }else
            System.out.println("El cliente a eliminar no puede ser nulo"); 
    }
    
    @Override
    public void listarPersonass(String tipo) {
        for (Persona persona : RepositorioDeDatos.arrPersonas) {
            System.out.println(((Cliente)persona).toStringCliente());
        }
    }
}
