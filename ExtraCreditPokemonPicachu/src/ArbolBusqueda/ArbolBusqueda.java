/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArbolBusqueda;
import Arbol.*;

/**
 * **Clase ArbolBusqueda:**
 *
 * Esta clase implementa un árbol binario de búsqueda. Es una subclase de `ArbolBinario`
 * y hereda sus características básicas.
 *
 * @author Sergio Barrios
 */

public class ArbolBusqueda extends ArbolBinario {
    
    /**
     * Constructor por defecto. Crea un árbol de búsqueda vacío.
     */
    
    public ArbolBusqueda(){
        super();
    }
    
    /**
     * **Búsqueda:**
     *
     * Métodos para buscar un nodo en el árbol de búsqueda.
     */

    /**
     * Busca un nodo con el valor especificado en el árbol.
     *
     * @param buscado El valor del nodo que se busca.
     * @return El nodo encontrado o `null` si no se encuentra.
     */
    
    public Nodo buscar(Object buscado){
        Comparador dato;
        dato = (Comparador) buscado;
        
         // Si el árbol está vacío, no hay nada que buscar.
        
        if (raiz == null)
        {
        return null;
        
        // Inicia la búsqueda desde la raíz del árbol.
        
        }else{
            return localizar(raizArbol(), dato);
        }
        
    }
    
     /**
     * Busca un nodo con el valor especificado en el subárbol con la raíz dada.
     *
     * @param raizSub La raíz del subárbol donde se busca.
     * @param buscado El valor del nodo que se busca.
     * @return El nodo encontrado o `null` si no se encuentra.
     */ 
    
    protected Nodo localizar(Nodo raizSub, Comparador buscado){
        
        // Si el subárbol está vacío, el nodo no se encuentra.
        if (raizSub == null){
            return null;
        
         // Si el valor buscado es igual al valor del nodo actual, se ha encontrado.
        // buscar en el subárbol izquierdo.
        }else if (buscado.igualQue(raizSub.getDato())){
            return raiz;
        }else if (buscado.menorQue(raizSub.getDato())){
            return localizar(raizSub.subarbolIzdo(), buscado);
        
        // Si el valor buscado es mayor que el valor del nodo actual,
        // buscar en el subárbol derecho.
        }else{
            return localizar (raizSub.subarbolDcho(), buscado);
        }
        
    } 
    
    /**
     * **Inserción:**
     *
     * Métodos para insertar un nuevo nodo en el árbol de búsqueda.
     */

    /**
     * Inserta un nuevo nodo con el valor especificado en el árbol.
     *
     * @param valor El valor del nuevo nodo.
     * @throws Exception Si el valor ya existe en el árbol.
     */
    
    public void insertar (Object valor )throws Exception{
        Comparador dato;
        dato = (Comparador) valor;
        // Insertar el nuevo nodo de forma recursiva.
        raiz = insertar(raiz, dato);
    }

    /**
     * Inserta un nuevo nodo con el valor especificado en el subárbol con la raíz dada.
     *
     * @param raizSub La raíz del subárbol donde se inserta.
     * @param dato El valor del nuevo nodo.
     * @return La nueva raíz del subárbol.
     * @throws Exception Si el valor ya existe en el árbol.
     */
    
    protected Nodo insertar(Nodo raizSub, Comparador dato) throws Exception{
        // Si el subárbol está vacío, crea un nuevo nodo con el valor especificado.
    if (raizSub == null){
        raizSub = new Nodo(dato);
        
        // Si el valor a insertar es menor que el valor del nodo actual,
        // insertarlo en el subárbol izquierdo.
    }else if (dato.menorQue(raizSub.getDato())){
            Nodo iz;
            iz = insertar(raizSub.subarbolIzdo(), dato);
            raizSub.ramaIzdo(iz);
            
       // Si el valor a insertar es mayor que el valor del nodo actual,
        // insertarlo en el subárbol derecho.     
    }else if (dato.mayorQue(raizSub.getDato())){
            Nodo dr;
            dr = insertar(raizSub.subarbolDcho(), dato);
            raizSub.ramaDcho(dr);
    }else{
        throw new Exception("Nodo duplicado");
        }
    return raizSub;
    }
    
}
