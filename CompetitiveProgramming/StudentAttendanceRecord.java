public boolean checkRecord(String s) {
    int numA = 0;
    int numL = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'A') {
            numA++;
            numL = 0;
            if (numA > 1) {
                return false;
            }
        } else if (s.charAt(i) == 'L') {
            numL++;
            if (numL > 2) {
                return false;
            }
        } else {
            numL = 0;
        }
    }
    return true;
}
