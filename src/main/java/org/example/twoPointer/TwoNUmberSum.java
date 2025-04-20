package org.example.twoPointer;
/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target.

Return the indices of the two numbers, added by one (1-based index).

🧪 Example:
text
Copy
Edit
Input: numbers = [2, 7, 11, 15], target = 9
Output: [1, 2]   // because 2 + 7 = 9
 */
public class TwoNUmberSum {
    public static void main(String args[]){
    int numbers[]={2,7,11,15};
        twoSum(numbers,11);

    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // If no solution
    }
}
