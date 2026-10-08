class Solution {
    public int findLengthOfLCIS(int[] nums) {
      if(nums.length==1) return 1;
      int count=1;
      int max_len=0;
      for(int i=0;i<nums.length-1;i++){
      if(nums[i]<nums[i+1]){
        count++;
      }else{
        count=1;
      }
      max_len=  Math.max(max_len,count);
      } 
      int  max=max_len; 
      return max_len;
    }
}