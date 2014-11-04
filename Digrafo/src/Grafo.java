/***********************************************
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Juan Jose Tzun Monterroso
 * Carnet; 13017;    Fecha: 03/11/2014
***********************************************/
import java.util.ArrayList;

public class Grafo<T extends Comparable> {
    //ATRIBUTOS
    private ArrayList<Nodo> nodos;
    private Nodo<T> centro;
    
    //METODOS
    public Grafo(){
    }
    
    //Elimina una conexion entre dos nodos
    public void eliminarConexion(T destino, T origen){
        for(int i = 0; i<nodos.size(); i++){
            if(nodos.get(i).getOrigen().equals(origen)){
                nodos.get(i).eliminarDestino(destino);
            }
        }
    }
    
    //Establece una conexion entre dos nodos
    public void agregarConexion(T destino, T origen, int valor){
        for(int i = 0; i<nodos.size(); i++){
            if(nodos.get(i).getOrigen().equals(origen)){
                nodos.get(i).agregarDestino(destino, valor);
            }
        }
    }
    
    //Crea un nodo
    public void crearNodo(T origen){
        nodos.add(new Nodo(origen));
    }
    
    //Calcula el centro del grafo
    public void centroGrafo(ArrayList matrizAdyacencia){
    
    }
    
    public ArrayList<Nodo> getNodos(){
        return nodos;
    }
}
