public boolean isPowerOfTwo(int n) {
	if (n < 1) {
		return false;
	}
	int bitSet = 0;
	for (int i = 0; i < 31; i++) {
		if (((n >>> i) & 1) == 1) {
			bitSet++;
		}
	}
	if (bitSet == 1) {
		return true;
	} else {
		return false;
	}
}