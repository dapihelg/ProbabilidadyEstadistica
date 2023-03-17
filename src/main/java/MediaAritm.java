public class MediaAritm {
    public int N;
    public double suma;
    public double media;

    public MediaAritm(int N, double suma, double media) {
        this.N = N;
        this.suma = suma;
        this.media = media;
    }

    public double calcularMediaAritmetica() {
        media = suma / N;
        return media;
    }

    public double calcularRango(double[] numeros) {
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
        return max - min;
    }

        public double calcularVarianza(double[] numeros, double media) {
            double sumaCuadrados = 0;

            for (int i = 0; i < numeros.length; i++) {
                sumaCuadrados += Math.pow(numeros[i] - media, 2);
            }

            return sumaCuadrados / N;
        }

        public double calcularDesviacionEstandar(double varianza) {
            return Math.sqrt(varianza);
        }

        public double calcularCoeficienteVariacion(double desviacionEstandar, double media) {
            return (desviacionEstandar / media) * 100;
        }
}
