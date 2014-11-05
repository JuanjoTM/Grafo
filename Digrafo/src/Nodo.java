/***********************************************
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Juan Jose Tzun Monterroso
 * Carnet; 13017;    Fecha: 03/11/2014
***********************************************/
import java.util.ArrayList;

public class Nodo<T extends Comparable> {
    //ATRIBUTOS
    private T nombre;
    private ArrayList[][]<T> vecinos;
    
    public Nodo(int dimension, T nombre){
        this.nombre = nombre;
        vecinos = new ArrayList[dimension][2];
    }
    
    public void agregarConexion(T valor, T vecino){s
        
    }
}