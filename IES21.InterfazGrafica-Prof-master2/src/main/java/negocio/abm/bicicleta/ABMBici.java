/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio.abm.bicicleta;
import modelo.Bicicleta.Bicicleta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Romancito
 */
public class ABMBici {
     public ArrayList<Bicicleta> bicicletas;

    public ABMBici() {
        this.bicicletas = new ArrayList<>();
    }

    // Alta de una bicicleta
    public void altaBicicleta(Bicicleta bicicleta) {
        if (!bicicletas.contains(bicicleta)) {
            bicicletas.add(bicicleta);
            System.out.println("Bicicleta añadida: " + bicicleta);
        } else {
            System.out.println("La bicicleta ya existe.");
        }
    }

    // Baja de una bicicleta
    public void bajaBicicleta(Bicicleta bicicleta) {
        if (bicicletas.remove(bicicleta)) {
            System.out.println("Bicicleta eliminada: " + bicicleta);
        } else {
            System.out.println("La bicicleta no se encontró.");
        }
    }

    // Modificar datos de una bicicleta
    public void modificarBicicleta(Bicicleta bicicletaOriginal, Bicicleta bicicletaModificada) {
        int index = bicicletas.indexOf(bicicletaOriginal);
        if (index != -1) {
            bicicletas.set(index, bicicletaModificada);
            System.out.println("Bicicleta modificada.");
        } else {
            System.out.println("La bicicleta original no se encontró.");
        }
    }

    // Listar bicicletas
    public void listarBicicletas() {
        for (Bicicleta bicicleta : bicicletas) {
            System.out.println(bicicleta);
        }
    }

    // Ordenar bicicletas por color 
    //Crea un Comparator que compara dos objetos Bicicleta basándose en el valor retornado por el método getColor
    //En orden Alfabetico
    public void ordenarPorColor() {
        //Ordena la lista bicicletas utilizando el comparador creado
        Collections.sort(bicicletas, Comparator.comparing(Bicicleta::getColor));
        System.out.println("Bicicletas ordenadas por color.");
        listarBicicletas();
    }

    //Comparing int compara los rodados y los ordena en orden ascendente
    // Ordenar bicicletas por rodado
    public void ordenarPorRodado() {
        Collections.sort(bicicletas, Comparator.comparingInt(Bicicleta::getRodado));
        System.out.println("Bicicletas ordenadas por rodado.");
        listarBicicletas();
    }
}
