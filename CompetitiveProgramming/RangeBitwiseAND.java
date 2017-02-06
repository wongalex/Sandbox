public int rangeBitwiseAnd(int m, int n) {
	if (m == n) {
		return m;
	}
	int diff = n - m;
	int solution = 0;
	for (int i = 0; i < 31; i++) {
		solution += (m & n & (1 << i));
	}
	int bitShiftLeft = 0;
	while (diff != 0) {
		diff = diff >>> 1;
		bitShiftLeft++;
	}
	return (solution & (Integer.MAX_VALUE << bitShiftLeft));
}