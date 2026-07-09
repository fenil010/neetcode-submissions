class Solution {


    private void swap(int[] nums,int a ,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int left = 0 ,right = nums.length-1,i=0;
        while(i<=right){
            if(nums[i]==0){
                swap(nums,i,left);
                left++;
                i++;
            }
            else if (nums[i]==2){
                swap(nums,i,right);
                right--;
            }
            else{
                i++;
            }
        }
    }
}