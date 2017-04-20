public int findSubstringInWraproundString(String p) {
    if (p.length() < 2) {
        return p.length();
    }
    int[] letters = new int[26];
    int sum = 1;
    int count = 1;
    letters[p.charAt(0) - 'a'] = 1;
    for (int i = 1; i < p.length(); i++) {
        if (((p.charAt(i - 1) - 'a' + 1) % 26) == (p.charAt(i) - 'a')) {
            count++;
        } else {
            count = 1;
        }
        if (count > letters[p.charAt(i) - 'a']) {
            sum += (count - letters[p.charAt(i) - 'a']);
            letters[p.charAt(i) - 'a'] = count;
        }
    }
    return sum;
}
