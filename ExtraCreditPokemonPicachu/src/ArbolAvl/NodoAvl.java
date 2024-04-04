
package ArbolAvl;
import Arbol.*;
import ArbolBusqueda.*;

/**
 * Esta clase representa un nodo de un árbol AVL. 
 * Extiende la clase `Nodo` (presumiblemente representando un nodo de árbol general)
 * y añade la propiedad `fe` para almacenar el factor de equilibrio del nodo.
 *
 * @author Sergio
 */

public class NodoAvl extends Nodo {
    
     /**
   * Factor de equilibrio del nodo.
   */
    int fe;
    
    /**
   * Constructor que crea un nuevo nodo con el valor especificado y sin hijos.
   *
   * @param valor El valor que se almacenará en el nodo.
   */
    public NodoAvl(Object valor){
        super(valor); // Llama al constructor de la clase padre (Nodo)
        fe = 0; // Inicializa el factor de equilibrio en 0
        
    }
    
    /**
   * Constructor que crea un nuevo nodo con el valor especificado y los hijos izquierdo y derecho.
   *
   * @param valor El valor que se almacenará en el nodo.
   * @param ramaIzdo El hijo izquierdo del nodo.
   * @param ramaDcho El hijo derecho del nodo.
   */
    
    public NodoAvl(Object valor, NodoAvl ramaIzdo, NodoAvl ramaDcho){
        super (ramaIzdo, valor, ramaDcho);
        fe = 0;
        
    }

    
}
