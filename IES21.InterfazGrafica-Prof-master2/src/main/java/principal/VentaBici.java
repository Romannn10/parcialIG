/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;

import modelo.cliente.Cliente;
import modelo.vendedor.Vendedor;
import negocio.abm.vendedor.ABMVendedor;
import negocio.abm.cliente.ABMCliente;
import repositorio.RepositorioDeDatos;
import modelo.Bicicleta.Bicicleta;
import negocio.abm.bicicleta.ABMBici;

/**
 *
 * @author Alumno
 */
public class VentaBici {
    
    private static ABMCliente aBMCliente = new ABMCliente();
    private static ABMBici abmBici = new ABMBici();
    
    public static void main(String[] args) {
        
        // Gestion de Clientes y Vendedores
        Cliente c1 = new Cliente("20-33521457-0", "JUAN", "PEREZ", 33521457, "3541521451", "jperez@gmail.com");
        Cliente c2 = new Cliente("20-35521787-0", "MARCOS", "GUTIERRE", 35521787, "3515236874", "mgutierre@gmail.com");
        Cliente c3 = new Cliente("20-35521785-0", "LORENA", "RAMOS", 35521785, "3515836874", "lramos@gmail.com");
        Vendedor v1 = new Vendedor("CENTRO", "VERONICA", "LOPEZ", 298785475, "3515326541", "vlopez@gmail.com");
        Vendedor v2 = new Vendedor("OESTE", "JULIAN", "SOSA", 398785475, "3515316541", "jsosa@gmail.com");
        
        // Alta de Clientes
        aBMCliente.altaPersonas(c1);
        aBMCliente.altaPersonas(c2);
        aBMCliente.altaPersonas(c3);
        
        // Listar Clientes
        System.out.println("Listado de Clientes:");
        aBMCliente.listarPersonass("");
        
        // Modificar Cliente
        Cliente cModificado = new Cliente("20-35521785-0", "LAURA", "RAMOS", 35521785, "3515836874", "lramos@gmail.com");
        aBMCliente.modificarDatosPersonas(c3, cModificado);
        
        System.out.println("\nListado de Clientes después de la modificación:");
        aBMCliente.listarPersonass("");
        
        // Baja de Cliente
        Cliente clienteEliminar = new Cliente();
        clienteEliminar.setDni(35521787);
        aBMCliente.bajaPersonas(clienteEliminar);
        
        System.out.println("\nListado de Clientes después de la baja:");
        aBMCliente.listarPersonass("");

        // Gestión de Bicicletas
        Bicicleta b1 = new Bicicleta("Rojo", 26, "Trek", 30000.0);
        Bicicleta b2 = new Bicicleta("Azul", 28, "Giant", 35000.0);
        Bicicleta b5 = new Bicicleta("Azul", 28, "Trek", 38000.0);
        Bicicleta b3 = new Bicicleta("Verde", 26, "Scott", 28000.0);
        Bicicleta b4 = new Bicicleta("Negro", 29, "Merida", 40000.0);
        
        // Alta de bicicletas
        abmBici.altaBicicleta(b1);
        abmBici.altaBicicleta(b2);
        abmBici.altaBicicleta(b3);
        abmBici.altaBicicleta(b4);
        abmBici.altaBicicleta(b5);

        // Listar bicicletas
        System.out.println("\nListado de bicicletas:");
        abmBici.listarBicicletas();

        // Ordenar por color
        System.out.println("\nBicicletas ordenadas por color:");
        abmBici.ordenarPorColor();

        // Ordenar por rodado
        System.out.println("\nBicicletas ordenadas por rodado:");
        abmBici.ordenarPorRodado();

        // Modificar bicicleta
        Bicicleta bModificada = new Bicicleta("Amarillo", 26, "Trek", 31000.0);
        abmBici.modificarBicicleta(b1, bModificada);

        System.out.println("\nListado de bicicletas después de la modificación:");
        abmBici.listarBicicletas();

        // Baja de una bicicleta
        abmBici.bajaBicicleta(b2);

        System.out.println("\nListado de bicicletas después de la baja:");
        
        abmBici.listarBicicletas();
        /*        ArrayList<Bicicleta> bicicletas =  abmBici.bicicletas;
        Iterator<Bicicleta> iterator = bicicletas.iterator();

        
while (iterator.hasNext()) {
    Bicicleta bici = iterator.next();
    if (bici.getColor().equals("Rojo")) {
        iterator.remove();  // Elimina la bicicleta de color "Rojo"
    }
}

        abmBici.listarBicicletas();
        System.out.println("bici roja puta:");
    }*/
    }
}

