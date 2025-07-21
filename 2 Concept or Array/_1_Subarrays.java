import java.util.*;

public class _1_Subarrays{

        public static void printsubarray(int numbers[], double max_sum, double min_sum){
                for(int i = 0; i<numbers.length; i++){
                        int start = i;
                        for(int j = i; j<numbers.length; j++){
                                // s = 0;
                                int end = j;
                                for(int k = start; k<=end; k++){
                                        System.out.print(numbers[k]+" ");
                                }
                                
                                System.out.println();
                        }
                        System.out.println();
                }
        }
        public static void main(String[] args) {
                int numbers[] = {2,4,6,8,10};
                double min_sum = Double.POSITIVE_INFINITY;
                double max_sum = Double.NEGATIVE_INFINITY;
                printsubarray(numbers, max_sum, min_sum);
        }
}