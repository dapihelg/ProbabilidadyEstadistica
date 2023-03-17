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

}
