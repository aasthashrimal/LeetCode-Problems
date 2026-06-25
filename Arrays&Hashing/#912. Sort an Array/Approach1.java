class Solution {

    public int[] merge(int left[], int right[]){
        int n = left.length, m = right.length;
        int nums[] = new int[m+n];
        int i=0, j=0, k=0;

        while(i<n && j<m){
            if(left[i] < right[j]) nums[k++] = left[i++];
            else nums[k++] = right[j++];
        }

        if(i==n){
            while(k<m+n) nums[k++] = right[j++];
        }else{
            while(k<m+n) nums[k++] = left[i++];
        }

        return nums;
    }

    public int[] sortArray(int[] nums) {
        if(nums.length <= 1) return nums;

        int left[] = new int[nums.length/2];
        int right[] = new int[nums.length - left.length];
        int n = nums.length;

        for(int i=0; i<n/2; i++)    left[i] = nums[i];
        for(int i=n/2; i<n; i++)    right[i-n/2] = nums[i];

        left = sortArray(left);
        right = sortArray(right);
        nums = merge(left, right);

        return nums;
    }
}
