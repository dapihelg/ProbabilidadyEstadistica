public class PromedioPonderado {
    public static double calcularPromedioPonderado(double[] numeros, double[] pesos) {
        double sumaTotal = 0;
        double sumaPesos = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumaTotal += numeros[i] * pesos[i];
            sumaPesos += pesos[i];
        }
        return sumaTotal / sumaPesos;
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

    public static double calcularVarianza(double[] numeros, double[] pesos) {
        double media = calcularPromedioPonderado(numeros, pesos);
        double sum = 0;
        double sumPesos = 0;
        for (int i = 0; i < numeros.length; i++) {
            sum += pesos[i] * Math.pow(numeros[i] - media, 2);
            sumPesos += pesos[i];
        }
        double varianza = sum / sumPesos;
        return varianza;
    }

    public static double calcularDesviacionEstandar(double[] numeros, double[] pesos) {
        double varianza = calcularVarianza(numeros, pesos);
        double desviacionEstandar = Math.sqrt(varianza);
        return desviacionEstandar;
    }

    public static double calcularCoeficienteVariacion(double[] numeros, double[] pesos) {
        double desviacionEstandar = calcularDesviacionEstandar(numeros, pesos);
        double media = calcularPromedioPonderado(numeros, pesos);
        double coeficienteVariacion = (desviacionEstandar / media) * 100;
        return coeficienteVariacion;
    }
}
