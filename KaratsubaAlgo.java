class Main {
        public static long karatsuba(long x, long y) {
            if (x < 10 || y < 10) {
                return x * y;
            }

            int n = Math.max(Long.toString(x).length(), Long.toString(y).length());
            int m = n / 2;

            long xHigh = x / (long) Math.pow(10, m);
            long xLow = x % (long) Math.pow(10, m);

            long yHigh = y / (long) Math.pow(10, m);
            long yLow = y % (long) Math.pow(10, m);

            long z0 = karatsuba(xLow, yLow);
            long z1 = karatsuba(xHigh + xLow, yHigh + yLow);
            long z2 = karatsuba(xHigh, yHigh);

            return z2 * (long) Math.pow(10, 2 * m) + (z1 - z2 - z0) * (long) Math.pow(10, m) + z0;
        }

    public static void main(String[] args) {
        System.out.println(karatsuba(102020202,1020929010));
    }
}
