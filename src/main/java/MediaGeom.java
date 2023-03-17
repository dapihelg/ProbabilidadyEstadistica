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
}
