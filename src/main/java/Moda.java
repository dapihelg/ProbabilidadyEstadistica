public class Moda {

        public static int calcularModa(int[] numeros) {
            int moda = numeros[0];
            int maximaFrecuencia = calcularFrecuencia(numeros, moda, 0, numeros.length - 1);
            for (int i = 1; i < numeros.length; i++) {
                int frecuencia = calcularFrecuencia(numeros, numeros[i], 0, numeros.length - 1);
                if (frecuencia > maximaFrecuencia) {
                    maximaFrecuencia = frecuencia;
                    moda = numeros[i];
                }
            }
            return moda;
        }

        private static int calcularFrecuencia(int[] numeros, int valor, int inicio, int fin) {
            if (inicio > fin) {
                return 0;
            } else if (inicio == fin) {
                return numeros[inicio] == valor ? 1 : 0;
            } else {
                int medio = (inicio + fin) / 2;
                int frecuenciaIzquierda = calcularFrecuencia(numeros, valor, inicio, medio);
                int frecuenciaDerecha = calcularFrecuencia(numeros, valor, medio + 1, fin);
                return frecuenciaIzquierda + frecuenciaDerecha;
            }
        }
    }
