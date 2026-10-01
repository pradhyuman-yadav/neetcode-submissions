class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length == 0 || target < matrix[0][0]) return false;
        if(matrix.length == 1 && matrix[0].length == 1) return matrix[0][0] == target;

        int sizeI = matrix.length;
        int sizeJ = matrix[0].length;

        int rowStart = 0;
        int rowEnd = sizeJ-1;

        int row = 0;

        while (target > matrix[row][rowStart] && target > matrix[row][rowEnd]) {
            row++;
            if(row == sizeI) return false;
        }

        while(rowStart < rowEnd) {
            int mid = (rowStart+rowEnd)/2;
            if(matrix[row][mid] < target) {
                rowStart = mid+1;
            } else if(matrix[row][mid] > target) {
                rowEnd = mid;
            } else if(matrix[row][mid] == target) {
                return true;
            }
        }

        if(matrix[row][rowStart] == target) return true;
        return false;

    }
}
