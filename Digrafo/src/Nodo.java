/***********************************************
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Juan Jose Tzun Monterroso
 * Carnet; 13017;    Fecha: 03/11/2014
***********************************************/
import java.util.HashMap;

public class Nodo<T extends Comparable> {
    private HashMap<Integer, Conexion<T>> destinos;
    private T origen;
    
    public Nodo(T origen){
        this.origen = origen;
    }
    
    public Nodo(HashMap<Integer, Conexion<T>> destinos){
        this.destinos = destinos;
    }
    
    public HashMap<Integer, Conexion<T>> getDestinos(){
        return destinos;
    }
    
    public void eliminarDestino(T destino){
        for(int j = 0; j<destinos.size(); j++){
            if(destinos.get(j).getDestino().equals(destino)){
                destinos.remove(j);
            }
        }
    }
    
    public void agregarDestino(T destino, int valor){
        destinos.put(destinos.size(), new Conexion(destino, valor));
    }
    
    public T getOrigen(){
        return origen;
    }
    
    public void setOrigen(T origen){
        this.origen = origen;
    }
}
