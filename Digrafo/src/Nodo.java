/***********************************************
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Juan Jose Tzun Monterroso
 * Carnet; 13017;    Fecha: 03/11/2014
***********************************************/
import java.util.HashMap;

public class Nodo<T extends Comparable> {
    //ATRIBUTOS
    private HashMap<Integer, Conexion<T>> destinos;
    private T origen;
    
    //METODOS
    public Nodo(T origen){
        this.origen = origen;
    }
    
    public Nodo(HashMap<Integer, Conexion<T>> destinos){
        this.destinos = destinos;
    }
    
    //Obtiene una lista de destinos
    public HashMap<Integer, Conexion<T>> getDestinos(){
        return destinos;
    }
    
    //Elimina un destino
    public void eliminarDestino(T destino){
        for(int j = 0; j<destinos.size(); j++){
            if(destinos.get(j).getDestino().equals(destino)){
                destinos.remove(j);
            }
        }
    }
    
    //Agrega un destino
    public void agregarDestino(T destino, int valor){
        destinos.put(destinos.size(), new Conexion(destino, valor));
    }
    
    //Obtiene el nombre del nodo
    public T getOrigen(){
        return origen;
    }
    
    //Cambia el nombre del nodo
    public void setOrigen(T origen){
        this.origen = origen;
    }
}
