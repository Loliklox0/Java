import java.util.Arrays;
import java.util.Random;

public class Lab7 {

    static Random random = new Random();

    public static void sumNegativeA20() {
        int[] A = new int[20];
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(41) - 20;
            if (A[i] < 0) sum += A[i];
        }

        System.out.println("1) Сумма отрицательных A[20]: " + sum);
    }

    public static void sumPositiveB15() {
        int[] B = new int[15];
        int sum = 0;

        for (int i = 0; i < B.length; i++) {
            B[i] = random.nextInt(41) - 20;
            if (B[i] > 0) sum += B[i];
        }

        System.out.println("2) Сумма положительных B[15]: " + sum);
    }

    public static void productNegativeA12() {
        double[] A = new double[12];
        double product = 1;
        boolean found = false;

        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextDouble() * 20 - 10;
            if (A[i] < 0) {
                product *= A[i];
                found = true;
            }
        }

        System.out.println("3) Произведение отрицательных A[12]: " + (found ? product : 0));
    }

    public static void productPositiveC25() {
        int[] C = new int[25];
        long product = 1;
        boolean found = false;

        for (int i = 0; i < C.length; i++) {
            C[i] = random.nextInt(21) - 10;
            if (C[i] > 0) {
                product *= C[i];
                found = true;
            }
        }

        System.out.println("4) Произведение положительных C[25]: " + (found ? product : 0));
    }

    public static void averageD17() {
        int[] D = new int[17];
        int sum = 0;

        for (int i = 0; i < D.length; i++) {
            D[i] = random.nextInt(50);
            sum += D[i];
        }

        System.out.println("5) Среднее D[17]: " + (double) sum / D.length);
    }

    public static void sumNegativeRows10x10() {
        int[][] A = new int[10][10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                A[i][j] = random.nextInt(21) - 10;
                if (A[i][j] < 0) B[i] += A[i][j];
            }
        }

        System.out.println("6) Сумма отрицательных по строкам: " + Arrays.toString(B));
    }

    public static void sumPositiveRows5x5() {
        int[][] B = new int[5][5];
        int[] A = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                B[i][j] = random.nextInt(21) - 10;
                if (B[i][j] > 0) A[i] += B[i][j];
            }
        }

        System.out.println("7) Сумма положительных по строкам: " + Arrays.toString(A));
    }

    public static void productNegativeColumns12x6() {
        int[][] A = new int[12][6];
        int[] product = new int[6];
        Arrays.fill(product, 1);

        for (int j = 0; j < 6; j++) {
            boolean found = false;
            for (int i = 0; i < 12; i++) {
                A[i][j] = random.nextInt(21) - 10;
                if (A[i][j] < 0) {
                    product[j] *= A[i][j];
                    found = true;
                }
            }
            if (!found) product[j] = 0;
        }

        System.out.println("8) Произведение отрицательных по столбцам: " + Arrays.toString(product));
    }

    public static void productDiagonal5x5() {
        int[][] C = new int[5][5];
        int product = 1;
        boolean found = false;

        for (int i = 0; i < 5; i++) {
            C[i][i] = random.nextInt(21) - 10;
            if (C[i][i] > 0) {
                product *= C[i][i];
                found = true;
            }
        }

        System.out.println("9) Произведение положительных диагонали: " + (found ? product : 0));
    }

    public static void averageDiagonal7x7() {
        int[][] D = new int[7][7];
        int sum = 0;

        for (int i = 0; i < 7; i++) {
            D[i][i] = random.nextInt(50);
            sum += D[i][i];
        }

        System.out.println("10) Среднее диагонали: " + (double) sum / 7);
    }

    public static void swapMinMax() {
        int[] A = new int[25];

        for (int i = 0; i < A.length; i++)
            A[i] = random.nextInt(100);

        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[minIndex]) minIndex = i;
            if (A[i] > A[maxIndex]) maxIndex = i;
        }

        int temp = A[minIndex];
        A[minIndex] = A[maxIndex];
        A[maxIndex] = temp;

        System.out.println("11) После замены min/max: " + Arrays.toString(A));
    }

    public static void sortB25() {
        int[] B = new int[25];

        for (int i = 0; i < B.length; i++)
            B[i] = random.nextInt(100);

        Arrays.sort(B);

        System.out.println("12) Отсортированный B[25]: " + Arrays.toString(B));
    }

    public static void averageC20() {
        int[] C = new int[20];
        int sum = 0;

        for (int i = 0; i < C.length; i++) {
            C[i] = random.nextInt(50);
            sum += C[i];
        }

        System.out.println("13) Среднее C[20]: " + (double) sum / C.length);
    }

    public static void sumEvenOddD30() {
        int[] D = new int[30];
        int even = 0, odd = 0;

        for (int i = 0; i < D.length; i++) {
            D[i] = random.nextInt(50);
            if (D[i] % 2 == 0) even += D[i];
            else odd += D[i];
        }

        System.out.println("14) Сумма чётных: " + even + ", нечётных: " + odd);
    }

    public static void table3x5() {
        int[][] a = new int[3][5];

        System.out.println("15) Таблица 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = random.nextInt(10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int maxX() {
        int[] array = new int[10];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            if (array[i] > max) max = array[i];
        }

        return max;
    }

    public static void stringTask() {
        String s1 = "Hello ";
        String s2 = "World";
        String s3 = "Java";
        String s4 = "test";
        String s5 = "test";

        if (s4.equals(s5))
            System.out.println("17) Результат: " + s1 + s2);
        else
            System.out.println("17) Результат: " + s1 + s3);
    }

    public static void main(String[] args) {

        sumNegativeA20();
        sumPositiveB15();
        productNegativeA12();
        productPositiveC25();
        averageD17();
        sumNegativeRows10x10();
        sumPositiveRows5x5();
        productNegativeColumns12x6();
        productDiagonal5x5();
        averageDiagonal7x7();
        swapMinMax();
        sortB25();
        averageC20();
        sumEvenOddD30();
        table3x5();
        System.out.println("16) Максимальный элемент: " + maxX());
        stringTask();
    }
}