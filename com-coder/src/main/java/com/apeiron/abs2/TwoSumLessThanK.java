package com.apeiron.abs2;

class TwoSumLessThanK {

    public static void main(String[] args) {
        int numbers[] = {34, 23, 1, 24, 75, 33, 54, 8};
        int targetVal = 60;
        int answer = new TwoSumLessThanK().twoSumLessThanK(numbers, targetVal);
        System.out.println("Output is " + answer);

    }

    public int twoSumLessThanK(int[] nums, int targetVal) {
        int correctAnswer = -1;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum < targetVal) {
                    if (correctAnswer < sum) {
                        correctAnswer = sum;
                    }
                }
            } // end of j
        } // end of i
        return correctAnswer;
    }
}