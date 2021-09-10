package com.apeiron.abs2;

class SortedTwoSum {
//    static int numbers[] = {2, 7, 11, 15};
//    static int target = 9;

    static int numbers[] = {0, 0, 3, 4};
    static int target = 9;

    public static void main(String[] args) {
        System.out.println(new SortedTwoSum().twoSum(numbers, target)[0] +" " +
                new SortedTwoSum().twoSum(numbers, target)[1]);

        System.out.println(new SortedTwoSum().twoSumLCS(numbers, target)[0] +" " +
                new SortedTwoSum().twoSumLCS(numbers, target)[1]);

        System.out.println(new SortedTwoSum().twoSumForLoopStrategy(numbers, target)[0] +" " +
                new SortedTwoSum().twoSumForLoopStrategy(numbers, target)[1]);
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        boolean answerFound = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i==j){
                    continue;
                }
                if (numbers[i] + numbers[j] == target) {
                    answerFound = true;
                    output[0] = i + 1;
                    output[1] = j + 1;
                    break;
                }
            }
            if(answerFound){
                break;
            }
        }
        if(!answerFound){
            output[0] = -1;
            output[1] = -1;
        }
        return output;
    }

    public int[] twoSumLCS(int[] numbers, int target){
        int low = 0;
        int high = numbers.length - 1;
        int[] output = new int[2];
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                output[0] = low + 1;
                output[1] = high + 1;
                return output;
            } else if (sum < target) {
                ++low;
            } else {
                --high;
            }
        }
        // In case there is no solution, return {-1, -1}.
        output[0] = -1;
        output[1] = -1;
        return output;
    }

    public int[] twoSumForLoopStrategy(int[] input, int target) {
        int output[] = new int[2];
        boolean answerFound = false;
        for (int i = 0; i < input.length; i++) {
            for (int j = input.length-1; j > 0; j--) {
                if (input[i] + input[j] == target) {
                    output[0] = i + 1;
                    output[1] = j + 1;
                    answerFound = true;
                }
            }
        }
        if(!answerFound){
            output[0] = -1;
            output[1] = -1;
        }
        return output;
    }

}