public int leastBricks(List<List<Integer>> wall) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < wall.size(); i++) {
        List<Integer> row = wall.get(i);
        int rowSize = row.size();
        int sum = 0;
        for (int j = 0; j < rowSize - 1; j++) {
            sum += row.get(j);
            if (!map.containsKey(sum)) {
                map.put(sum, 1);
            } else {
                map.put(sum, map.get(sum) + 1);
            }
        }
    }
    int maxSize = 0;
    for (int length : map.keySet()) {
        if (map.get(length) > maxSize) {
            maxSize = map.get(length);
        }
    }
    return wall.size() - maxSize;
}
