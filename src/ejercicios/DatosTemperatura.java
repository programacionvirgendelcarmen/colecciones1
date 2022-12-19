package ejercicios;

import java.util.Arrays;

public class DatosTemperatura {
    public static void main(String[] args) {

        int[] temperaturasMaximas = {12, 14, 15, 16, 18, 15, 14};
        int[] temperaturasMinimas = {8, 8, 8, 5, 7, 8, 9, 8};
        //valor medio de las temperaturas máximas y mínimas
        double[] valoresMedios = calcularValorMedioTemperaturas(
                temperaturasMaximas, temperaturasMinimas);
        System.out.println(Arrays.toString(valoresMedios));
        //desviación típica de las temperaturas máximas
        double desviacionTipicaTemperaturasMaximas =
                calcularDesviacionTipicaTemperaturasMaximas(temperaturasMaximas);
        System.out.printf("Desviación típica temperaturas: %.2f%n",
                desviacionTipicaTemperaturasMaximas);
        int nuMeroDiasTemperaturaMinimaPorDebajoMedia =
                calcularNuMeroDiasTemperaturaMinimaPorDebajoMedia(temperaturasMinimas);
        System.out.printf("Nº días por debajo de la media de la temperatura mínima: %d %n",
                nuMeroDiasTemperaturaMinimaPorDebajoMedia);
    }

    private static int calcularNuMeroDiasTemperaturaMinimaPorDebajoMedia(
            int[] temperaturasMinimas) {
        int contadorDeTemparturasPorDebajoMedia = 0;
        final double TEMPERATURA_MEDIA = getTemperaturaMedia(temperaturasMinimas);
        for (int temperaturasMinima : temperaturasMinimas) {
            //si la temeparturaMinima < temperaturaMedia, incremento contadorDeTemparturasPorDebajoMedia
            if (temperaturasMinima < TEMPERATURA_MEDIA)
                contadorDeTemparturasPorDebajoMedia++;
        }
        return contadorDeTemparturasPorDebajoMedia;
    }

    private static double calcularDesviacionTipicaTemperaturasMaximas(int[] temperaturasMaximas) {
        double suma = 0;
        double valorMedio = getTemperaturaMedia(temperaturasMaximas);
        for (int temperaturaMaxima:  temperaturasMaximas) {
            suma += Math.pow(temperaturaMaxima - valorMedio, 2);
        }
        return Math.sqrt(suma / (temperaturasMaximas.length - 1));
    }

    private static double[] calcularValorMedioTemperaturas(int[] temperaturasMaximas, int[] temperaturasMinimas) {

        /*double temperaturaMaximaMedia = getTemperaturaMedia(temperaturasMaximas);
        double temperaturaMinimaMedia = getTemperaturaMedia(temperaturasMinimas);
*/
       /* ** double[] valoresMedios = new double[2];
        valoresMedios[0] = temperaturaMaximaMedia;
        valoresMedios[1] = temperaturaMinimaMedia;
        return valoreMedios;
        ** */

      //  return new double[]{temperaturaMaximaMedia, temperaturaMinimaMedia};
        return new double[]{getTemperaturaMedia(temperaturasMaximas),
                getTemperaturaMedia(temperaturasMinimas)};
    }

    private static double getTemperaturaMedia(int[] temperaturas) {
        int sumaDatos = 0;
        for (int temperatura : temperaturas) {
            sumaDatos += temperatura;
        }
        /*double temperaturaMedia = 1.0 * sumaDatos / temperaturas.length;
        return temperaturaMedia;*/
        return 1.0 * sumaDatos / temperaturas.length;
    }
}


