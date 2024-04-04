
package Arbol;

/**
 * **Clase ArbolBinario:**
 *
 * Esta clase representa un árbol binario genérico.
 *
 * @author Sergio
 */
public class ArbolBinario {
     /**
     * Tamaño del árbol (número de nodos).
     */   
    public int size;
    
    /**
     * **Acceso a la raíz:**
     *
     * Métodos para obtener y establecer la raíz del árbol.
     */

    /**
     * Devuelve la raíz del árbol.
     *
     * @return La raíz del árbol.
     */
    public Nodo getRaiz() {
        return raiz;
    }
     /**
     * Establece la raíz del árbol.
     *
     * @param raiz La nueva raíz del árbol.
     */
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    protected Nodo raiz;
    
    /**
     * Constructor por defecto. Crea un árbol binario vacío.
     */
    public ArbolBinario(){
        raiz = null;
        int tamanio;
    }
    /**
     * Constructor que inicializa el árbol con una raíz específica.
     *
     * @param raiz La raíz del árbol.
     */
    public ArbolBinario(Nodo raiz){
        this.raiz = raiz;
        size = 0;
	 	 }
    public Nodo raizArbol(){
        return raiz;
	 	 }
/**
     * **Comprobación del estado del árbol:**
     *
     * Métodos para comprobar si el árbol está vacío.
     */

    /**
     * Comprueba si el árbol está vacío.
     *
     * @return `true` si el árbol está vacío, `false` en caso contrario.
     */
    boolean esVacio(){
        return raiz == null;
	}
    
/**
     * **Creación de nodos y árboles:**
     *
     * Métodos para crear nuevos nodos y árboles.
     */

    /**
     * Crea un nuevo nodo con los hijos y el valor especificados.
     *
     * @param ramaIzqda El hijo izquierdo del nuevo nodo.
     * @param dato El valor del nuevo nodo.
     * @param ramaDrcha El hijo derecho del nuevo nodo.
     * @return El nuevo nodo creado.
     */
    public static Nodo nuevoArbol(Nodo ramaIzqda, Object dato, Nodo ramaDrcha){
        return new Nodo(ramaIzqda, dato, ramaDrcha);
    }

     /**
     * **Recorridos del árbol:**
     *
     * Métodos para realizar recorridos preorden, inorden y postorden del árbol.
     */

    /**
     * Recorre el árbol en preorden, visitando cada nodo.
     *
     * @param r La raíz del subárbol a recorrer.
     */
    public static void preorden(Nodo r){
        if (r != null)
	 {
            r.visitar();
            preorden (r.subarbolIzdo());
            preorden (r.subarbolDcho());
	 }
    }
/**
     * Recorre el árbol en inorden, visitando cada nodo.
     *
     * @param r La raíz del subárbol a recorrer.
     */
    public static void inorden(Nodo r){
        if (r != null)
	 {
            inorden (r.subarbolIzdo());
            r.visitar();
            inorden (r.subarbolDcho());
	 }
    }
/**
     * Recorre el árbol en postorden, visitando cada nodo.
     *
     * @param r La raíz del subárbol a recorrer.
     */
    public static void postorden(Nodo r){
    if (r != null)
	{
        postorden (r.subarbolIzdo());
        postorden (r.subarbolDcho());
        r.visitar();
	}
    }
    
    /**
     * **Inserción de nodos:**
     *
     * Métodos para insertar un nuevo nodo en el árbol.
     */
    public void insertarEnRaiz(Object objeto) throws Exception {
    // Convertir el objeto a un Nodo
        Nodo nodo = new Nodo(objeto);

    // Si el árbol está vacío, el nodo se convierte en la raíz
        if (raiz == null) {
            raiz = nodo;
            size++;
        } else {
        // Crear un nuevo nodo que será la nueva raíz
            Nodo nuevaRaiz = new Nodo(raiz.getDato());
            nuevaRaiz.izdo = raiz;
            size++;
        // Insertar el nodo como hijo izquierdo de la nueva raíz
            nuevaRaiz.dcho = nodo;

        // Reemplazar la raíz por la nueva raíz
            raiz = nuevaRaiz;
    }
}




}

