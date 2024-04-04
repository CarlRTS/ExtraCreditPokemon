
package ArbolAvl;

/**
 * Esta clase representa un contenedor simple para un valor booleano.
 * Se utiliza internamente por la clase `ArbolAvl` para rastrear cambios en el balance
 * del árbol durante las operaciones de inserción.
 *
 * @author Sergio
 */

public class Logical {
 
    boolean v;
    
  /**
   * Constructor que inicializa el valor interno del objeto.
   *
   * @param f El valor booleano inicial.
   */
    public Logical (boolean f){
        v = f;
    }
     /**
   * Establece el valor booleano interno del objeto.
   *
   * @param f El nuevo valor booleano.
   */
    public void setLogical(boolean f){
    v = f;
    }
     /**
   * Devuelve el valor booleano actual del objeto.
   *
   * @return El valor booleano actual.
   */
    public boolean booleanValue(){
    return v;
    }
}

