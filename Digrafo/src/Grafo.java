/***********************************************
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Juan Jose Tzun Monterroso
 * Carnet; 13017;    Fecha: 03/11/2014
***********************************************/
import java.util.ArrayList;

public class Grafo<T extends Comparable> {
    private ArrayList<Nodo> nodos;
    private Nodo<T> centro;
    
    public Grafo(){
    }
    
    public void eliminarConexion(T destino, T origen){
        for(int i = 0; i<nodos.size(); i++){
            if(nodos.get(i).getOrigen().equals(origen)){
                nodos.get(i).eliminarDestino(destino);
            }
        }
    }
    
    public void agregarConexion(T destino, T origen, int valor){
        for(int i = 0; i<nodos.size(); i++){
            if(nodos.get(i).getOrigen().equals(origen)){
                nodos.get(i).agregarDestino(destino, valor);
            }
        }
    }
    
    public void crearNodo(T origen){
        nodos.add(new Nodo(origen));
    }
    
    public void centroGrafo(ArrayList matrizAdyacencia){
    
    }
}
