int adjacentElementsProduct(int[] inputArray) {
    int max = Integer.MIN_VALUE;
    int result;

    for (int i = 0; i < inputArray.length - 1; i++) {

        result = inputArray[i] * inputArray[i + 1];

        if (max < result) {
            max = result;
        }
    }

    return max;
}