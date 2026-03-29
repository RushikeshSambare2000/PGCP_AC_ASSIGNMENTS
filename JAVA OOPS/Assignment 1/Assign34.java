class Assign34{
    public static void main(String[] args) {

        for (int n = 2; n <= 100; n++) {
            boolean isPrime = true;

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(n + " ");
            }
        }
    }
}