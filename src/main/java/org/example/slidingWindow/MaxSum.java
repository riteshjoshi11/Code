package org.example.slidingWindow;

public class MaxSum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Max sum of subarray of size " + k + ": " + maxSum(arr, k));
    }

    public static int maxSum(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = 0;

        // Calculate the sum of the first window
        for(int i=0;i<arr.length;i++){
            if(i<k) {
                maxSum = maxSum + arr[i];
            }else{
                windowSum=maxSum+arr[i]-arr[i-k+1];
                if(maxSum<windowSum){
                    maxSum=windowSum;
                }
            }
        }

        return maxSum;
    }
}
