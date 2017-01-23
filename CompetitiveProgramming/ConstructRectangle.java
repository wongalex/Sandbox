public int[] constructRectangle(int area) {
	int n = (int)Math.sqrt(area) + 1;
	int[] dimensions = new int[2];
	int minDifference = Integer.MAX_VALUE;
	if (area == 1) {
		dimensions[0] = 1;
		dimensions[1] = 1;
		return dimensions;
	}
	for (int i = 1; i < n; i++) {
		if(area % i == 0 && (area / i) - i < minDifference) {
			dimensions[0] = area / i;
			dimensions[1] = i;
			minDifference = (area / i) - i;
		}
	}
	return dimensions;
}