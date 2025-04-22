package org.example.HashProblem;

import java.util.*;

/*Problem Statement:
Given an array of integers nums and a target sum target, write a Java function to find all unique pairs of numbers in the array that add up to the target sum.

        Requirements:
Return all pairs in ascending order (e.g., [1, 4] instead of [4, 1]).

Each pair should be unique (no duplicates).
Input: nums = [2, 7, 11, 15, 3, 6, 5], target = 9
Output: [[2, 7], [3, 6]]
Explanation:
- 2 + 7 = 9
- 3 + 6 = 9
*/
public class FindSumPaire {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 3, 6, 5,4,7,5};
        int target = 9;
        System.out.println(findPairsWithSum(nums, target)); // Output: [[2, 7], [3, 6]]
    }

    public static List<List<Integer>> findPairsWithSum(int[] nums, int target) {
        Arrays.sort(nums); // Ensure pairs are in ascending order
       List <List<Integer>> result=new ArrayList<>();
       int complement=0;
               int left=0,right=nums.length-1;
               while(left<right)
               {
                   int sum=nums[left]+nums[right];
                   if(sum==target){
                       result.add(Arrays.asList(nums[left],nums[right]));
                       left++;
                       right--;
                   }else if(sum<target){
                       left++;
                   }else{
                       right--;
                   }
               }




        return  result;
    }
}


