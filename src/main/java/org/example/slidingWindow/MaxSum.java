package org.example.slidingWindow;
/*
Sliding Window Concept
Instead of using nested loops (which gives O(n²) time), the sliding window lets you move a “window” across the array and reuse previous calculations to keep it O(n).
 Input
    arr = [2, 1, 5, 1, 3, 2], k = 3
Out put
9  // because [5, 1, 3] is the subarray with max sum


 */
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
