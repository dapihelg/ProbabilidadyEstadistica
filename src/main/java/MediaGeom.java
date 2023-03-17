public class MediaGeom {
    public static double calcular(double[] numeros, int indice) {
        if (indice == numeros.length - 1) {
            return Math.pow(numeros[indice], 1.0 / numeros.length);
        } else {
            double current = numeros[indice];
            double siguiente = calcular(numeros, indice + 1);
            return Math.pow(current * siguiente, 1.0 / numeros.length);
        }
    }

    public static double calcularRango(double[] numeros) {
        // Primero, encontramos el valor máximo y mínimo en el array
        double max = numeros[0];
        double min = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        // Ahora que tenemos el valor máximo y mínimo, podemos calcular el rango
        double rango = max - min;
        return rango;
    }

    public static double calcularVarianza(double[] numeros) {
        double media = calcular(numeros, 0);
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += Math.pow(numeros[i] - media, 2);
        }
        double varianza = suma / numeros.length;
        return varianza;
    }

    public static double calcularDesviacionEstandar(double[] numeros) {
        double varianza = calcularVarianza(numeros);
        double desviacionEstandar = Math.sqrt(varianza);
        return desviacionEstandar;
    }

    public static double calcularCoeficienteVariacion(double[] numeros) {
        double desviacionEstandar = calcularDesviacionEstandar(numeros);
        double media = calcular(numeros, 0);
        double coeficienteVariacion = (desviacionEstandar / media) * 100;
        return coeficienteVariacion;
    }

}
