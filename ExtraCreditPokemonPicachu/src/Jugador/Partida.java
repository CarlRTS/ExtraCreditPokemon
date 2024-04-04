/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jugador;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Carl
 */
public class Partida {

    @Override
    public String toString() {
        return "Partida{" + "tiempo_jugado=" + tiempo_jugado + ", watts=" + watts + ", regalos=" + regalos + ", relacion=" + relacion + ", cant_pokemon=" + cant_pokemon + '}';
    }
    
    String tiempo_jugado = "";
    int watts = 0;
    String regalos = "";
    int relacion = 0;
    int cant_pokemon = 0;

    public Partida() {
        tiempo_jugado = "00:00:00:00";
        watts = 0;
        regalos = "";
        relacion = 0;
        cant_pokemon = 0;
    }

    public String getTiempo_jugado() {
        return tiempo_jugado;
    }

    public void setTiempo_jugado(String tiempo_jugado) {
        this.tiempo_jugado = tiempo_jugado;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public String getRegalos() {
        return regalos;
    }

    public void setRegalos(String regalos) {
        this.regalos = regalos;
    }

    public int getRelacion() {
        return relacion;
    }

    public void setRelacion(int relacion) {
        this.relacion = relacion;
    }

    public int getCant_pokemon() {
        return cant_pokemon;
    }

    public void setCant_pokemon(int cant_pokemon) {
        this.cant_pokemon = cant_pokemon;
    }
    
    
    
    
}
