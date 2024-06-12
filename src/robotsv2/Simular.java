/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robotsv2;

/**
 *
 * @author Ninjakiller
 */
public class Simular {

    AlmacenamientoRobots ar = new AlmacenamientoRobots();

    public void crearRobots() {
        for (int i = 0; i < Random.generarNumeroIntAlAzarEntreMinYMax(10, Random.generarNumeroIntAlAzarEntreMinYMax(11, 21)); i++) {
            int tipo = Random.generarNumeroIntAlAzarEntreMinYMax(0, 2);
            if (tipo == 0) {
                RobotBasico rb = new RobotBasico(Random.generarBooleanAlAzar(), i + 1, 0);
                ar.robots.add(rb);
            } else {
                RobotAvanzado ra = new RobotAvanzado(Random.generarBooleanAlAzar(), Random.generarBooleanAlAzar(), i + 1, 0);
                ar.robots.add(ra);
            }
        }
    }

    public void moverRobots() {
        System.out.println("Mover Robots------------------------------");
        for (int i = 0; i < ar.robots.size(); i++) {
            while (ar.robots.get(i).getNivelBateria() != 0) {
                int tipoMovimiento = Random.generarNumeroIntAlAzarEntreMinYMax(1, 4);
                switch (tipoMovimiento) {
                    case 1:
                        ar.robots.get(i).avanzar();
                        break;
                    case 2:
                        ar.robots.get(i).girarDerecha90Grados();
                        break;
                    case 3:
                        ar.robots.get(i).girarIzquierda90Grados();
                        break;
                }
            }
        }
    }

    public void imprimirRobots(int donde) {
        if (donde == 1) {
            System.out.println("Crear Robots------------------------------");
            for (int i = 0; i < ar.robots.size(); i++) {
                System.out.println(ar.robots.get(i).toString());
            }
        } else {
            System.out.println("Resultado Robots------------------------------");
            for (int i = 0; i < ar.robots.size(); i++) {
                System.out.println(ar.robots.get(i).toString());
            }
        }
    }

    public void avanzoMenos() {
        System.out.println("Este robot avanzo menos------------------------------");
        int menor = 9999;
        Robot robotMenor = null;
        for (int i = 0; i < ar.robots.size(); i++) {
            if ((this.ar.robots.get(i).getDistanciaRecorrida()) < menor) {
                menor = ar.robots.get(i).getDistanciaRecorrida();
                robotMenor = ar.robots.get(i);
            }
        }
        System.out.println("Menor " + robotMenor.toString());
    }

    public void avanzoMas() {
        System.out.println("Este robot avanzo mas------------------------------");
        int mayor = -9999;
        Robot robotMayor = null;
        for (int i = 0; i < ar.robots.size(); i++) {
            if ((this.ar.robots.get(i).getDistanciaRecorrida()) > mayor) {
                mayor = ar.robots.get(i).getDistanciaRecorrida();
                robotMayor = ar.robots.get(i);
            }
        }
        System.out.println("Mayor " + robotMayor.toString());
    }
}
