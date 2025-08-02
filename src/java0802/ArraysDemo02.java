package java0802;

public class ArraysDemo02 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5}, {6}};
        for (int i = 0; i < 3; i++) {  // 這裡假設欄位最多是3
            System.out.println("Column " + i + " sum: " + sumColumn(matrix, i));
        }
    }

    public static int sumColumn(int[][] matrix, int colIndex) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // 檢查每一列是否有該欄位，避免陣列越界
            if (matrix[i].length > colIndex) {
                sum += matrix[i][colIndex];
            }
        }
        return sum;
    }
}
