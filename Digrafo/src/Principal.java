import java.util.ArrayList;

/***********************************************
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Juan Jose Tzun Monterroso
 * Carnet; 13017;    Fecha: 05/11/2014
***********************************************/
import java.io.*;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) throws IOException{
        //Leyendo el archivo
        File textFile = new File("files/texto.txt");
        BufferedReader textreader;
        
        //Comprobando que el archivo existe
        if(textFile.isFile()) {
            // Leer archivos
            try
            {
                textreader = new BufferedReader(new FileReader(textFile));
            }
            catch (Exception ex)
            {
                System.out.println("Error al leer!");
                return;
            }
            
            //Empezando a leer linea por linea
            String line = null;
            ArrayList<String> lineas = new ArrayList();
            
            line = textreader.readLine();
            while(line!=null){
                lineas.add(line);
                line = textreader.readLine();
            }
            textreader.close();
            
            //Creando los nodos y el grafo
            int dimension = Integer.parseInt(lineas.get(0));
            //System.out.println("Dimension = "+dimension);
            ArrayList<String> ciudades = new ArrayList();
            for(int i=1; i<=dimension; i++){
                ciudades.add(lineas.get(i));
            }
            Grafo<String> guatemala = new Grafo(dimension, ciudades);
            
            //Creando los arcos
            for(int i=11; i<lineas.size(); i++){
                String[] arco = lineas.get(i).split(" ");
                guatemala.agregarArco(arco[0], arco[1], Integer.parseInt(arco[2]));
            }
            
            //Algoritmo de Floyd
            Floyd floyd = new Floyd();
            int[][] matrizFloyd = floyd.algoritmoFloyd(guatemala);
            
            //Imprimiendo matriz de floyd
            System.out.println("\nLos caminos mas cortos son:");
            for(int i=0; i<guatemala.getDimension(); i++){
                for(int j=0; j<guatemala.getDimension(); j++){
                    System.out.print(matrizFloyd[i][j]+", ");
                }
                System.out.println();
            }
            
            //Matriz de Adyacencia
            int[][] matrizAdyacencia = guatemala.matrizAdyacencia();
            
            //Imprimiendo matriz de adyacencia
            System.out.println("\nLa matriz de adyacencia del grafo es:");
            for(int i=0; i<guatemala.getDimension(); i++){
                for(int j=0; j<guatemala.getDimension(); j++){
                    System.out.print(matrizAdyacencia[i][j]+", ");
                }
                System.out.println();
            }
            
            //Centro del grafo
            guatemala.calcularCentro(matrizFloyd);
            Nodo<String> centroGrafo = guatemala.getCentro();
            
            //Imprimiendo el centro del grafo
            System.out.println("\nCentro del grafo = "+centroGrafo.getNombre());
            
            //Preguntando al usuario la ciudad origen y destino
            Scanner ingreso = new Scanner(System.in);
            System.out.println("\n********************   RUTA MAS CORTA   ********************");
            System.out.print("Ciudad origen: ");
            String origen = ingreso.next();
            System.out.print("Ciudad destino: ");
            String destino = ingreso.next();
            
            //Creando las rutas mas cortas con floyd y mostrando el resultado
            String resultado = floyd.algoritmoFloydPares(guatemala, origen, destino);
            System.out.print(resultado);
            
            //Creando una nueva conexion entre ciudades
            System.out.println("\n********************MODIFICACION DE GRAFO********************");
            System.out.println("********************  CREANDO CONEXION********************");
            System.out.print("Ciudad origen: ");
            origen = ingreso.next();
            System.out.print("Ciudad destino: ");
            destino = ingreso.next();
            System.out.print("Distancia: ");
            int distancia = ingreso.nextInt();
            
            //Llamando al metodo que establece la conexion
            guatemala.agregarArco(origen, destino, distancia);

            //Calculando de nuevo el centro del grafo
            matrizAdyacencia = guatemala.matrizAdyacencia();
            matrizFloyd = floyd.algoritmoFloyd(guatemala);
            guatemala.calcularCentro(matrizFloyd);
            centroGrafo = guatemala.getCentro();
            System.out.println("\nNuevo centro del grafo = "+centroGrafo.getNombre());
            
        }else
            System.out.println("No encuentro los archivos");
        
    }
}
