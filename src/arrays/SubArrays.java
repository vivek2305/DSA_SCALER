package arrays;

public class SubArrays {
    public static void main(String[] args) {
        int[] arr={2, 1, 3, 4, 5};
        int b=1;
        int c=3;
        System.out.println(" subarray: ");
        for(int i=0;i<rangeSubArray(arr,b,c).length;i++){
            System.out.print(rangeSubArray(arr,b,c)[i]+" ");
        }

        System.out.println("max sum value in sub array= "+maxSubArraySum(12,arr)); // need to check this method again.
    }

    private static int maxSubArraySum(int x, int[] arr) {
        int[] prefixSum = new int[arr.length];
        int sum=0;
        prefixSum[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i]= prefixSum[i-1] + arr[i];
        }
        sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int subArraySum = prefixSum[j]-prefixSum[i]+arr[i];
                if(subArraySum<=x && subArraySum>sum){
                    sum= subArraySum;
                }
            }
        }

        return sum;
    }

    private static int[] rangeSubArray(int[] arr, int b, int c) {
        int[] ret= new int[c-b+1];
        for(int i=b;i<=c;i++){
            ret[i-b]=arr[i];
        }
        return ret;
    }
}
