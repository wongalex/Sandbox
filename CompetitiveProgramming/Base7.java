public String convertToBase7(int num) {
    StringBuilder sb = new StringBuilder();
    if (num < 0) {
        sb.append('-');
        num = -num;
    }
    convertToBase7(num, sb);
    return sb.toString();
}

private void convertToBase7(int num, StringBuilder sb) {
    if (num < 7) {
        sb.append(num);
        return;
    } else {
        int mod = num % 7;
        convertToBase7(num / 7, sb);
        sb.append(mod);
        return;
    }
}
