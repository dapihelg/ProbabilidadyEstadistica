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
}
