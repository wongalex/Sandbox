public int findPoisonedDuration(int[] timeSeries, int duration) {
	if (timeSeries.length == 0 || duration < 1) {
		return 0;
	}
	int totalDuration = 0;
	int currentStartTime = timeSeries[0];
	int currentEndTime = timeSeries[0] + duration - 1;
	for (int i = 1; i < timeSeries.length; i++) {
		if (timeSeries[i] <= currentEndTime) {
			currentEndTime = timeSeries[i] + duration - 1;
		} else {
			totalDuration += (currentEndTime - currentStartTime + 1);
			currentStartTime = timeSeries[i];
			currentEndTime = timeSeries[i] + duration - 1;
		}
	}
	totalDuration += (currentEndTime - currentStartTime + 1);
	return totalDuration;
}