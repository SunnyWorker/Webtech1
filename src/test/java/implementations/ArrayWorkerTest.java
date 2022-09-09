package implementations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ArrayWorkerTest {

    static ArrayWorker arrayWorker;

    @BeforeAll
    public static void initial() {
        arrayWorker = new ArrayWorker();
    }

    @Test
    void printPrimalElements() {

    }

    @Test
    void getMinNotGrownElements() {
        int[][] array = new int[][]{{1,0,2,3},{2,1,9,8},{10,9,8,7}};
        Assertions.assertEquals(1, arrayWorker.getMinNotGrownElements(array[0]));
        Assertions.assertEquals(2, arrayWorker.getMinNotGrownElements(array[1]));
        Assertions.assertEquals(3, arrayWorker.getMinNotGrownElements(array[2]));
    }

    @Test
    void getNMatrix() {
        double[] array = new double[]{1,2,3,4};
        double[][] matrix = arrayWorker.getNMatrix(array);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    @Test
    void shellSort() {
        double[][] a = new double[][]{{4,1,3,12},{0,3,4},{10,9,8,7}};
        for (int i = 0; i < a.length; i++) {
            arrayWorker.shellSort(a[i]);
        }
        double[][] expectedResults = new double[][]{
                {1,3,4,12},
                {0,3,4},
                {7,8,9,10}
        };
        Assertions.assertTrue(Arrays.deepEquals(expectedResults,a));
    }

    @Test
    void mergeArrays() {
        double[][] a = new double[][]{{1},{0,3,4},{0,0,0}};
        double[][] b = new double[][]{{2,3},{1,2,5},{-1}};
        int[][] results = new int[][]{
                arrayWorker.mergeArrays(a[0],b[0]),
                arrayWorker.mergeArrays(a[1],b[1]),
                arrayWorker.mergeArrays(a[2],b[2])
        };
        int[][] expectedResults = new int[][]{
                {1,2},
                {1,2,5},
                {0}
        };
            Assertions.assertTrue(Arrays.deepEquals(expectedResults,results));
    }
}