/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

/**
 * **Clase Nodo:**
 *
 * Esta clase representa un nodo individual en un árbol binario.
 *
 * @author Sergio
 */
public class Nodo{
    /**
     * Valor almacenado en el nodo.
     */
    protected Object dato;
    /**
     * Hijo izquierdo del nodo.
     */
    protected Nodo izdo; 
    /**
     * Hijo derecho del nodo.
     */
    protected Nodo dcho; 
    
     /**
     * Constructor que crea un nuevo nodo con un valor especificado y sin hijos.
     *
     * @param valor El valor que se almacenará en el nodo.
     */
    public Nodo(Object valor){ //Constructor del la clase nodo 
	 
    dato = valor;
    izdo = dcho = null;
    }
    
    /**
     * **Acceso a los hijos:**
     *
     * Métodos para obtener y establecer los hijos del nodo.
     */

    /**
     * Devuelve el valor del nodo.
     *
     * @return El valor del nodo.
     */
    public Nodo(Nodo ramaIzdo, Object valor, Nodo ramaDcho){
    this.dato=valor;
    izdo = ramaIzdo;
    dcho = ramaDcho;
    }
// operaciones de acceso
    public Object valorNodo(Object valor){ return valor; }
    
    /**
     * Devuelve el hijo izquierdo del nodo.
     *
     * @return El hijo izquierdo del nodo.
     */
    public Nodo subarbolIzdo(){ return izdo; }
    
      /**
     * Devuelve el hijo derecho del nodo.
     *
     * @return El hijo derecho del nodo.
     */
    public Nodo subarbolDcho(){ return dcho; }
    
    public void nuevoValor(Object d){ dato = d; }
    
    /**
     * Establece el hijo izquierdo del nodo.
     *
     * @param n El nuevo hijo izquierdo del nodo.
     */
    public void ramaIzdo(Nodo n){ izdo = n; }
    
    /**
     * Establece el hijo derecho del nodo.
     *
     * @param n El nuevo hijo derecho del nodo.
     */
    public void ramaDcho(Nodo n){ dcho = n; }

     /**
     * **Visitar el nodo:**
     *
     * Método para imprimir el valor del nodo.
     */

    /**
     * Imprime el valor del nodo.
     */
    void visitar(){
        System.out.println(dato + " ");
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
    
    /**
     * **Accesores:**
     *
     * Métodos para obtener y establecer el valor del nodo.
     */

    public Nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo getDcho() {
        return dcho;
    }

    public void setDcho(Nodo dcho) {
        this.dcho = dcho;
    }
    
    
}