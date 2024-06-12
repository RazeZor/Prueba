/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robotsv2;

/**
 *
 * @author Ninjakiller
 */
import java.util.concurrent.ThreadLocalRandom;

public class Random {

    public static int generarNumeroIntAlAzarEntreMinYMax(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    public static boolean generarBooleanAlAzar() {
        return generarNumeroIntAlAzarEntreMinYMax(0, 10000) < 5000;
    }
}
