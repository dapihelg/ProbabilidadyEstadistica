import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int resp;
            int contP = 0;
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

                                System.out.println("Ingrese la cantidad de numeros: ");
                                int n = entrada.nextInt();

                                double[] numeros = new double[n];
                                double suma = 0;

                                System.out.println("Ingrese los " + n + " numeros:");
                                for (int i = 0; i < n; i++) {
                                    numeros[i] = entrada.nextDouble();
                                    suma += numeros[i];
                                }

                                MediaAritm mediaAritmetica = new MediaAritm(n, suma, 0);
                                double media = mediaAritmetica.calcularMediaAritmetica();
                                double rango = mediaAritmetica.calcularRango(numeros);
                                double varianza = mediaAritmetica.calcularVarianza(numeros, media);
                                double desviacionEstandar = mediaAritmetica.calcularDesviacionEstandar(varianza);
                                double coeficienteVariacion = mediaAritmetica.calcularCoeficienteVariacion(desviacionEstandar, media);

                                System.out.println("La media aritmetica es: " + media);
                                System.out.println("El rango es: " + rango);
                                System.out.println("La varianza es: " + varianza);
                                System.out.println("La desviacion estandar es: " + desviacionEstandar);
                                System.out.println("El coeficiente de variacion es: " + coeficienteVariacion);
                        break;

                    case 2:

                        System.out.print("Ingrese el número de elementos: ");
                        int n2 = entrada.nextInt();

                        double[] numeros2 = new double[n2];
                        double[] pesos = new double[n2];

                        for (int i = 0; i < n2; i++) {
                            System.out.print("Ingrese el número " + (i + 1) + ": ");
                            numeros2[i] = entrada.nextDouble();
                            System.out.print("Ingrese el peso para el número " + (i + 1) + ": ");
                            pesos[i] = entrada.nextDouble();
                        }

                        double promedioPonderado = PromedioPonderado.calcularPromedioPonderado(numeros2, pesos);
                        System.out.println("Promedio ponderado: " + promedioPonderado);
                        double rango2 = PromedioPonderado.calcularRango(numeros2);
                        System.out.println("El rango es: "+rango2);
                        double variacion = PromedioPonderado.calcularVarianza(numeros2, pesos);
                        System.out.println("La varianza es: "+variacion);
                        double desvEst = PromedioPonderado.calcularDesviacionEstandar(numeros2, pesos);
                        double coefVar = PromedioPonderado.calcularCoeficienteVariacion(numeros2, pesos);

                        break;

                    case 3:

                                System.out.print("Ingrese el numero de elementos: ");
                                int n3 = entrada.nextInt();

                                double[] numeros3 = new double[n3];
                                for (int i = 0; i < n3; i++) {
                                    System.out.print("ingresa un número: ");
                                    numeros3[i] = entrada.nextInt();
                                }

                                double mediaArmonica = MediaArmo.calcularMedia(numeros3);
                                System.out.println("media armónica: " + mediaArmonica);
                                double rango3 = MediaArmo.calcularRango(numeros3);
                                System.out.println("Rango: " + rango3);
                                double varianza3 = MediaArmo.calcularVarianza(numeros3);
                                System.out.println("Varianza: " + varianza3);
                                double desviacionEstandar3 = MediaArmo.calcularDesviacionEstandar(numeros3);
                                System.out.println("Desviación estandar: " + desviacionEstandar3);
                                double coeficienteVariacion3 = MediaArmo.calcularCoeficienteVariacion(numeros3);
                                System.out.println("Coeficiente de variación: " + coeficienteVariacion3 + "%");

                        break;

                    case 4:

                        System.out.print("Ingrese la cantidad de números: ");
                        int n4 = entrada.nextInt();
                        double[] numeros4 = new double[n4];
                        for (int i = 0; i < n4; i++) {
                            System.out.print("Ingrese el número " + (i + 1) + ": ");
                            numeros4[i] = entrada.nextDouble();
                        }
                        double result = MediaGeom.calcular(numeros4, 0);
                        double rango4 = MediaGeom.calcularRango(numeros4);
                        double varianza2 = MediaGeom.calcularVarianza(numeros4);
                        double desviacionEstandar2 = MediaGeom.calcularDesviacionEstandar(numeros4);
                        double coeficienteVariacion2 = MediaGeom.calcularCoeficienteVariacion(numeros4);

                        System.out.println("La media geométrica es: " + result);
                        System.out.println("El rango es: " + rango4);
                        System.out.println("La varianza es: " + varianza2);
                        System.out.println("La desviación estándar es: "+desviacionEstandar2);
                        System.out.println("El coeficiente de variación es: "+coeficienteVariacion2);

                        break;

                    case 5:

                                Scanner input1 = new Scanner(System.in);
                                System.out.print("Ingrese la cantidad de elementos: ");
                                int n5 = input1.nextInt();
                                int[] numeros5 = new int[n5];
                                System.out.print("Ingrese los elementos: ");
                                for (int i = 0; i < n5; i++) {
                                    numeros5[i] = input1.nextInt();
                                }
                                double resultado = Mediana.calcularMediana(numeros5);
                                System.out.println("La mediana es: " + resultado);

                        break;

                    case 6:

                                System.out.print("Ingrese la cantidad de elementos: ");
                                int n6 = entrada.nextInt();
                                int[] numeros6 = new int[n6];
                                System.out.print("Ingrese los elementos: ");
                                for (int i = 0; i < n6; i++) {
                                    numeros6[i] = entrada.nextInt();
                                }
                                int moda = Moda.calcularModa(numeros6);
                                System.out.println("La moda es: " + moda);

                        break;

                    case 7:

                        break;

                    case 8:

                        break;

                    case 9:

                        break;

                    case 10:
                        break;

                    default:
                        System.out.println("Ésta opción es inválida");
                        break;

                }
            } while (resp < 10) ;
        }
}
