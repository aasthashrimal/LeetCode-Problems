class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        int num1 = -1, num2 = -1, count1=0, count2=0;

        for(int num: nums){
            if(num == num1) count1++;
            else if(num == num2) count2++;
            else if(count1==0){
                num1 = num;
                count1++;
            }
            else if(count2==0){
                num2 = num;
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        int freq1 = 0, freq2 = 0;
        for(int num: nums){
            if(num == num1) freq1++;
            if(num == num2) freq2++;
        }

        if(freq1 > nums.length/3) list.add(num1);
        if(num2!=num1 && freq2 > nums.length/3) list.add(num2);

        return list;
    }
}
