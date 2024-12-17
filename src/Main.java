import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        subSequenceAG();
        leaderInArray();
        subArrayMaxMin();
        bestTimeToBuySell();
    }

    private static void bestTimeToBuySell() {

        int[] arr= ;
        int max = arr[0];
        int min = arr[0];
        int count=0;


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }
            if (arr[i] < min) {
                min = arr[i];
                count++;
            }
        }
        System.out.println("max profit is: "+(max-min));


    }

    private static void subArrayMaxMin() {
        int[] arr = {8,8,8,8,8,8};
        int max = arr[0];
        int min = arr[0];
        int count=0;
        int ans = arr.length;
        int maxIndex=-1;
        int minIndex=-1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }
            if (arr[i] < min) {
                min = arr[i];
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                maxIndex=i;
                if(minIndex>0){
                    ans=Math.abs(maxIndex-minIndex) +1;
                }
            }
            if(arr[i]==min){
                minIndex=i;
                if(maxIndex>0){
                    ans=Math.abs(maxIndex-minIndex) +1;
                }
            }

        }
        System.out.println("subArrayMaxMin count is: "+ans);
    }

    private static void leaderInArray() {
        int[] arr= {1,5,2,6,4,8};
        int max=arr[0];
        int count=1;

        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                count++;
            }
        }
        System.out.println("leader in the array count is: "+count);
    }

    private static void subSequenceAG() {
        int count=0;
        int ans=0;
        String ag="GAG";
        for(int i=0;i<ag.length();i++){
            if(ag.charAt(i)=='G'){
                ans=ans+count;
            }
            if(ag.charAt(i)=='A'){
                count++;
            }
        }
        System.out.println("AG count is: "+ ans);
    }
}