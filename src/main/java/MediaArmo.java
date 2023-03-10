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

    public double poblacion(double N){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la población N: ");
        N = in.nextDouble();
        if (N < 1)
                return 0;
        else
            return poblacion(N);
    }
    public double inversos(double x){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el número: ");
        x= in.nextDouble();
        if(x<N)
            return 0;
        else
            return inversos(x-1)+1/x;
        }
    public double sumaT(double N){
        if(x == 0)
            return 0;
        else
            return sumaT(N)/inversos(x);
    }
    public void imprimir(){
        System.out.println(" número "+x+", La suma de los números inversos es: "+inversos(x));
        System.out.println("La media armónica es: "+sumaT(N));
    }
}

