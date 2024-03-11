public int powerOf10(int n) {
    if (n == 0) {
        return 1;
    }
    return powerOf10(n-1) * 10;
}
