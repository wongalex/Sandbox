public int reverseBits(int n) {
	int solution = 0;
	for (int i = 0; i < 32; i++) {
		solution = solution << 1;
		solution += ((n >> i) & 1);
	}
	return solution;
}