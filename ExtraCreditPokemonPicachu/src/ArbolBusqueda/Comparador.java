/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArbolBusqueda;

/**
 * **Interfaz Comparador:**
 *
 * Esta interfaz define los métodos necesarios para comparar objetos.
 * Se utiliza en el árbol de búsqueda para comparar los valores de los nodos.
 *
 * @author Sergio
 */
public interface Comparador{
     /**
   * Comprueba si el objeto actual es igual al objeto especificado.
   *
   * @param q El objeto con el que se compara.
   * @return `true` si los objetos son iguales, `false` en caso contrario.
   */
    boolean igualQue(Object q);
     /**
   * Comprueba si el objeto actual es menor que el objeto especificado.
   *
   * @param q El objeto con el que se compara.
   * @return `true` si el objeto actual es menor que `q`, `false` en caso contrario.
   */
    boolean menorQue(Object q);
     /**
   * Comprueba si el objeto actual es menor o igual que el objeto especificado.
   *
   * @param q El objeto con el que se compara.
   * @return `true` si el objeto actual es menor o igual que `q`, `false` en caso contrario.
   */
    boolean menorIgualQue(Object q);
      /**
   * Comprueba si el objeto actual es mayor que el objeto especificado.
   *
   * @param q El objeto con el que se compara.
   * @return `true` si el objeto actual es mayor que `q`, `false` en caso contrario.
   */
    boolean mayorQue(Object q);
    /**
   * Comprueba si el objeto actual es mayor o igual que el objeto especificado.
   *
   * @param q El objeto con el que se compara.
   * @return `true` si el objeto actual es mayor o igual que `q`, `false` en caso contrario.
   */
    boolean mayorIgualQue(Object q);
    
    
}