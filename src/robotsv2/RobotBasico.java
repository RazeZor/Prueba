/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robotsv2;

/**
 *
 * @author Ninjakiller
 */
public class RobotBasico extends Robot {

    private boolean tarjetaExpansible;

    public RobotBasico() {
    }

    public RobotBasico(boolean tarjetaExpansible, int id, int distanciaRecorrida) {
        super(id, distanciaRecorrida);
        this.setTarjetaExpansible(tarjetaExpansible);
    }

    public boolean isTarjetaExpansible() {
        return tarjetaExpansible;
    }

    public void setTarjetaExpansible(boolean tarjetaExpansible) {
        this.tarjetaExpansible = tarjetaExpansible;
    }

    @Override
    public void avanzar() {
        if (this.getNivelBateria() >= 1) {
            System.out.println("Robot ID= " + this.getId() + " Tipo = Basico, "
                    + " Avanzando en " + Movilizable.desplazamientoEnCMxUnidadDeBateriaRobotBasico + "CM.... , "
                    + " totalAvanceHastaElMomentoCM = " + this.getDistanciaRecorrida()
                    + " BateriaRestante = " + this.getNivelBateria());
            this.setNivelBateria(this.getNivelBateria() - 1);
            this.setDistanciaRecorrida(this.getDistanciaRecorrida() + Movilizable.desplazamientoEnCMxUnidadDeBateriaRobotBasico);
        }
    }

    @Override
    public void girarDerecha90Grados() {
        if (this.getNivelBateria() >= 1) {
            System.out.println("Robot Id = " + this.getId() + " Tipo = Basico,"
                    + " Girando a la derecha 90 grados,"
                    + " BateriaRestante = " + this.getNivelBateria());
            this.setNivelBateria(this.getNivelBateria() - 1);
        }
    }

    @Override
    public void girarIzquierda90Grados() {
        if (this.getNivelBateria() >= 1) {
            System.out.println("Robot Id = " + this.getId() + " Tipo = Basico,"
                    + " Girando a la Izquierda 90 grados,"
                    + " BateriaRestante = " + this.getNivelBateria());
            this.setNivelBateria(this.getNivelBateria() - 1);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "RobotBasico{ " + " tarjetaExpansible=" + tarjetaExpansible + '}';
    }
}
