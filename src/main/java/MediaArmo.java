public class MediaArmo {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número de elementos: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.print("Ingrese los elementos: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        double mA = mediaArmonica(nums.length, nums);
        System.out.println("media armónica: " + mA);
        scanner.close();
    }*/

    public static double mediaArmonica(int n, int... nums) {
        if (n == 1) {
            return nums[0];
        } else {
            return (n - 1) / ((1.0 / nums[n - 1]) + (1.0 / mediaArmonica(n - 1, nums)));
        }
    }

    public static double calcularRango(int[] numeros) {
        // Primero, encontramos el valor máximo y mínimo en el array
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
        // Ahora que tenemos el valor máximo y mínimo, podemos calcular el rango
        double rango = max - min;
        return rango;
    }

}