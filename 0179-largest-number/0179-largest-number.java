class Solution {
    public String largestNumber(int[] nums) {
        boolean isZero=true;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                isZero=false;
                break;
            }
        }

        if(isZero){
            return "0";
        }

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                String I=String.valueOf(nums[i]);
                String J=String.valueOf(nums[j]);

                if((J+I).compareTo(I+J) > 0){
                    int temp= nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }

        String s="";

        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }

        return s;
    }
}