package implementations;

import java.util.Arrays;

public class ArrayWorker {
    public void printPrimalElements(int[] array) {
        boolean isPrimal;
        for (int i = 0; i < array.length; i++) {
            isPrimal = true;
            for (int j = 2; j < Math.sqrt(array[i]); j++) {
                if(array[i]%j==0) {
                    isPrimal=false;
                    break;
                }
            }
            if(isPrimal) System.out.println(i);
        }
    }

    public int getMinNotGrownElements(int[] array) {
        int countNotGrowElements, minCountNotGrowElements = array.length, offset;
        for (int i = 0; i < array.length-1; i++) {
            countNotGrowElements = i;
            offset = 0;
            for (int j = i+1; j < array.length; j++) {
                if(array[j-1-offset]>array[j]) {
                    offset++;
                    countNotGrowElements++;
                }
                else offset = 0;
            }
            if(countNotGrowElements<minCountNotGrowElements)
                minCountNotGrowElements = countNotGrowElements;
        }
        return minCountNotGrowElements;
    }

    public double[][] getNMatrix(double[] array) {
        double[][] matrix = new double[array.length][array.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = array[(j+i)%array.length];
            }
        }
        return matrix;
    }

    public void shellSort(double[] array) {
        int i = 0;
        double swapElement;
        while (i<array.length-1) {
            if(array[i]<=array[i+1]) i++;
            else {
                swapElement = array[i];
                array[i] = array[i+1];
                array[i+1] = swapElement;
                i = Math.max(0,i-1);
            }
        }
    }

    public int[] mergeArrays(double[] a, double[] b) {
        int[] placesToAddBElements = new int[b.length];
        int iB = 0, place = 0;
        for (int i = 0; i < a.length; i++, place++) {
            while(b[iB] <= a[i]) {
                placesToAddBElements[iB++] = place++;
                if(iB>=placesToAddBElements.length) return placesToAddBElements;
            }
        }
        for (int i = iB; i < placesToAddBElements.length; i++, place++) {
            placesToAddBElements[i] = place;
        }
        return placesToAddBElements;
    }
}
