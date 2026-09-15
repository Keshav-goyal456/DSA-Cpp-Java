class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n= matrix.length;
        int m=matrix[0].length;

        ArrayList<Integer> arr = new ArrayList<>();

        int srow=0, erow=n-1, scol=0, ecol=m-1;

        while(srow<=erow && scol<=ecol){
            
            for(int i=scol; i<=ecol;i++){
                arr.add(matrix[srow][i]);
            }

            srow++;

            for(int i=srow; i<=erow;i++){
                arr.add(matrix[i][ecol]);
            }

            ecol--;


            if(srow<=erow && scol<=ecol){for(int i=ecol;i>=scol;i--){
                arr.add(matrix[erow][i]);

            }

            erow--;

            for(int i=erow;i>=srow;i--){
                arr.add(matrix[i][scol]);
            }

            scol++;}
        }

        return arr;
    }
}