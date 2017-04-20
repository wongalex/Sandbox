public boolean checkPerfectNumber(int num) {
    if (num < 5) {
        return false;
    }
    int sqrt = (int)Math.sqrt(num);
    int sum = 1;
    for (int i = 2; i <= sqrt; i++) {
        if (num % i == 0) {
            sum += (num / i);
            sum += i;
            if (sum > num) {
                return false;
            }
        }
    }
    if (sum == num) {
        return true;
    }
    return false;
}
