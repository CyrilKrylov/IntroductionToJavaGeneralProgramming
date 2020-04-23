import onedementional_array.taks.*;

import java.util.Arrays;


public class AlgoritmisationApp {

    public static void main(String[] args) {
        //Task1
        /*System.out.println(Task1.getSumOfElementsStream(new int[]{1,2,3,4,5,6,7,8,9},9));
        System.out.println(Task1.getSumOfElements(new int[]{1,2,3,4,5,6,7,8,9},9));
        //Task2
        double[] inputD = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Task2.replaceOnZ(inputD,5));
        Arrays.stream(inputD).forEach(value -> System.out.print(value+" "));
        System.out.println();
        Task3.countNumbers(new float[]{1,-1,2,-2,3,-3,0,1.1F,-1.1F,2.1F,-2.2F,0,0,0,0});
        double[] inputDForSwap = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Task4.swapMinMax(inputDForSwap);
        Arrays.stream(inputDForSwap).forEach(value -> System.out.print(value+" "));
        System.out.println();
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 0};
        Task5.printIf(array);*/
        double[] sdf = new double[10];
        for (int i = 0; i < sdf.length; i++) {
            sdf[i] = i + 1;
        }
        System.out.println(Task6.sumOfSequenceNumbers(sdf));

    }

}
