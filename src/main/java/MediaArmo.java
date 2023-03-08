import java.util.Scanner;

public class MediaArmo {

    double N = 0;
    double x = 0;
    double suma = 0;
    double act;
    int cont;
    double st;


    public MediaArmo(double n, double x, double suma, double act) {
        this.N = N;
        this.x = x;
        this.suma = suma;
        this.act = act;
    }

    public double inverso(double x) {
        if (x == 0) {
            return 0;
        } else {
            Math.pow(inverso(x), 1);
            x = st;
            x += act;
        }
        return x;
    }

    public double sumaInv(double act) {
        suma = N / sumaInv(act);
        return suma;
    }

    public double ingreso(double x){
        Scanner dato = new Scanner(System.in);
        x = ingreso(x);
        System.out.println("Ingresa el número: ");
         x = dato.nextDouble();
        return x;
    }

    public void lector(double st, double act){
        System.out.println("número de elementos: "+cont+" números: "+st+" ");
        System.out.printf("números inversos "+act);
        sumaInv(act);
        cont++;
    }
}
