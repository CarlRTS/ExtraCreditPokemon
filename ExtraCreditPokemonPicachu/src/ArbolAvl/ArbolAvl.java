
package ArbolAvl;
import ArbolBusqueda.*;


/**
 *
 * @author Sergio
 */
public class ArbolAvl {
    
    NodoAvl raiz;
    
    public ArbolAvl(){
        raiz = null;
    }
    public NodoAvl raizArbol (){
    return raiz;
    
    }
    
    //Inserccion con balanceos y rotaciones:
    
    private NodoAvl rotacionII(NodoAvl n, NodoAvl n1){
        n.ramaIzdo(n1.subarbolDcho());
        n1.ramaDcho(n);
        // actualización de los factores de equilibrio
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
        return n1;
    }
    
    private NodoAvl rotacionDD(NodoAvl n, NodoAvl n1){
        n.ramaDcho(n1.subarbolIzdo());
        n1.ramaIzdo(n);
        // actualización de los factores de equilibrio
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
        return n1;
    }
    
    private NodoAvl rotacionID(NodoAvl n, NodoAvl n1){
        NodoAvl n2;
        n2 = (NodoAvl) n1.subarbolDcho();
        n.ramaIzdo(n2.subarbolDcho());
        n2.ramaDcho(n);
        n1.ramaDcho(n2.subarbolIzdo());
        n2.ramaIzdo(n1);
        // actualización de los factores de equilibrio
        
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
        return n2;
    
    }
    
    private NodoAvl rotacionDI(NodoAvl n, NodoAvl n1){
        NodoAvl n2;
        n2 = (NodoAvl)n1.subarbolIzdo();
        n.ramaDcho(n2.subarbolIzdo());
        n2.ramaIzdo(n);
        n1.ramaIzdo(n2.subarbolDcho());
        n2.ramaDcho(n1);
 // actualización de los factores de equilibrio
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
        return n2;
    }
    
    //Inserccion con balanceo 
    
    public void insertar (Object valor)throws Exception{
        Comparador dato;
        Logical h = new Logical(false); // intercambia un valor booleano
        dato = (Comparador) valor;
        raiz = insertarAvl(raiz, dato, h);
    }
    
    private NodoAvl insertarAvl(NodoAvl raiz, Comparador dt, Logical h) throws Exception{
        NodoAvl n1;
        if (raiz == null)
        {
            raiz = new NodoAvl(dt);
            h.setLogical(true);
        }
        else if (dt.menorQue(raiz.valorNodo()))
        {
          NodoAvl iz;
           iz = insertarAvl((NodoAvl) raiz.subarbolIzdo(), dt, h);
           raiz.ramaIzdo(iz);
            // regreso por los nodos del camino de búsqueda  
        }
        if (h.booleanValue())
        {
            // decrementa el fe por aumentar la altura de rama izquierda
            switch (raiz.fe)
            {
                case 1:
                    raiz.fe = 0;
                    h.setLogical(false);
                    break;
                case 0:
                    raiz.fe = -1;
                    break;
                case -1:// aplicar rotación a la izquierda
                    n1 = (NodoAvl)raiz.subarbolIzdo();
                    if (n1.fe == -1)
                    {
                        raiz = rotacionII(raiz, n1);
                    }
                    else
                    {
                        raiz = rotacionID(raiz, n1)
                    }
                    h.setLogical(false);
            }
        }
        else if (dt.mayorQue(raiz.valorNodo())) 
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
                        h.setLogical(false);
                        break;
                    
                    case 0: // 
                       raiz.fe = +1;
                        break;
                    }
                }   
            }
            else
                {
                throw new Exception("No puede haber claves repetidas " );
                }
            return return raiz;
            
            
    }
            
            
            
            
            
        
    }
    
