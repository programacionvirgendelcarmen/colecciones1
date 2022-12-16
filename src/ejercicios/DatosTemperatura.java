package ejercicios;

import java.util.Arrays;

public class DatosTemperatura {
    public static void main(String[] args) {
        int[] temperaturasMaximas = {12, 14, 15, 16, 18, 15, 14};
        int[] temperaturasMinimas = {8, 8, 8, 5, 7, 8, 9, 8};

        double[] valoresMedios = calcularValorMedioTemperaturas(
                temperaturasMaximas, temperaturasMinimas);
        System.out.println(Arrays.toString(valoresMedios));

    }

    private static double[] calcularValorMedioTemperaturas(int[] temperaturasMaximas, int[] temperaturasMinimas) {

        double temperaturaMaximaMedia = getTemperaturaMedia(temperaturasMaximas);
        double temperaturaMinimaMedia = getTemperaturaMedia(temperaturasMinimas);

       /* double[] valoresMedios = new double[2];
        valoresMedios[0] = temperaturaMaximaMedia;
        valoresMedios[1] = temperaturaMinimaMedia;*/

        return new double[]{temperaturaMaximaMedia, temperaturaMinimaMedia};
    }

    private static double getTemperaturaMedia(int[] temperaturas) {
        int sumaDatos = 0;
        for (int temperatura : temperaturas) {
            sumaDatos += temperatura;
        }
        double temperaturaMedia = 1.0 * sumaDatos / temperaturas.length;
        return temperaturaMedia;
    }
}


