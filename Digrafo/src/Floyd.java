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
    public int[][] algoritmoFloyd(Grafo ciudad){
        int n = ciudad.getDimension();
        int[][] matriz = ciudad.matrizAdyacencia();
        
        for(int k = 0; k<n; k++){
            for(int i = 0; i<n; i++){
                for(int j=0; j<n; j++){
                    int aux = matriz[i][j];
                    int aux2 = matriz[i][k];
                    int aux3 = matriz[k][j];
                    int aux4 = aux2+aux3;
                    int res = Math.min(aux, aux4);
                    matriz[i][j] = res;
                }
            }
        }
        
        return matriz;
    }
    
}
