public int singleNumber(int[] nums) {
	int x = 0;
	int y = 0;
	for(int z : nums) {
		x = (~x & ~y & z) | (x & ~y & ~z);
		y = (~x & ~y & z) | (~x & y & ~z);
	}
	return x | y;
}