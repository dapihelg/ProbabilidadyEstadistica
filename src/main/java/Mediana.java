public class Mediana {
        public static double calcularMediana(int[] numeros) {
            int longitud = numeros.length;
            if (longitud % 2 == 0) {
                int mitad = longitud / 2;
                return (calcularElementoK(numeros, mitad - 1, 0, longitud - 1) + calcularElementoK(numeros, mitad, 0, longitud - 1)) / 2.0;
            } else {
                int mitad = longitud / 2;
                return calcularElementoK(numeros, mitad, 0, longitud - 1);
            }
        }

        private static int calcularElementoK(int[] numeros, int k, int inicio, int fin) {
            int indicePivote = particion(numeros, inicio, fin);
            if (k == indicePivote) {
                return numeros[k];
            } else if (k < indicePivote) {
                return calcularElementoK(numeros, k, inicio, indicePivote - 1);
            } else {
                return calcularElementoK(numeros, k, indicePivote + 1, fin);
            }
        }

        private static int particion(int[] numeros, int inicio, int fin) {
            int pivote = numeros[fin];
            int i = inicio - 1;
            for (int j = inicio; j < fin; j++) {
                if (numeros[j] <= pivote) {
                    i++;
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
            int temp = numeros[i + 1];
            numeros[i + 1] = numeros[fin];
            numeros[fin] = temp;
            return i + 1;
        }
    }
