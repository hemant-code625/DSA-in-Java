class FirstMissingPositiveQ {
    public static void main(String[] args) {
        // Range = [1 to n] where n = array length. Therefore, 0 is not taken in first positive missing number

        int[] nums = {3,4,-1,1};
        int ans = firstMissingPositive(nums);
        System.out.println(ans);

    }
    static int firstMissingPositive(int[] nums) {
        int i =0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if(nums[i]>0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
                    }
            else{
                i++;
                    }
                }
        // search for missing number
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                return index+1;
        }

        }return nums.length+1;

    }
    
    static void swap(int[]nums, int f, int s){
        int temp = nums[s];
        nums[s] =nums[f];
        nums[f] = temp;
    }
}