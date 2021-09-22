package com.Practisetests.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String args[]) {
    }
        public List<List<Integer>> threeSum(int[] nums) {
            HashSet<List<Integer>> output = new HashSet<>();
            Arrays.sort(nums);
            int n = nums.length;
            for(int i = 0; i < n - 2; i++) {
                int left = i + 1, right = n - 1;
                while(left < right){
                    int currentSum = nums[i] + nums[left] + nums[right];
                    if(currentSum == 0) {
                        output.add(new ArrayList<>(Arrays.asList(nums[i], nums[left ++], nums[right --])));
                    } else if(currentSum < 0) {
                        left ++;
                    } else {
                        right --;
                    }
                }
            }
            return new ArrayList<>(output);
        }
    }

