int largestNumber(int n) {
    int maxDigit=10;
    for (int i = 1; i < n; i++) {
        maxDigit*=10;
    }
    return maxDigit-1;
}