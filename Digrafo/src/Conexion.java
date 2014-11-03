/***********************************************
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Juan Jose Tzun Monterroso
 * Carnet; 13017;    Fecha: 03/11/2014
***********************************************/

public class Conexion<T extends Comparable> {
    private T destino;
    private int valor;
    
    public Conexion(T destino, int valor){
        this.destino = destino;
        this.valor = valor;
    }
    
    public void setDestino(T destino){
        this.destino = destino;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public T getDestino(){
        return destino;
    }
    
    public int getValor(){
        return valor;
    }
}
