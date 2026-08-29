class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        int comp = num;

        if (num <= 1) {
            return false;
        }

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i == num / i) {
                    sum = sum + i;
                }
                else {
                    sum = sum + i;

                    if (num / i != num) {
                        sum = sum + (num / i);
                    }
                }
            }
        }
        return (comp == sum);
    }
}
