import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int n = 0;
            int N = 0;
            double p = 0;
            double q = 0;
            int sumaP = 0;
            int sumaQ = 0;
            int numeros = 0;
            int contP = 0;
            int contQ = 0;
            int sumaT = 0;
            int numeros2 = 0;
            int resp;
            int resp2;
            int op = 0;

            MediaAritm numeros1;
            ArrayList<MediaAritm> num = new ArrayList<>();


            do {
                System.out.println(" \n BIENVENIDO AL MENÚ, ELIGE LA OPERACIÓN");
                System.out.println("1.- Media aritmética");
                System.out.println("2.- Media ponderada");
                System.out.println("3.- Media geométrica");
                System.out.println("4.- salir");
                resp = entrada.nextInt();


                switch (resp) {
                    case 1:

                        System.out.println("1.- Población ");
                        System.out.println("2.- Muestra ");
                        resp2 = entrada.nextInt();

                        if(resp2 == 1) {

                            System.out.println("Ingresa el número de elementos de la población ");
                            N = entrada.nextInt();

                            do {

                                for (int i = 0; i < N; i++) {
                                    System.out.println("Ingresa el número ");
                                    numeros = entrada.nextInt();
                                    sumaP += numeros;
                                    contP++;
                                }

                            }while (numeros != N) ;

                            numeros1 = new MediaAritm(n, N, numeros, sumaP, p, sumaQ, q);
                            num.add(numeros1);
                            numeros1.mAp();
                            System.out.println("La suma de los números es: "+numeros1.sumaP);
                            System.out.println("la media es: " + numeros1.p);

                        } else if (resp2 == 2) {
                            System.out.println("Ingresa el número de elementos de la muestra ");
                            n = entrada.nextInt();

                            do {
                                /*try {*/
                                for (int x = 0; x < n; x++) {
                                    System.out.println("ingresa el número ");
                                    numeros2 = entrada.nextInt();
                                    sumaQ += numeros2;
                                    contQ++;
                                }
                               /* } catch (InputMismatchException e) {
                                    System.out.println("Ingrese solo números enteros.");
                                }
                                op = 1;*/
                            } while(numeros2 != n);

                            numeros1 = new MediaAritm(n, N, numeros, sumaP, p, sumaQ, q);
                            num.add(numeros1);
                            numeros1.mAm();
                            System.out.println("La suma de los números es: "+numeros1.sumaQ);
                            System.out.println("la media es: " + numeros1.q);

                        } else{
                            System.out.println("Esta opción no existe");
                        }
                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    default:
                        System.out.println("Ésta opción es inválida");
                        break;

                }
            } while (resp < 4) ;
        }

}
