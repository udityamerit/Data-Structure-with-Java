import java.util.*;

public class _2_MaxSubarraySum {

        public static void MaxSumarray(int numbers[]){

                int currSum = 0;
                int maxSum = Integer.MIN_VALUE;

                for(int i = 0; i<numbers.length; i++){
                        int start = i;
                        for(int j = i; j<numbers.length; j++){
                                currSum = 0;
                                int end = j;
                                for(int k = start; k<=end; k++){
                                        currSum += numbers[k];
                                }
                                System.out.println(currSum);  
                                if(maxSum<currSum){
                                        maxSum=currSum;
                                }
                        }
                        
                }
                System.out.println("Max sum of subarray is "+ maxSum);
        }
        public static void main(String[] args) {
                int numbers[] = {2,3,4,5,6,7,8};
                MaxSumarray(numbers);
                
        }
}
