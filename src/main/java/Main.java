import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int N = 0;
            double media = 0;
            int numeros = 0;
            int resp;
            double suma = 0;
            int contP = 0;

            MediaAritm numeros1;
            ArrayList<MediaAritm> num = new ArrayList<>();


            do {
                System.out.println(" \n BIENVENIDO AL MENÚ, ELIGE LA OPERACIÓN");
                System.out.println("1.- Media aritmética");
                System.out.println("2.- Media ponderada");
                System.out.println("3.- Media armónica");
                System.out.println("4.- Media geométrica");
                System.out.println("5.- Mediana");
                System.out.println("6.- Moda");
                System.out.println("7.- ");
                System.out.println("8.- ");
                System.out.println("9.- ");
                System.out.println("DIGITE 10 PARA SALIR");
                resp = entrada.nextInt();


                switch (resp) {
                    case 1:
                                Scanner scanner5 = new Scanner(System.in);

                                System.out.println("Ingrese la cantidad de numeros: ");
                                int n5 = scanner5.nextInt();

                                double[] numeros5 = new double[n5];
                                suma = 0;

                                System.out.println("Ingrese los " + n5 + " numeros:");
                                for (int i = 0; i < n5; i++) {
                                    numeros5[i] = scanner5.nextDouble();
                                    suma += numeros5[i];
                                }

                                MediaAritm mediaAritmetica = new MediaAritm(N, suma, 0);
                                media = mediaAritmetica.calcularMediaAritmetica();
                                double rango = mediaAritmetica.calcularRango(numeros5);

                                System.out.println("La media aritmetica es: " + media);
                                System.out.println("El rango es: " + rango);


                        break;

                    case 2:

                        System.out.print("Ingrese el número de elementos: ");
                        int n6 = entrada.nextInt();

                        double[] numeros6 = new double[n6];
                        double[] pesos = new double[n6];

                        for (int i = 0; i < n6; i++) {
                            System.out.print("Ingrese el número " + (i+1) + ": ");
                            numeros6[i] = entrada.nextDouble();
                            System.out.print("Ingrese el peso del número " + (i+1) + ": ");
                            pesos[i] = entrada.nextDouble();
                        }

                        double promedioPonderado = PromedioPonderado.calcularPromedioPonderado(numeros6, pesos);

                        System.out.println("El promedio ponderado es: " + promedioPonderado);

                        break;

                    case 3:

                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Ingresa el número de elementos: ");
                        int n = scanner.nextInt();
                        int[] nums = new int[n];
                        System.out.print("Ingrese los elementos: ");
                        for (int i = 0; i < n; i++) {
                            nums[i] = scanner.nextInt();
                        }
                        double mA = MediaArmo.mediaArmonica(nums.length, nums);
                        double rango1 = MediaArmo.calcularRango(nums);
                        System.out.println("media armónica: " + mA);
                        System.out.println("el rango es "+rango1);
                        //scanner.close();
                        break;

                    case 4:

                        Scanner scanner1 = new Scanner(System.in);
                        System.out.print("Ingrese la cantidad de números: ");
                        int n1 = scanner1.nextInt();
                        double[] numeros2 = new double[n1];
                        for (int i = 0; i < n1; i++) {
                            System.out.print("Ingrese el número " + (i + 1) + ": ");
                            numeros2[i] = scanner1.nextDouble();
                        }
                        double result = MediaGeom.calcular(numeros2, 0);
                        System.out.println("La media geométrica es: " + result);

                        break;

                    case 5:

                                Scanner input1 = new Scanner(System.in);
                                System.out.print("Ingrese la cantidad de elementos: ");
                                int n3 = input1.nextInt();
                                int[] numeros3 = new int[n3];
                                System.out.print("Ingrese los elementos: ");
                                for (int i = 0; i < n3; i++) {
                                    numeros3[i] = input1.nextInt();
                                }
                                double resultado = Mediana.calcularMediana(numeros3);
                                System.out.println("La mediana es: " + resultado);

                        break;

                    case 6:

                                Scanner en = new Scanner(System.in);
                                System.out.print("Ingrese la cantidad de elementos: ");
                                int n4 = en.nextInt();
                                int[] numeros4 = new int[n4];
                                System.out.print("Ingrese los elementos: ");
                                for (int i = 0; i < n4; i++) {
                                    numeros4[i] = en.nextInt();
                                }
                                int moda = Moda.calcularModa(numeros4);
                                System.out.println("La moda es: " + moda);

                        break;

                    case 7:

                        break;

                    case 8:

                        break;

                    case 9:

                        break;

                    default:
                        System.out.println("Ésta opción es inválida");
                        break;

                }
            } while (resp < 10) ;
        }
}
