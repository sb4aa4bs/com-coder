package com.apeiron.abs2;

class TwoSum {
    int [] output = new int[2];
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    output[0] = i;
                    output[1] = j;
                    break;
                }
            }
        }
        return output;
    }
}

//[2,7,11,15] 9
//[3,2,4] 6
//[3,3] 6