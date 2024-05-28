/*
Leetcode Problem 35. Search Insert Position (Easy)
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity. 

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
*/

public class SearchInsertPosition
  {
    public int searchInsert(int[] nums, int target) {
      if(nums == null || nums.length == 0)
        {
            return 0;
        }

        if(target > nums[nums.length-1])
        {
            return nums.length;
        }

        int start = 0;
        int end = nums.length;

        while(start<end)
        {
            int mid = start + (end-start)/2;

            if(target == nums[mid])
            {
                return mid;
            }
            else if(target > nums[mid])
            {
                start = mid+1;
            }
            else if(target < nums[mid])
            {
                end = mid;
            }
        }

        return end;
    }
  }
















