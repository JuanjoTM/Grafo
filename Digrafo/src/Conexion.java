/***********************************************
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Juan Jose Tzun Monterroso
 * Carnet; 13017;    Fecha: 03/11/2014
***********************************************/

public class Conexion<T extends Comparable> {
    //ATRIBUTOS
    private T destino;
    private int valor;
    
    //METODOS
    public Conexion(T destino, int valor){
        this.destino = destino;
        this.valor = valor;
    }
    
    //Cambia el destino
    public void setDestino(T destino){
        this.destino = destino;
    }
    
    //Cambia el valor
    public void setValor(int valor){
        this.valor = valor;
    }
    
    //Obtiene el destino
    public T getDestino(){
        return destino;
    }
    
    //Obtiene el valor
    public int getValor(){
        return valor;
    }
}
