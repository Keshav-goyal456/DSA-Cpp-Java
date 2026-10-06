class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int add = 0;
        char[] arr= s.toCharArray();

        for (int i=0;i<arr.length;i++) {
            if (arr[i] == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    add++;
                }
            }
        }

        return add + open;
    }
}