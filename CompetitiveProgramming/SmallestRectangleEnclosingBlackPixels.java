int xMax = Integer.MIN_VALUE;
int xMin = Integer.MAX_VALUE;
int yMax = Integer.MIN_VALUE;
int yMin = Integer.MAX_VALUE;
public int minArea(char[][] image, int x, int y) {
	if (image.length == 0) {
		return 0;
	}
	boolean[][] visited = new boolean [image.length][image[0].length];
	dfs(image, visited, x, y);
	return (xMax - xMin + 1) * (yMax - yMin + 1);
}

private void dfs(char[][] image, boolean[][] visited, int x, int y) {
	if(x < 0 || y < 0 || x >= image.length || y >= image[0].length || visited[x][y]) {
		return;
	}
	visited[x][y] = true;
	if (image[x][y] == '0') {
		return;
	}
	xMax = Math.max(xMax, x);
	xMin = Math.min(xMin, x);
	yMax = Math.max(yMax, y);
	yMin = Math.min(yMin, y);
	dfs(image, visited, x + 1, y);
	dfs(image, visited, x - 1, y);
	dfs(image, visited, x, y + 1);
	dfs(image, visited, x, y - 1);
	return;
}