
import java.util.ArrayList;
import java.util.HashMap;

/***********************************************
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Juan Jose Tzun Monterroso
 * Carnet; 13017;    Fecha: 03/11/2014
***********************************************/
public class Floyd<T extends Comparable> {
    public Floyd(){
    }
    
    //Implementación del algoritmo Floyd
    public ArrayList algoritmoFloyd(Grafo digrafo){
        construirAdyacencia(digrafo);
        return new ArrayList();
    }
    
    //Construyendo la matriz de adyacencia
    private String[][] construirAdyacencia(Grafo digrafo){
        //Etiquetas de destinos
        ArrayList<Nodo> Nodes = digrafo.getNodos();
        String[][] adyacencia = new String[Nodes.size()][Nodes.size()];
        T[] nodeNames = null;
        for(int i = 0; i < Nodes.size(); i++){
            nodeNames[i] = (T)Nodes.get(i).getOrigen();
        }
        
        for(int i = 0; i < Nodes.size(); i++){
            HashMap<Integer, Conexion<T>> destinos = Nodes.get(i).getDestinos();
            adyacencia[i][i] = "0";
            for(int j = 0; j < destinos.size(); j++){
                for(int k = 0; k < Nodes.size(); k++){
                    if(destinos.get(j).getDestino().equals(nodeNames[k])){
                        adyacencia[i][k] = destinos.get(j).getValor()+"";
                    }
                }
            }
        }
        return adyacencia;
    }
    
}
