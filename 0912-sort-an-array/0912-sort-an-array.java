class Solution {

    public void mergesort(int[] nums, int left, int right){
        if(left<right){
            int mid=left+(right-left)/2;

            mergesort(nums, left, mid);
            mergesort(nums,mid+1,right);

            merge(nums, left, mid , right);
        }
    }

    public void merge(int[] nums,int left,int mid ,int right){
        int i=left;
        int j =mid + 1;

        int[] temp = new int[right - left + 1];
        int k = 0;

        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }else{
                temp[k++]=nums[j++];
            }
        }

        while(i<=mid){
            temp[k++]=nums[i++];
        }

        while(j<=right){
            temp[k++]=nums[j++];
        }

        for(int x=0;x<temp.length;x++){
            nums[left+x]=temp[x];
        }
    }

    public int[] sortArray(int[] nums) {
        int left=0;
        int right=nums.length-1;

        mergesort(nums,left,right);

        return nums;
    }
}