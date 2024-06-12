/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robotsv2;

/**
 *
 * @author Ninjakiller
 */
public abstract class Robot implements Girable,Movilizable {
    protected int id;
    protected int distanciaRecorrida;
    protected int nivelBateria=Movilizable.duracionInicialBateriaLitioRobot;

    public Robot() {
    }

    public Robot(int id, int distanciaRecorrida) {
        this.setId(id);
        this.setDistanciaRecorrida(distanciaRecorrida);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public abstract void avanzar();
    
    @Override
    public String toString() {
        return "Robot{" + "id=" + id + ", distanciaRecorrida=" + distanciaRecorrida + ", nivelBateria=" + nivelBateria + '}';
    }
    
}
