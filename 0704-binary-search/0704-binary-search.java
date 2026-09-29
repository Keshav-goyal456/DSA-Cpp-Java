class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;

        return binarysearch(nums, target, low, high);
    }

    int binarysearch(int[] nums, int target, int low, int high){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            } else if(nums[mid]>target){
                return binarysearch(nums, target, low, mid-1);
            } else{
                return binarysearch(nums, target, mid+1, high);
            }
        }
        return -1;
    }
}