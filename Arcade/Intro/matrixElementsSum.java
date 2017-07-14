int matrixElementsSum(int[][] matrix) {
    int sum = 0;
    ArrayList list = new ArrayList();
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (list.contains(j)) {
                continue;
            } else {
              sum += matrix[i][j];
            }
        }
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == 0) {
                list.add(j);
            }
        }
    }
    return sum;
}