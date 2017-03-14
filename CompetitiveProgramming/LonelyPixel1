public int findLonelyPixel(char[][] picture) {
    int count = 0;
    if (picture.length == 0) {
        return count;
    }
    int[] rows = new int[picture.length];
    int[] columns = new int[picture[0].length];
    for (int i = 0; i < picture.length; i++) {
        for (int j = 0; j < picture[i].length; j++) {
            if (picture[i][j] == 'B') {
                rows[i]++;
                columns[j]++;
            }
        }
    }
    for (int i = 0; i < picture.length; i++) {
        for (int j = 0; j < picture[i].length; j++) {
            if (rows[i] == 1 && columns[j] == 1 && picture[i][j] == 'B') {
                count++;
            }
        }
    }
    return count;
}
