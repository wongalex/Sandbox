public int maxPoints(Point[] points) {
	if(points.length < 3) {
		return points.length;
	}
	int max = 0;
	for(int i = 0; i < points.length; i++) {
		Map<Double, Integer> map = new HashMap<Double, Integer>();
		int sameXCoord = 1;
		int samePoints = 0;
		for(int j = 0; j < points.length; j++) {
			if(j != i) {
				if(points[j].y == points[i].y && points[j].x == points[i].x) {
					samePoints++;
				}
				if(points[j].x == points[i].x) {
					sameXCoord++;
					continue;
				}
				double slope = (double)(points[j].y - points[i].y) / (double)(points[j].x - points[i].x);
				if(map.containsKey(slope)) {
					map.put(slope, map.get(slope) + 1);
				}
				else  {
					map.put(slope, 2);
				}
				max = Math.max(max, map.get(slope) + samePoints);
			}
		}
		max = Math.max(max, sameXCoord);
	}
	return max;
}