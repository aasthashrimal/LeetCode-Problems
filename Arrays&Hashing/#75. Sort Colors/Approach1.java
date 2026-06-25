class Solution {
    public void sortColors(int[] nums) {
        int low = 0, high = nums.length - 1, mid = 0;

        while(mid <= high){
            switch (nums[mid]) {
                case 0 ->                     {
                        int t = nums[mid];
                        nums[mid] = nums[low];
                        nums[low] = t;
                        low++;
                        mid++;
                    }
                case 2 ->                     {
                        int t = nums[mid];
                        nums[mid] = nums[high];
                        nums[high] = t;
                        high--;
                    }
                default -> mid++;
            }
        }
    }
}
