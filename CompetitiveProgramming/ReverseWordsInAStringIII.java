public String reverseWords(String s) {
    StringBuilder solution = new StringBuilder();
    StringBuilder word = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == ' ') {
            if (word.length() > 0) {
                word.reverse();
                solution.append(word.toString());
                word.setLength(0);
            }
            solution.append(' ');
        } else {
            word.append(s.charAt(i));
        }
    }
    if (word.length() > 0) {
        word.reverse();
        solution.append(word.toString());
    }
    return solution.toString();
}
