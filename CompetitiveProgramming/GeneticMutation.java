char[] letters;
public int minMutation(String start, String end, String[] bank) {
    if (start.equals(end)) {
        return 0;
    }
    letters = "ACGT".toCharArray();
    Set<String> hashBank = new HashSet<String>();
    for(String s : bank) {
        hashBank.add(s);
        System.out.println(s);
    }
    Map<String, Integer> minMutations = new HashMap<String, Integer>();
    char[] sArray = start.toCharArray();
    for (int i = 0; i < sArray.length; i++) {
        char temp = sArray[i];
        for (char c : letters) {
            if (temp != c) {
                sArray[i] = c;
                min(String.valueOf(sArray), end, 1, hashBank, minMutations);
            }
        }
        sArray[i] = temp;
    }
    min(start, end, 0, hashBank, minMutations);
    if (!minMutations.containsKey(end)) {
        return -1;
    }
    return minMutations.get(end);
}

private void min(String start, String end, int mutations, Set<String> hashBank, Map<String, Integer> minMutations) {
    if (hashBank.contains(start)) {
        if (minMutations.containsKey(start) && minMutations.get(start) < mutations) {
            return;
        }
        minMutations.put(start, mutations);
        if (start.equals(end)) {
            return;
        }
        char[] sArray = start.toCharArray();
        for (int i = 0; i < sArray.length; i++) {
            char temp = sArray[i];
            for (char c : letters) {
                System.out.println(c);
                if (temp != c) {
                    sArray[i] = c;
                    min(String.valueOf(sArray), end, mutations + 1, hashBank, minMutations);
                }
            }
            sArray[i] = temp;
        }
        return;
    } else {
        return;
    }

}
