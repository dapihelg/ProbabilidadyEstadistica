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
            x = Math.pow(x, -1);
            x = st;
            x += act;
            System.out.println("" +act);
        }
        return act;
    }
    public double sumaT(){
            suma = N/act;
        return suma;
    }
}

    /*public double sumaInv(double x) {
        suma = N/x;
        return suma;
    }*/

    /*public void ingreso(double x){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingresa el número: ");
         x = dato.nextDouble();
    }*/

    /*public void lector(double st, double act){
        System.out.println("número de elementos: "+cont+" números: "+st+" ");
        System.out.printf("números inversos "+act);
        cont++;
    }*/