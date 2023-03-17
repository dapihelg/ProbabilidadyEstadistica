public class MediaArmo {

    public static double calcularMedia(double[] numeros) {
        double sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            sum += 1 / numeros[i];
        }
        double media = numeros.length / sum;
        return media;
    }

    public static double calcularRango(double[] numeros) {
        double max = numeros[0];
        double min = numeros[0];

        // Find the maximum and minimum values in the array
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        // Calculate the range using the maximum and minimum values
        double rango = max - min;
        return rango;
    }


    public static double calcularVarianza(double[] numeros) {
        double media = calcularMedia(numeros);
        double sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            sum += Math.pow(numeros[i] - media, 2);
        }
        double varianza = sum / numeros.length;
        return varianza;
    }

    public static double calcularDesviacionEstandar(double[] numeros) {
        double varianza = calcularVarianza(numeros);
        double desviacionEstandar = Math.sqrt(varianza);
        return desviacionEstandar;
    }

    public static double calcularCoeficienteVariacion(double[] numeros) {
        double desviacionEstandar = calcularDesviacionEstandar(numeros);
        double media = calcularMedia(numeros);
        double coeficienteVariacion = (desviacionEstandar / media) * 100;
        return coeficienteVariacion;
    }


}