/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robotsv2;

/**
 *
 * @author Ninjakiller
 */
//olaPapu
//prueba 2
// EL capi se la come
public class RobotAvanzado extends Robot {

    private boolean tieneSensorInfrarojoDelantero;
    private boolean esProgramableEnC;

    public RobotAvanzado() {
    }

    public RobotAvanzado(boolean tieneSensorInfrarojoDelantero, boolean esProgramableEnC, int id, int distanciaRecorrida) {
        super(id, distanciaRecorrida);
        this.setTieneSensorInfrarojoDelantero(tieneSensorInfrarojoDelantero);
        this.setEsProgramableEnC(esProgramableEnC);
    }

    public boolean isTieneSensorInfrarojoDelantero() {
        return tieneSensorInfrarojoDelantero;
    }

    public void setTieneSensorInfrarojoDelantero(boolean tieneSensorInfrarojoDelantero) {
        this.tieneSensorInfrarojoDelantero = tieneSensorInfrarojoDelantero;
    }

    public boolean isEsProgramableEnC() {
        return esProgramableEnC;
    }

    public void setEsProgramableEnC(boolean esProgramableEnC) {
        this.esProgramableEnC = esProgramableEnC;
    }

    @Override
    public void avanzar() {
        if (this.getNivelBateria() >= 1) {
            System.out.println("Robot ID= " + this.getId() + " Tipo = Avanzado, "
                    + " Avanzando en " + Movilizable.desplazamientoEnCMxUnidadDeBateriaRobotAvanzado + "CM.... , "
                    + " totalAvanceHastaElMomentoCM = " + this.getDistanciaRecorrida()
                    + " BateriaRestante = " + this.getNivelBateria());
            this.setNivelBateria(this.getNivelBateria() - 1);
            this.setDistanciaRecorrida(this.getDistanciaRecorrida() + Movilizable.desplazamientoEnCMxUnidadDeBateriaRobotAvanzado);
        }
    }

    @Override
    public void girarDerecha90Grados() {
        if (this.getNivelBateria() >= 1) {
            System.out.println("Robot Id = " + this.getId() + " Tipo = Avanzado,"
                    + " Girando a la derecha 90 grados,"
                    + " BateriaRestante = " + this.getNivelBateria());
            this.setNivelBateria(this.getNivelBateria() - 1);
        }
    }

    @Override
    public void girarIzquierda90Grados() {
        if (this.getNivelBateria() >= 1) {
            System.out.println("Robot Id = " + this.getId() + " Tipo = Avanzado,"
                    + " Girando a la izquierda 90 grados,"
                    + " BateriaRestante = " + this.getNivelBateria());
            this.setNivelBateria(this.getNivelBateria() - 1);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "RobotAvanzado{ " + " tieneSensorInfrarojoDelantero=" + tieneSensorInfrarojoDelantero + ", esProgramableEnC=" + esProgramableEnC + '}';
    }
}
