class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] arr = new int[nums.length][2];
        for(int i=0; i<nums.length; i++){
            arr[i][0] = nums[i];    arr[i][1] = i;
        }
        Arrays.sort(arr, (a,b)->Integer.compare(a[0], b[0]));
        int l=0, r=nums.length-1;
        while(l<r){
            int sum = arr[l][0]+arr[r][0];
            if(sum==target)
                if(arr[l][1]<arr[r][1])
                    return new int[]{arr[l][1], arr[r][1]};
                else
                    return new int[]{arr[r][1], arr[l][1]};
            else if(sum<target)
                l++;
            else
                r--;
        }
        return new int[]{};
    }
}
