/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;

import modelo.cliente.Cliente;
import modelo.vendedor.Vendedor;
import negocio.abm.vendedor.ABMVendedor;
import negocio.abm.cliente.ABMCliente;
import repositorio.RepositorioDeDatos;

/**
 *
 * @author Alumno
 */
public class VentaBici {
    
    private static ABMCliente aBMCliente= new ABMCliente();
    
    public static void main(String[] args) {
        /*
        Cliente c1=new Cliente("20-33521457-0","JUAN", "PEREZ", 33521457, "3541521451","jperez@gmail.com");
        RepositorioDeDatos.personas[0]=c1;
        Cliente c2=new Cliente("20-35521787-0","MARCOS", "GUTIERRE", 35521787, "3515236874","mgutierre@gmail.com");
        RepositorioDeDatos.personas[1]=c2;
        Vendedor v1= new Vendedor( "CENTRO","VERONICA", "LOPEZ", 298785475, "3515326541", "vlopez@gmail.com");
        RepositorioDeDatos.personas[2]=v1;
        Cliente c3=new Cliente("20-35521785-0","LORENA", "RAMOS",35521785, "3515836874","lramos@gmail.com");
        RepositorioDeDatos.personas[3]=c3;
        Vendedor v2= new Vendedor( "OESTE","JULIAN", "SOSA", 398785475, "3515316541", "jsosa@gmail.com");
        RepositorioDeDatos.personas[4]=v2;
      
        
        System.out.println("Listar Clientes");
        int indice=0;
        while(indice<RepositorioDeDatos.personas.length-1){
            if(RepositorioDeDatos.personas[indice]!=null && RepositorioDeDatos.personas[indice] instanceof Cliente)
                System.out.println(((Cliente)RepositorioDeDatos.personas[indice]).toStringCliente());
            indice++;
        }
       
        System.out.println("Listar VEndedores");
        */

       /* Cliente c1=new Cliente("20-33521457-0","JUAN", "PEREZ", 33521457, "3541521451","jperez@gmail.com");
        aBMCliente.altaPersonas(c1);
        Cliente c2=new Cliente("20-35521787-0","MARCOS", "GUTIERRE", 35521787, "3515236874","mgutierre@gmail.com");
        aBMCliente.altaPersonas(c2);
        Vendedor v1= new Vendedor( "CENTRO","VERONICA", "LOPEZ", 298785475, "3515326541", "vlopez@gmail.com");
        //RepositorioDeDatos.personas[2]=v1;
        Cliente c3=new Cliente("20-35521785-0","LORENA", "RAMOS",35521785, "3515836874","lramos@gmail.com");
        aBMCliente.altaPersonas(c3);
        System.out.println("Listado Sin Modificaciòn");
        aBMCliente.listarPersonass("");
        Cliente c4=new Cliente("20-35521785-0","LAURA", "RAMOS",35521785, "3515836874","lramos@gmail.com");
        aBMCliente.modificarDatosPersonas(c4);
        //RepositorioDeDatos.personas[3]=c3;
        //Vendedor v2= new Vendedor( "OESTE","JULIAN", "SOSA", 398785475, "3515316541", "jsosa@gmail.com");
        //RepositorioDeDatos.personas[4]=v2;
        System.out.println("Listado con Modificaciòn");
        aBMCliente.listarPersonass("");
        Cliente clienteEliminar=new Cliente();
        clienteEliminar.setDni(35521787);
        aBMCliente.bajaPersonas(clienteEliminar);
        
        System.out.println("Listado con con baja");
        aBMCliente.listarPersonass("");
        
       Cliente c5=new Cliente("20-33521457-0","PABLO", "FERRERA", 33521457, "3541521451","fferreyra@gmail.com");
       
      aBMCliente.modificarDatosPersonas(c1, c5);
      
      System.out.println("Listado con modificacio sobrecarga 2 parametros en mopdificar");
      aBMCliente.listarPersonass("");
      */
      
      ABMVendedor claseDeABM = new ABMVendedor();
        Vendedor v2= new Vendedor( "OESTE","JULIAN", "SOSA", 398785475, "3515316541", "jsosa@gmail.com");
         claseDeABM.altaVendedor(v2);
       
        Vendedor v3= new Vendedor( "OESTE","JULIAN", "SOSA", 498785475, "3515316541", "jsosaasda@gmail.com");
        claseDeABM.altaVendedor(v3);
       
        
        
       
        
        claseDeABM.listarVendedor("asd");
    }
}
