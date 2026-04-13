package Recursion;

class factorial {

    static int facto(int num) {
        int finalfac = 1;

        if (num < 0) {
            return 0; 
        } else {
            for (int i = 1; i <= num; i++) {
                finalfac = finalfac * i;
            }
            return finalfac;
        }
    }

    public static void main(String[] args) {
        int res = facto(5);
        System.out.println(res); // 120
    }
}