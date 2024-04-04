
package ArbolAvl;
import ArbolBusqueda.*;


/**
 * Esta clase representa un árbol AVL. Un árbol AVL es un árbol binario de búsqueda
 * auto-balanceado, donde la diferencia entre las alturas de los subárboles izquierdo y
 * derecho de cualquier nodo no es mayor que 1.
 *
 * @author Sergio
 */
public class ArbolAvl {
    
     /**
     * La raíz del árbol.
     */
    NodoAvl raiz;
    
     /**
     * Constructor por defecto. Crea un árbol AVL vacío.
     */
    public ArbolAvl(){
        raiz = null;
    }
     /**
     * Devuelve la raíz del árbol.
     *
     * @return La raíz del árbol.
     */
    public NodoAvl raizArbol (){
    return raiz;
    
    }
      /**
     * **Rotaciones:**
     *
     * Métodos privados para realizar rotaciones en el árbol AVL.
     */

    /**
     * Realiza una rotación simple a la derecha en el nodo `n`.
     *
     * @param n El nodo donde se realiza la rotación.
     * @param n1 El hijo izquierdo de `n`.
     * @return El nuevo nodo raíz después de la rotación.
     */
    private NodoAvl rotacionII(NodoAvl n, NodoAvl n1){
        // Intercambia los subárboles izquierdo y derecho de `n`.
        n.ramaIzdo(n1.subarbolDcho());
        n1.ramaDcho(n);
        
        // Actualiza los factores de equilibrio de `n` y `n1`.
        if (n1.fe == -1) // se cumple en la inserción
        {
            n.fe = 0;
            n1.fe = 0;
        }
        else
        {
            n.fe = -1;
            n1.fe = 1;
        }
        // Devuelve `n1` como el nuevo nodo raíz.
        return n1;
    }
    /**
     * Realiza una rotación simple a la izquierda en el nodo `n`.
     *
     * @param n El nodo donde se realiza la rotación.
     * @param n1 El hijo derecho de `n`.
     * @return El nuevo nodo raíz después de la rotación.
     */
    
    private NodoAvl rotacionDD(NodoAvl n, NodoAvl n1){
        // Intercambia los subárboles derecho e izquierdo de `n`.
        n.ramaDcho(n1.subarbolIzdo());
        n1.ramaIzdo(n);
        
         // Actualiza los factores de equilibrio de `n` y `n1`
        if (n1.fe == +1) // se cumple en la inserción
        {
            n.fe = 0;
            n1.fe = 0;
        }
        else
        {
            n.fe = +1;
            n1.fe = -1;
        }
        // Devuelve `n1` como el nuevo nodo raíz.
        return n1;
    }
    
     /**
     * Realiza una rotación doble a la derecha en el nodo `n`.
     *
     * @param n El nodo donde se realiza la rotación.
     * @param n1 El hijo izquierdo de `n`.
     * @return El nuevo nodo raíz después de la rotación.
     */
    private NodoAvl rotacionID(NodoAvl n, NodoAvl n1){
        NodoAvl n2;
        // Intercambia los subárboles derecho e izquierdo de `n1`.
        n2 = (NodoAvl) n1.subarbolDcho();
        n.ramaIzdo(n2.subarbolDcho());
        n2.ramaDcho(n);
        n1.ramaDcho(n2.subarbolIzdo());
        n2.ramaIzdo(n1);
        
        // Actualiza los factores de equilibrio de `n`, `n1` y `n2`.
        if (n2.fe == +1)
        {
            n1.fe = -1;
        }
        else
        {
            n1.fe = 0;
        }
        if (n2.fe == -1)
        {
            n.fe = 1;
        }

        else
        {    
            n.fe = 0;
        }
        n2.fe = 0;
        
        // Devuelve `n2`
        return n2;
    
    }
    /**
 * Realiza una rotación doble a la izquierda en el nodo `n`.
 *
 * @param n El nodo donde se realiza la rotación.
 * @param n1 El hijo izquierdo de `n`.
 * @return El nuevo nodo raíz después de la rotación.
 */
    
    private NodoAvl rotacionDI(NodoAvl n, NodoAvl n1){
        NodoAvl n2;
        // Intercambia los subárboles izquierdo e derecho de `n1`.
        n2 = (NodoAvl)n1.subarbolIzdo();
        n.ramaDcho(n2.subarbolIzdo());
        n2.ramaIzdo(n);
        n1.ramaIzdo(n2.subarbolDcho());
        n2.ramaDcho(n1);
        
            // Actualiza los factores de equilibrio de `n`, `n1` y `n2`.
 
        if (n2.fe == +1){
            n.fe = -1;
        }
        else{
           n.fe = 0; 
        }
        if (n2.fe == -1){
             n1.fe = 1;
        }
        else{
             n1.fe = 0;
        }
        n2.fe = 0;
        
        // Devuelve `n2` como el nuevo nodo raíz.
        return n2;
    }
    
    /**
 * **Inserción:**
 *
 * Métodos para insertar un nuevo nodo en el árbol AVL.
 */

/**
 * Inserta un nuevo nodo en el árbol con el valor especificado.
 *
 * @param valor El valor del nuevo nodo.
 * @throws Exception Si el valor ya existe en el árbol.
 */
    
    public void insertar (Object valor)throws Exception{
        Comparador dato;
        Logical h = new Logical(false); // Bandera para indicar si se ha modificado el balance del árbol
        
        // Convertir el valor a un objeto `Comparador`.
        dato = (Comparador) valor;
        
        // Insertar el nuevo nodo de forma recursiva.
        raiz = insertarAvl(raiz, dato, h);
    }
    /**
 * Inserta un nuevo nodo en el árbol AVL de forma recursiva.
 *
 * @param raiz El nodo raíz del subárbol actual.
 * @param dt El valor del nuevo nodo.
 * @param h Bandera para indicar si se ha modificado el balance del árbol
 * @return El nuevo nodo raíz del subárbol.
 * @throws Exception Si el valor ya existe en el árbol.
 */
    private NodoAvl insertarAvl(NodoAvl raiz, Comparador dt, Logical h) throws Exception{
        NodoAvl n1;
        
         // Si el nodo raíz es nulo, crea un nuevo nodo con el valor especificado.
        if (raiz == null)
        {
            raiz = new NodoAvl(dt);
            h.setLogical(true); // Se ha modificado el balance del árbol
        }
        
        // Compara el valor a insertar con el valor del nodo raíz.
        else if (dt.menorQue(raiz.valorNodo(raiz)))
        {
            // Insertar el nuevo nodo en el subárbol izquierdo.
          NodoAvl iz;
           iz = insertarAvl((NodoAvl) raiz.subarbolIzdo(), dt, h);
           raiz.ramaIzdo(iz);
            // Si se ha modificado el balance del subárbol izquierdo, actualizar el balance del nodo raíz.  
        }
        if (h.booleanValue())
        {
            
            switch (raiz.fe)
            {
                case 1:
                    raiz.fe = 0;
                    h.setLogical(false);// Se ha equilibrado el árbol
                    break;
                case 0:
                    raiz.fe = -1;
                    break;
                case -1:
                    // aplicar rotación a la izquierda
                    n1 = (NodoAvl)raiz.subarbolIzdo();
                    if (n1.fe == -1)
                    {
                        raiz = rotacionII(raiz, n1);
                    }
                    else
                    {
                        raiz = rotacionID(raiz, n1);
                    }
                    h.setLogical(false); // Se ha equilibrado el árbol
            }
        }
        else if (dt.mayorQue(raiz.valorNodo(raiz)))
            // Insertar el nuevo nodo en el subárbol derecho.
        {
            NodoAvl dr;
            dr = insertarAvl((NodoAvl)raiz.subarbolDcho(), dt, h);
            raiz.ramaDcho(dr);
 // regreso por los nodos del camino de búsqueda
            if (h.booleanValue())
            {
                // incrementa el fe por aumentar la altura de rama izquierda
                switch (raiz.fe)
                {
                    case 1: // Aplicar la rotacion por la derecha 
                        n1 = (NodoAvl)raiz.subarbolDcho();
                        if (n1.fe == +1)
                        {
                            raiz = rotacionDD(raiz, n1);
                        }
                        else
                        {
                            raiz = rotacionDI(raiz,n1);
                        }
                        h.setLogical(false); // Se ha equilibrado el árbol
                        break;
                    
                    case 0: // 
                       raiz.fe = +1;
                        break;
                    }
                }   
            }
            else
            // El valor ya existe en el árbol.
                {
                throw new Exception("No puede haber claves repetidas " );
                }
            return raiz;
            
            
    }
            
            
            
            
            
        
    }
    
