public class MediaAritm {
    int N;
    double p;
    int sumaP;

    public MediaAritm(int N, int sumaP, double p) {
        this.N = N;
        this.sumaP = sumaP;
        this.p = p;
    }


    public double mAp() {
        p = sumaP / N;
        return p;
    }
}
