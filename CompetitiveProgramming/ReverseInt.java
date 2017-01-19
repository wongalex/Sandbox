public int reverse(int x) {
	int sign = 0;
	if(x < 0) {
		sign = -1;
	}
	else {
		sign = 1;
	}
	x = Math.abs(x);
	long num = 0;
	while(x != 0) {
		num *= 10;
		num += x % 10;
		x /= 10;
	}
	if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
		return 0;
	}

	return (int)num * sign;
}