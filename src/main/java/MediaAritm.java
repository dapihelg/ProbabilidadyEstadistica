public class MediaAritm {
    int n;
    int N;
    double p;
    double q;
    int sumaP;
    int sumaQ;
    int contP;
    int contQ;
    int numeros;

    public MediaAritm(int n, int N, int numeros, int sumaP, double p, int sumaQ, double q) {
        this.n = n;
        this.N = N;
        this.numeros = numeros;
        this.sumaP = sumaP;
        this.p = p;
        this.sumaQ = sumaQ;
        this.q = q;
    }


    public double mAp() {
        p = sumaP / N;
        return p;
    }

    public double mAm() {
        q = sumaQ / n;
        return q;
    }
}
